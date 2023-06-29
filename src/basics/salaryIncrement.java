package basics;
import java.util.Scanner;
public class salaryIncrement {
    public static void main(String[] args) {

        // salary increment by allow
        System.out.println("Salary increment by allow:\n give 3 inputs");
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        double hra = 20.0;
        double hrr= (hra/100)*basic;
        System.out.println((float) hrr);
        double da = 50.0;
        double dar=(da/100)*basic;
        System.out.println((float)dar);
        double pf = 11.0;
        double pfr=(pf/100)*basic;
        System.out.println((float) pfr);
        int allow;
        double result;
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A' -> {
                allow = 1700;
                result = (basic + hrr + dar + allow) - pfr;
                System.out.println((int) Math.round(result) + "  avlo than...");
            }
            case 'B' -> {
                allow = 1500;
                result = (basic + hrr + dar + allow) - pfr;
                System.out.println((int) Math.round(result) + "  avlo than...");
            }
            default -> {
                allow = 1300;
                result = (basic + hrr + dar + allow) - pfr;
                System.out.println((int) Math.round(result) + "  avlo than...");
            }
        }
    }
}
