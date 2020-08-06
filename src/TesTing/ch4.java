package TesTing;

import java.util.Scanner;

public class ch4 {
    public static final double percentage=6.5/100;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double deposit,sum=0,total=0;
        System.out.println("What is your inital deposit?");
        deposit=console.nextDouble();
        System.out.println("How much you willing to deposit every year?");
        double depositYearly = console.nextDouble();
        sum=depositYearly;
        for(int i=1;i<25;i++){
            total+=deposit*percentage;
            System.out.println(i+"\t year "+deposit+"\t deposit"+"\t total "+total);


            deposit+=depositYearly;
        }
    }
}
