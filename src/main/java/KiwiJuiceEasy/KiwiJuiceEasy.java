package KiwiJuiceEasy;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class KiwiJuiceEasy {

    public int[] KiwiJuiceFunc(int[] capacities,int[] bottle,int[] fromId,int[] toId){
        int[] result = new int[2];

        for(int i=0; i<fromId.length;i++){
            int f = fromId[i];
            int t = toId[i];
            int space = capacities[t]-bottle[t];

            if(space >= bottle[f]){
                int vol = bottle[f];
                bottle[t] += vol;
                bottle[f] = 0;
            }
            else{
                int vol = space;
                bottle[t] += vol;
                bottle[f] -= vol;
            }
            result = bottle;
        }

        return result;
    }


}
