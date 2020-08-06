package TesTing;

public class ParametersBookExamples {
    public static void main(String[] args) {
        printGrid(4,6);

    }
    public static void printNumbers(int MAX){
        for(int i=1;i<=MAX;i++){
            System.out.print("["+i+"]");
        }



        }
        public static void printGrid(int rows, int columns){

        for(int i=1;i<=rows;i++){
            for(int k=1;k<=columns;k++){

            }


        }


        }
    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) {

            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }

            for (int j = min; j < i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }


        public static void printPowers(int power){
        for(int i=0;i<=power;i++){

            System.out.println((int)Math.pow(2,i));
        }

    }
    public static void printPowersOfN(int n, int x){
        for(int i=0;i<=x;i++){
            System.out.print((int)Math.pow(n,i)+" ");
        }
    }
}
