package KiwiJuiceEasy;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-11
 * Github : https://github.com/YeoHoonYun
 */
public class KiwijuiceEasyExam {
    public static void main(String[] args) {
        int[] capacities = {20, 20};
        int[] bottle = {5, 8};
        int[] fromId = {0};
        int[] toId = {1};
        //result = {0,13}
        KiwiJuiceEasy KiwiJuiceEasy = new KiwiJuiceEasy();
        int[] result = KiwiJuiceEasy.KiwiJuiceFunc(capacities,bottle,fromId,toId);
        for(int i = 0; i <result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
