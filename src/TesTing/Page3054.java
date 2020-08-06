package TesTing;

import java.util.Scanner;

public class Page3054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MakeaSquare(5);



    }
    public static int pow(int x,int y){
        int result=0;
        int x1=x;

        for(int i=1;i<y;i++){

            x=x1*x;
            result =x;
        }
        return result;

    }
    public static void printSequences(int x,int y){
        int a=x;
        int b=y;
        if(x>y){
            for(int i=1;i<=x-y;i++){
                System.out.print(b+ " ");
                b++;
            }
        }
        else if(y>x){
            for(int i=1;i<=y-x;i++){


                System.out.print(b+" ");
                b--;
            }

        }
        else{
            System.out.println(x);
        }
    }
    public static void MakeaSquare(int size){
        int x=size;

        for(int i=1;i<=size;i++){
            for(int k=1;k<=size;k++){
                if(k>i){
                    if(k==x){
                    System.out.print("X");
                }
                    else {
                        System.out.print("O");
                    }
                }
                else if(i>k){
                    if(k%2==0){
                        System.out.print("X");
                    }
                    else{
                        System.out.print("O");
                    }
                }

                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }

    }
}
