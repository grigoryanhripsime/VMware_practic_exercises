package VMware_practic_exercises.Java.Data_Structures;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhoneBook {
    SortedSet<String> names = new TreeSet<>();
    HashSet<Person> list = new HashSet<>();
    class Person {
        public String name;
        public String number;

        public Person(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }
    public void add(String name, String number) {
        int size = list.size();
        list.add(new Person(name, number));
        if (size == list.size()) {
            System.out.println("There is that contact.");
        }
        else {
            System.out.println("New contact was added.");
            names.add(name);
        }
    }
    public Person remove(String number) {
        for (Person i : list) {
            if (i.number == number) {
                if (list.remove(i)) {
                    return i;
                }
            }
        }
        return null;
    }
    public void show() {
        for (String name : names) {
            for (Person i : list) {
                if (name == i.name)
                    System.out.println(i.name + ": " + i.number);
            }
        }
    }
}
