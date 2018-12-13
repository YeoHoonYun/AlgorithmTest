package KiwiJuiceEasy;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class KiwiJuiceEasy3 {
    public int[] thPouring(int[] capacities, int[] bottles, int[] fromId, int[] toId){
        for(int i=0; i<fromId.length;i++){
            int sum = bottles[fromId[i]] + bottles[toId[i]];
            bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
            bottles[fromId[i]] = sum - bottles[toId[i]];
        }
        return bottles;
    }
}
