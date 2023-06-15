import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        System.out.println("Enter the number to convert binary: ");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String num = Integer.toBinaryString(n);
        System.out.println("The binary of the given number n is :"+num);
        System.out.println("Count the number of 1's in the number");
        int count =0;
        for(int i =0 ;i<num.length();i++){
            if(num.charAt(i)=='1'){
                count ++;
            }
        }
        System.out.println("The count of 1's in the binary number :"+count+"  avlo than...");
        int bi = Integer.parseInt(num);
        System.out.println(bi);
        int co = 0;
        int cone = 0;
        while(bi>0){
            if(bi%10==0){
                co++;
            }
            else {
                cone++;
            }
            bi /=10;
        }
        System.out.println("0's in number "+co+" 1's in number "+cone);
    }
}
