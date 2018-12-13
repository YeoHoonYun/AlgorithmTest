package InterestingParty;

import java.util.HashMap;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class InterestingParty2 {
    public int bestInvitation (String[] first, String[] second){
        HashMap<String, Integer> dic = new HashMap<String, Integer>();

        for(int i = 0; i < first.length; i++){
            dic.put(first[i], 0);
            dic.put(second[i], 0);
        }
        for(int i = 0; i< first.length; i++){
            dic.put(first[i],dic.get(first[i])+1);
            dic.put(second[i],dic.get(first[i])+1);
        }
        int ans = 0;
        for (String s : dic.keySet()){
            ans = Math.max(ans,dic.get(s));
        }
        return ans;
    }
}
