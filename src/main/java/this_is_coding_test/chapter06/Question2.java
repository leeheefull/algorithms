package this_is_coding_test.chapter06;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Question2 {    // 성적이 낮은 순서로 학생 출력하기
    public String[] solve(int n, List<Student> students) {
        String[] answer = new String[n];
        Collections.sort(students);

        for (int i = 0; i < n; i++) {
            answer[i] = students.get(i).getName();
        }
        return answer;
    }
}

class Student implements Comparable<Student> {
    private final String name;
    private final int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) {
            return -1;
        }
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}