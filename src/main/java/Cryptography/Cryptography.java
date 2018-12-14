package Cryptography;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class Cryptography {
    public long encrypt(int[] numbers){
//        int[] test = numbers;
//        long result = 0;
//        long gog = 1;
//        for (int i=0; i < test.length;i++){
//            test[i] = test[i] + 1;
//            for (int j: test){
//                gog = gog * j;
//            }
//            if (result < gog){
//                result = gog;
//            }
//            gog = 0;
//            test = numbers;
//        }
//        return result;
////test
        long ans = 0;
        for(int i = 0; i<numbers.length;i++){
            long temp = 1;
            for(int j = 0; j<numbers.length; j++){
                if(i==j){
                    temp += (numbers[j] + 1);
                }else {
                    temp *= numbers[j];
                }
            }
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}
