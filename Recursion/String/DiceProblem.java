// You have a standard dice with values from 1 to 6. At every step, you can choose any value between 1 and 6, but the chosen value must not exceed the remaining sum.
//it is given in mazon,use same pattern as subset processed and unprocessed
import java.util.*;

public class A {
    // static void dice(String p, int up) {
    // if (up == 0) {
    // System.out.println(p);
    // return;
    // }
    // for (int i = 1; i <= up; i++) {
    // char ch = (char)('0'+i);
    // dice(p + ch, up - i);
    // }
    // }
    static List<String> dice(String p, int up) {
        if (up == 0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();

        for (int i = 1;i<=6 && i <= up; i++) {
            //the dice value is not go beyond 6 and also the target elemnt is in the range
            char ch = (char) ('0' + i);
            ans.addAll(dice(p+ch, up - i));
        }

        return ans;
    }

    public static void main(String[] args) {
        List<String> li = dice("", 9);
        System.out.println(li);
    }
}
