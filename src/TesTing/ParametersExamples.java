package TesTing;

public class ParametersExamples {
    public static void main(String[] args) {
        writeChars('=',20);
        System.out.println();



            for(int i=1;i<=20;i++){
                double root= rots(i);
                System.out.println("sqrt("+i+")="+ root);
            }


        drawBox(5,10);
    }
    public static double rots(double n){
        n=Math.sqrt(n);
        return n;


    }
    public static void writeChars(char ch,int number){
        for(int i=1;i<=number;i++){
            System.out.print(ch);

        }
    }
    public static void drawBox(int height, int width){
        //draw top of the box
        writeChars('*',width);
        System.out.println();
        //draw middle lines
        for(int i = 1;i<=height-2;i++){
            System.out.print("*");
            writeChars(' ',width-2);
            System.out.println("*");
        }
        //draw bottom of box
        writeChars('*',width);
        System.out.println();
    }
}
