package TesTing;

public class forloopexample3 {
    public static final int HEIGHT=4;
    public static final int SIZE=18;
    public static void main(String[] args) {
        for(int i = 1; i<=HEIGHT;i++){
            for(int j=1;j<=i*2-2;j++){
                System.out.print("\\");
            }
            for(int k=1;k<=SIZE-i*4;k++){
                System.out.print("*");
            }
            for(int j=1;j<=i*2-2;j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
