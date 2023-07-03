package basics;
import java.util.Scanner;
public class numberPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num= sc.nextInt(), reversedNum =0, remainder;
        int on = num;

        while(num!=0){
            remainder = num % 10;
            reversedNum = reversedNum * 10 +remainder;
            num /=10;
        }

        if(on == reversedNum){
            System.out.println(on + " is palindrome");
        }
        else{
            System.out.println(on+" is not palindrome");
        }

    }
}