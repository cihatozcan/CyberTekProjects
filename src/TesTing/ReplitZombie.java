package TesTing;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitZombie {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info)
    {

        //your code here


    }//end person
}














        /*
        if(html.contains("<html>")&&html.contains("id=")){
            int x=html.indexOf("id=");
            int y=html.lastIndexOf('"');

            System.out.println(html.substring(x+4,y));

        }

        else{
            System.out.println("Invalid input!");
        }*/






        /*

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }


        //TODO. Write you code below this line.
        //if number has 0 right next to it divide by 2;
        //if number is 1 make equals to 0;
        //if sum=0 break the code at last piece of code of while loop
        //
        int sum=0;
        for (int i = 0; i <inhabitants.length; i++) {
            sum+=inhabitants[i];
        }
        int j=0;
        int temp=0;
        System.out.println("Day "+j+Arrays.toString(inhabitants));
        while(sum!=0){
            j++;                                            //find location of 0
            for (int i = 0; i < inhabitants.length; i++) {
                if(i<inhabitants.length-1){
                    temp=inhabitants[i+1];
                }
                if(i==0||i==inhabitants.length-1){
                    if(i==0&&inhabitants[i+1]==0){
                        inhabitants[i]/=2;
                    }
                    else if(i==inhabitants.length-1&&inhabitants[i-1]==0){
                        inhabitants[i]/=2;
                    }
                }
                else if(inhabitants[i+1]==0||inhabitants[i-1]==0){
                    inhabitants[i]/=2;
                }

                }

            System.out.println("Day "+j+Arrays.toString(inhabitants));
            sum=0;
            for (int i = 0; i <inhabitants.length; i++) {
                sum += inhabitants[i];
            }}
        System.out.println("------EXTINCT-----");
    }
}

*/

