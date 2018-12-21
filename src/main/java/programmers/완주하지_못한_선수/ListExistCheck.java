package programmers.완주하지_못한_선수;

import java.util.Arrays;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-20
 * Github : https://github.com/YeoHoonYun
 */
public class ListExistCheck {
    public String solution(String[] participant, String[] completion){
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i< completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
    //python
    /*
    def solution(participant, completion):
    num = []
    for i in participant:
        num.append(i)
    for i in participant:
        for j in completion:
            if i == j:
                num.pop(num.index(i))
    answer = num[0]
    return answer
     */
}
