package programmers;

import java.util.Stack;

public class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        // 결과 값
        int answer = 0;

        // 뽑혀진 인형들의 저장 공간
        Stack<Integer> storage = new Stack<>();

        // moves 한번 씩 읽어 준다.
        for (int move : moves) {
            // 위에서 부터 일직선 검색
            for (int i = 0; i < board.length; i++) {
                // 0이 아닌 경우, 인형으로 간주
                if (board[i][move - 1] != 0) {
                    // 뽑은 인형 저장 공간이 비어있지 않으면서, 가장 위에 있는 인형과 방금 뽑은 인형이 같은 경우
                    if (!storage.isEmpty() && storage.peek().equals(board[i][move - 1])) {
                        // 가장 위에 있는 인형 제거
                        storage.pop();

                        // 가장 위에 있는 인형과 방금 뽑은 인형이 제거됨
                        answer += 2;
                    }

                    // 뽑은 인형 공간이 비어있거나, 가장 위에 있느 인형과 방금 뽑은 인형이 다를 경우
                    else {
                        // 방금 뽑은 인형을 저장 공간에 넣어준다.
                        storage.push(board[i][move - 1]);
                    }

                    // 뽑은 인형은 없어짐
                    board[i][move - 1] = 0;
                    // 더 이상 검색 필요 없음
                    break;
                }
            }
        }
        return answer;
    }
}
