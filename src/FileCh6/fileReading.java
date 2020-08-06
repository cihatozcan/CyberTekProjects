package FileCh6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReading {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input =  new Scanner(new File("Untitled.rtf"));
        int count=0;
        while(input.hasNext()){
            String word=input.next();
            count++;
        }
        System.out.println("total words: "+count);

    }
}
