package TesTing;

import java.util.Scanner;

public class WarmupTasksJune23 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double federaltaxrate = 0.0;
        double taxpaid=0.0;
        double statetax=0.0;
        System.out.println("Tax calculation for tri state area\n This application only avaiable citizen's from CT,NY.NJ");
        System.out.println("Which state taxes will be filed?//NY,CT,NJ");
        String state =scanner.next();
        state=state.toUpperCase();
        if(state.equals("NY")){
            statetax=0.082;

        }
        else if(state.equals("CT")){
            statetax=0.06;
        }
        else if(state.equals("NJ")){
            statetax=0.0625;
        }
        else{
            System.out.println("Invalid state code");
        }


        System.out.println("How much is your yearly income?");
        double salary = scanner.nextDouble();
        System.out.println("Are you married?//type true or false");
        boolean married = scanner.nextBoolean();
        if(married){
            System.out.println("What is your spouse income?");
            salary+=scanner.nextDouble();
        }

        if (married) { if (salary < 9526) {
            System.out.println("You dont have to file taxes");

        } else if (salary >= 9526 && salary <= 38700) {
            federaltaxrate = 0.12;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;
        } else if (salary > 77401 && salary <= 165000) {
            federaltaxrate = 0.22;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;
        } else if (salary > 165000 && salary <= 315000) {
            federaltaxrate = 0.24;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;

        } else if (salary > 315000 ) {
            federaltaxrate = 0.32;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;
        }

        } else {

            if (salary < 9526) {
            System.out.println("You dont have to file taxes");

        } else if (salary >= 9526 && salary <= 38700) {
            federaltaxrate = 0.12;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;
        } else if (salary > 38700 && salary <= 82500) {
            federaltaxrate = 0.22;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;
        } else if (salary > 82500 && salary <= 155000) {
            federaltaxrate = 0.24;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;

        } else if (salary > 155000 ) {
            federaltaxrate = 0.32;
            taxpaid=(salary*federaltaxrate)+(salary*statetax);
            salary=salary-taxpaid;
        }
        }

        System.out.println("Salary after tax "+(int) salary+" \n You paid "+(int)taxpaid+" on taxes");
    }







}
