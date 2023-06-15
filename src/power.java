import java.util.*;
public class power {
    public static void main(String[] args) {
        //power of the number
        System.out.println("power of the number:\ngive 2 inputs(number and power)");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        int num=1;
        if (number == 0 && power == 0){
            System.out.println("1");
        }
        else{
            for(int i =0;i<power;i++){
                num *= number;
            }
            System.out.println(number+" power "+power+" is "+num+"  avlo than...");
        }
    }
}
