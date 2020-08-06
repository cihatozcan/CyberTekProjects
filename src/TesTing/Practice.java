package TesTing;

import java.util.Scanner;

public class Practice {

        public static int mostOccured(int[] arr) {
            int most = 0;
            int max = 0;

            for (int each : arr) {
                int count = 0;
                for (int i : arr) {
                    if (each == i) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                    most = each;
                }
            }
            return most;
        }
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("How many numbers would you like to enter");
            int n = scan.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i< arr1.length; i++){
                arr1[i] = scan.nextInt();
            }
            // int[] arr1 = {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 9, 9, 9, 9, 9};
            System.out.println(mostOccured(arr1));
        }


}
