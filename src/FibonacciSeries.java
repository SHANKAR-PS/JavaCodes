import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Find the fibonacci series for the given number
        System.out.println("Enter the number to find the fibonacci series :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//num = 7=>13,4
        int f = 0;
        int s = 1;
        int m = 0;
        if (num < 0) {
            System.out.println("Error");
        } else if (num == 0) {
            System.out.println("-1");
        } else {
            System.out.print(f + " " + s);
            for (int i = 2; i < num; i++) {
                m = f + s;
                f = s;
                s = m;
                System.out.print(" " + m + " ");
            }
            System.out.println();
            System.out.println(f + s);

        }
    }
}
