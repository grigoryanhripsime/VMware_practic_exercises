package VMware_practic_exercises.Java.Data_Structures;

import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        System.out.println(common("add", "bdb"));
        anagrams("asa", "blt", "sas", "tlb", "odd", "aas");
    }

    public static HashSet<Character> common(String s1, String s2) {
       HashSet<Character>  set1 = new HashSet<>();
       for (char i : s1.toCharArray()) {
           set1.add(i);
       }
        HashSet<Character>  set2 = new HashSet<>();
        for (char i : s2.toCharArray()) {
            set2.add(i);
        }

        HashSet<Character>  res = new HashSet<>();
        for (char i : set1) {
            if (set2.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }

    public static void anagrams(String ... words) {
        HashSet<HashSet<Character>> res = new HashSet<>();
        HashSet<Character> temp = new HashSet<>();
        for (String i : words) {
            temp.clear();
            for (char ch : i.toCharArray()) {
                temp.add(ch);
            }
            res.add(new HashSet<>(temp));
        }
        for (HashSet<Character> i : res) {
            System.out.print(i.toString() + ": ");
            for (String j : words) {
                boolean check = true;
                for (char ch : i) {
                    if (j.indexOf(ch) == -1) {
                        check = false;
                        break;
                    }
                }
                if (check)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
