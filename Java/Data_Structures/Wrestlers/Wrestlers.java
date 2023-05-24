package VMware_practic_exercises.Java.Data_Structures.Wrestlers;

/*
There are two types of professional wrestlers:
    “babyfaces” (“good guys”),
    “heels” (“bad guys”).
Between any pair of professional wrestlers, there may or may not be a rivalry.
Suppose we have n professional wrestlers and we have a list of r pairs of wrestlers for which there are rivalries.
Give an O(n + r)-time algorithm that determines whether it is possible to designate some of the wrestlers
    as babyfaces and the remainder as heels such that each rivalry is between a babyface and a heel.
If it is possible to perform such a designation, your algorithm should produce it.
*/

//even means babyface
//odd means heel

import java.util.ArrayList;
import java.util.List;

public class Wrestlers {
    public static void main(String[] args) {
        List<List<Integer>> rivalries = new ArrayList<>();
        List<Integer> rivalry = new ArrayList<>();
        rivalry.add(0);
        rivalry.add(1);
        rivalries.add(rivalry);

        rivalry = new ArrayList<>();
        rivalry.add(0);
        rivalry.add(2);
        rivalries.add(rivalry);

        rivalry = new ArrayList<>();
        rivalry.add(1);
        rivalry.add(3);
        rivalries.add(rivalry);

        rivalry = new ArrayList<>();
        rivalry.add(2);
        rivalry.add(3);
        rivalries.add(rivalry);

        List<Character> players = new ArrayList<>();
        players.add('B');
        players.add('H');
        players.add('H');
        players.add('B');

        System.out.println(validation(rivalries, players));
    }

    public static boolean validation(List<List<Integer>> rivalries, List<Character> players) {
        int[] weights = new int[players.size()];
        for (List<Integer> i : rivalries) {
            weights[i.get(1)] ++;
        }

        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < weights.length; i++) {
            if (players.get(i) == 'B' && weights[i] % 2 == 1) {
                return false;
            }
            if (players.get(i) == 'H' && weights[i] % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
