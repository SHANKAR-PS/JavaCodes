package basics;

import java.util.Scanner;

public class powerDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in double data type and power");
        double x = sc.nextDouble();//get the number in double data type
        //eg : 2.1000 3
        int n = sc.nextInt();
        double pow = myPow(x,n);
        System.out.println(pow);
        System.out.printf("%.5f",pow); //print that power in only 5 decimal places

    }
    static double myPow(double x ,int n){ //performing power operation
        double num=1;
        if(n==0){
            return 0;
        }
        else{
            for(int i=0;i<n;i++){
                num *= x;
            }
        }

        return num;
    }
}
