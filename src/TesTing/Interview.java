package TesTing;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        for (int i = 0; i <5; i++) {
            System.out.println("Enter the "+(i+1)+". number");
            int x=scan.nextInt();
            sum+=x;
        }
        System.out.println("Your sum is "+sum);
    }
}
