package TesTing;

public class forloopsexamples {
    public static int MAX_ODD=21;
    public static void writeOdds(){
        //print each odd number
        int count=0;
        for( count = 1;count<=(MAX_ODD-2);){

            System.out.println(count+" ");
           count=count+2;
        }
        // print the last odd number
        System.out.println(MAX_ODD);
    }

    public static void main(String[] args) {
        writeOdds();

        MAX_ODD=11;
        writeOdds();
    }
}
