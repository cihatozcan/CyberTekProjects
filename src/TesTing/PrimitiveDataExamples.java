package TesTing;

import java.util.Scanner;

public class PrimitiveDataExamples {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        christmastTree(2,4);


        //String h = console.nextLine();
       // System.out.println(h.substring(h.indexOf(' '),h.length())+","+h.substring(0,h.indexOf(' ')));
        }
        public static void christmastTree(int segments , int height){
        for(int i=1 ;i<=segments;i++){
            for(int k=1;k<=height;k++){
                for(int j=1;j<=4-k ;j++){
                    System.out.print(" ");
                }
                for(int p=1;p<=2*k-1;p++){
                    System.out.print("*");
                }
                if(i>1){
                    for(int j=1;j<=4-k ;j++){
                        System.out.print(" ");
                    }
                    for(int p=1;p<=2*i-1;p++){
                        System.out.print("*");
                    }

                }
                System.out.println();
            }
        }


        }


    }

