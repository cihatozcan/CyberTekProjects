package army;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class armyMainMethod {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        navy eastBlock = new navy(1000000,15000);
        navy westBlock = new navy(2500000,12500);
        sergeant james = new sergeant("M16","normal");
        sergeant frank = new sergeant("M16","sergeant");
        sergeant john  = new sergeant("Ak47","normal");
        ArrayList<navy> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(eastBlock,westBlock,john));
        for (navy s:arr) {
            if(s instanceof navy){
                System.out.println("What kind of ship is that");
                String k=scan.next();
                s.setShipModel(k);
                System.out.println("How many do you have");
                int x=scan.nextInt();
                s.setShipCount(x);
            }

        }
        System.out.println("East block has "+eastBlock.getShipModel()+"and "+eastBlock.getShipCount());
        System.out.println("West block has "+westBlock.getShipModel()+""+eastBlock.getShipCount());
    }
}
