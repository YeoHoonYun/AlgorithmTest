package InterestingDigits;

import java.util.Vector;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class InterestingDigits2 {
    public int[] digits(int base){
        Vector<Integer> v = new Vector<Integer>();

        for(int i =2; i<base; i++){
            if(((base-1)%i)==0) v.add(i);
        }

        int[] ans = new int [v.size()];
        for(int i = 0; i<v.size(); i++) ans[i] = v.get(i);

        return ans;
    }
}
