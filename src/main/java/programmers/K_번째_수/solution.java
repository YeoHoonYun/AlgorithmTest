package programmers.K_번째_수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cjswo9207u@gmail.com on 2019-01-05
 * Github : https://github.com/YeoHoonYun
 */
public class solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[3];
        List<Integer> one;
        int num = 0;
        for(int[] i : commands){
            one = new ArrayList<>();
            for(int j=i[0]-1;j < i[1]; j++){
                one.add(array[j]);
            }
            Collections.sort(one);
            answer[num] = one.get(i[2]-1);
            num++;
        }
        return answer;
        /* 메인 답
            int[] answer = new int[commands.length];
            for(int i=0; i<commands.length; i++){
                int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2]-1];
            }
            return answer;
         */
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        for(int i : new solution().solution(array, commands)){
            System.out.println(i);
        }
    }
}
/*
    def solution(array, commands):
    answer = []
    one = []
    for command in commands:
        one = []
        for i in range(command[0]-1, command[1]):
            one.append(array[i])
        one.sort()
        answer.append(one[command[2]-1])
    return answer
 */