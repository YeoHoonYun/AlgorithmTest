package InterestingDigits;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class InterestingDigitExam {
    public static void main(String[] args) {
        int num = 10;
        InterestingDigits interestingDigits = new InterestingDigits();
        for(int i : interestingDigits.digits(num)){
            System.out.println(i);
        }

        InterestingDigits2 interestingDigits2 = new InterestingDigits2();
        for(int i : interestingDigits2.digits(num)){
            System.out.println(i);
        }
    }
}
