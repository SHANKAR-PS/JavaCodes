package basics;

//ISGL company question
import java.util.Scanner;

public class normalAddition {
    public static void main(String[] args) {
        //program performs the add like 1,3,6...
        //1,1+2,1+2+3,....
        System.out.println("enter the range of number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =1;
        for (int i = 1; i <= num; i++) {
            System.out.print(count +", ");
            count += i + 1;
        }
    }
}
