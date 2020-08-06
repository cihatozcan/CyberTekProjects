package day36_warmup;

import java.util.ArrayList;
import java.util.Scanner;

public class WarmupTasks {
    public static void main(String[] args) {
        email("cihat@hotmail.com");

    }
    public static void email(String s){
        String [] arr =s.split("@");
        if(arr.length!=2){
            System.out.println("Invalid");
        }else{
            System.out.println("email "+arr[0]);
            System.out.println("domain "+arr[1]);
        }




        /*
        if(s.contains("@")&&s.indexOf("@")==s.lastIndexOf("@")){

        System.out.println("email:"+s.substring(0,s.indexOf('@')));
        System.out.println("domain:"+s.substring(s.indexOf('@')+1));
        }
        else{
            System.out.println("Invalid");
        }*/
}



   public static ArrayList<Integer> Uniques(ArrayList<Integer>arr){
        ArrayList<Integer> arrnew=new ArrayList<>();
       for (int i = 0; i <arr.size() ; i++) {
           if(arr.indexOf(arr.get(i))==arr.lastIndexOf(arr.get(i))){
               arrnew.add(arr.get(i));
           }
       }
       return arrnew;
   }


    public static ArrayList<Integer> multipleBy2(ArrayList<Integer>arr){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)%2!=0){
                arr.set(i,arr.get(i)*2);
            }
        }
        return arr;
    }

    public static void main(double[] args) {
        System.out.println("hello");
    }

    public static void main(char[] args) {
        System.out.println("Char");
    }
}
