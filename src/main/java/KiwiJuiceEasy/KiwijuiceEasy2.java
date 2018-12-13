package KiwiJuiceEasy;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class KiwijuiceEasy2 {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        for(int i = 0; i < fromId.length; i++){
            int f = fromId[i];
            int t = toId[i];

            int vol = Math.min(bottles[f], capacities[t] - bottles[t]);

            bottles[f] -= vol;
            bottles[t] += vol;
        }
        return bottles;
    }
}
