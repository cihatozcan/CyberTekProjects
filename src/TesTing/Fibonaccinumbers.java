package TesTing;

public class Fibonaccinumbers {
    public static int result;
    public static void main(String[] args) {
printDesign();



}

    public static void printDesign(){
        for(int i=1;i<=5;i++){
            for(int k=1;k<=6-i;k++){
                System.out.print("-");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(i*2-1);
            }


            for(int a=1;a<=6-i;a++){
                System.out.print("-");
            }
            System.out.println();
        }

    }


}
