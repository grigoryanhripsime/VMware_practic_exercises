package week3;

import java.io.*;
import java.util.Stack;



public class Valid_braces {
    public static boolean check(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stack<Character> stack = new Stack();
        String line = null;

        while ((line = reader.readLine()) != null){
            for (char ch : line.toCharArray()) {
                if (ch == '[' || ch == '{' || ch == '(') {
                    stack.push(ch);
                }
                else if (ch == ']' || ch == '}' || ch == ')') {
                    if (stack.isEmpty())
                        return false;
                    if (ch == ']') {
                        if (stack.pop() != '[') {
                            return false;
                        }
                    }
                    if (ch == '}') {
                        if (stack.pop() != '{') {
                            return false;
                        }
                    }
                    if (ch == ')') {
                        if (stack.pop() != '(') {
                            return false;
                        }
                    }

                }
            }
            if (stack.isEmpty())
                return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\VM_student1\\Desktop\\text.txt");
        System.out.println(check(file));

        System.out.println("End of the program");
    }
}
