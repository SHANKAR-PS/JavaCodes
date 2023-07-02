package basics;

import java.util.Scanner;

public class stringPlay2 {
    public static void main(String[] args) {

        //Get the input string
        System.out.println("Enter the strings of words");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //you can enter multiple strings

        System.out.println("you entered String :"+str);
        System.out.println("String is converted into character array and prints");
        char[] ch =str.toCharArray(); //String is converted into character array
        for (char c : ch) { //Enhanced for loop is used for printing the elements in char array
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("here the string reverse operation is held");
        StringBuilder rev= new StringBuilder();//using stringBuilder to append
        for(int i=ch.length-1;i>=0;i--){
            rev.append(ch[i]);
        }
        System.out.println(rev);

        //checks the palindrome or not
        if(str.contentEquals(rev)){ //contentEquals method is used to  compare
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}
