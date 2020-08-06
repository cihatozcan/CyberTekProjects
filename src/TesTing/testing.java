package TesTing;

public class testing {
    public static void main(String[] args) {
        String a = "asdsad";
        System.out.println(last3c(a));
    }
    public static String last3c(String s){
       return s.charAt(s.length()-3)+""+s.charAt(s.length()-2)+""+s.charAt(s.length()-1);
    }
}
