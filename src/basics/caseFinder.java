package basics;

import java.util.Scanner;

public class caseFinder {
        public static void main(String[] args) {

            //Take one character and give output whether the given char is small or upper
            System.out.println("Enter one character and give output whether the given char is small or upper");
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            System.out.println("the char is "+ch);
            if (ch >= 'a' && ch <= 'z'){
                System.out.println("small letter");

            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("upper case");
            }
            else{
                System.out.println("not a alphabet");
            }
            System.out.println("avlo than...");

        }

}
