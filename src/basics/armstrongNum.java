package basics;
//program to check the given is armstrong number or not
public class armstrongNum {
    static boolean armstrong(int number) {
        int nod=(int)Math.log10(number)+1;
        int temp=number;
        int res=0;
        while(temp!=0) {
            int rem=temp%10;
            res+=Math.pow(rem, nod);
            temp/=10;
        }
        System.out.println(res);
        return number == res;
    }

    public static void main(String[] args) {

        int number=1536;
        System.out.println("number "+number);
        if(armstrong(number)) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("not an armstrong number");
        }
    }
}
