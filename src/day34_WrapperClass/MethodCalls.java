package day34_WrapperClass;

public class MethodCalls {
    public static void main(String[] args) {
       int[]x={1,23,4,56,7,7};


    }

    public static String coverString(String main, String coverME) {
        String s="";

        if(main.contains(coverME)){
            for (int i = 0; i <main.length()-coverME.length() +1; i++) {
                if(main.substring(i,i+coverME.length()).equals(coverME)){
                    s+="["+coverME+"]";
                    i+=coverME.length();
                    continue;
                }
                s+=main.charAt(i);
            }
        }
        else{
            s+="["+main+"]";
        }
        return s;
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        char[] arr = str.toCharArray();
        String s="";
        for(int i=0;i<str.length();i++){
            String k=str.charAt(i)+"";
            while(!(s.contains(k))){
                s+=k;
            }
        }
        return s;
    }
    public static String mergeStrings(String one, String two) {

        String s="";
        int size=0;
        if(one.length()>two.length()){
            size=one.length();
        }
        else{
            size=two.length();
        }

        for(int i=0;i<=size-1;i++){
            if(i<one.length()){
                s+=one.charAt(i);
            }
            if(i<two.length()){
                s+=two.charAt(i);
            }
            System.out.println(s);


        }
        return s;

    }

}
