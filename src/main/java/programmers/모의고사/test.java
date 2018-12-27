package programmers.모의고사;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-27
 * Github : https://github.com/YeoHoonYun
 */
import java.util.Arrays;

public class test {
    public int[] solution(int[] answers) {
        int p1[] = {1,2,3,4,5};
        int p2[] = {2,1,2,3,2,4,2,5};
        int p3[] = {3,3,1,1,2,2,4,4,5,5};

        int jumsu[] = new int[3];

        for(int i=0; i<answers.length; i++){
            int num = answers[i];

            if(p1[i%5] == num) jumsu[0]++;
            if(p2[i%8] == num) jumsu[1]++;
            if(p3[i%10] == num) jumsu[2]++;
        }


        int max = Math.max(jumsu[0], Math.max(jumsu[1], jumsu[2]));
        int answer[] = new int[3];

        for(int i=0; i<3; i++){
            if(max == jumsu[i]){
                answer[i] = i+1;
            }
        }

        return Arrays.stream(answer).filter(e -> e != 0).toArray();
    }
}
/*
    del solution(answers):
        pattern1 = [1,2,3,4,5]
        pattern2 = [2,1,2,3,2,4,2,5]
        pattern3 = [3,3,1,1,2,2,4,4,5,5]
        score = [0,0,0]
        result = []

        for idx, answer in enumerate(answers):
            if answer == pattern1[idx%len(parttern1)]:
                score[0] += 1
            if answer == pattern2[idx%len(parttern2)]:
                socre[1] += 1
            if answer == pattern2[idx%len(parttern3)]:
                socre[2] += 1

        for idx, s in enumerate(score):
            if s == max(score):
                result.append(idx+1)
        return result
 */