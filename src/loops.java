public class loops {
    public static void main(String[] args) {
        int value = 0,values = 0;
        System.out.println("Value is "+value);
        System.out.println("While Loop");
        while(value<10){
            System.out.println("While loop iteration "+value);
            value = value+1;
        }
        for (;values<10;values++){
            System.out.println("for loop iteration "+values);
        }
        do{
            System.out.println("Do while loop is executed...");
        }
        while (values > 11);

        System.out.println("Enhanced For loop:");
        String[] games = {"Football","Volleyball","Cricket"};
        for (String game :games){
            System.out.println(game);
        }
    }

}
