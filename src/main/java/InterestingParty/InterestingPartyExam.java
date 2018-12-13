package InterestingParty;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-13
 * Github : https://github.com/YeoHoonYun
 */
public class InterestingPartyExam {
    public static void main(String[] args) {
        String[] first = {"fisthing", "gardening", "swimming", "fishing"};
        String[] second = {"hunting", "fishing", "fishing", "biting"};
        InterestingParty interestingParty = new InterestingParty();
        System.out.println(interestingParty.bestInvitations(first, second));

        InterestingParty2 interestingParty2 = new InterestingParty2();
        System.out.println(interestingParty2.bestInvitation(first, second));
    }

}
