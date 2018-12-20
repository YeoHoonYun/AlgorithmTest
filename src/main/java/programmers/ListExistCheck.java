package programmers;

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
}
