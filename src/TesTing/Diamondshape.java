package TesTing;

public class Diamondshape {
    public static void main(String[] args) {

       int number=9;
        for(int i=1;i<=6;i++){
            for(int k=1;k<=number;k++){
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();

        for(int i=1;i<=6;i++){
            for(int k=1;k<=number;k++){
                System.out.print(k);

            }
            System.out.print(0);
        }



    }
}


//    1 ------- 1 dongu 4 space 1=i number
//   2   ------ 2. dongu 3 space 3=i number
//  3  --------3. dongu 2 space 3=i number
// 4  ----------4. dongu 1 space 4=i number
//5  -----------5. dongu 0 space 5=i number