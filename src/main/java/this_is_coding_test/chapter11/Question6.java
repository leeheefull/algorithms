package this_is_coding_test.chapter11;

import java.util.*;

public class Question6 {    // 무지의 먹방 라이브
    public int solve(int[] foodTimes, long k) {
        long timeRemaining = 0;
        for (int foodTime : foodTimes) {
            timeRemaining += foodTime;
        }
        if (timeRemaining <= k) {
            return -1;
        }

        Queue<Food> foods = new PriorityQueue<>();
        for (int i = 0; i < foodTimes.length; i++) {
            foods.offer(new Food(i + 1, foodTimes[i]));
        }

        timeRemaining = 0;
        long prevTime = 0;
        long foodCnt = foodTimes.length;

        while (timeRemaining + ((foods.peek().getTime() - prevTime) * foodCnt) <= k) {
            int tmp = foods.poll().getTime();
            timeRemaining += (tmp - prevTime) * foodCnt;
            foodCnt -= 1;
            prevTime = tmp;
        }

        List<Food> answer = new ArrayList<>();
        while (!foods.isEmpty()) {
            answer.add(foods.poll());
        }
        answer.sort(Comparator.comparingInt(Food::getNo));
        return answer.get((int) ((k - timeRemaining) % foodCnt)).getNo();
    }
}

class Food implements Comparable<Food> {
    private final int no;
    private final int time;

    public Food(int no, int time) {
        this.no = no;
        this.time = time;
    }

    public int getNo() {
        return this.no;
    }

    public int getTime() {
        return this.time;
    }

    @Override
    public int compareTo(Food other) {
        return Integer.compare(this.time, other.time);
    }
}