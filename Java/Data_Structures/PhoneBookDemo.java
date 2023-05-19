package VMware_practic_exercises.Java.Data_Structures;

public class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ann", "+374 91 21-21-21");
        phoneBook.add("John", "+374 91 31-31-31");
        phoneBook.add("Alisa", "+374 95 22-22-22");
        phoneBook.show();
        System.out.println("Edited PhoneBook");
        phoneBook.remove("+374 91 31-31-31");
        phoneBook.show();
    }
}
