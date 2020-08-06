package TesTing;

public class Ornek {
    public static void main(String[] args) {
        int x=12;
        int y=13;
        System.out.println(Math.min(x,y));


    }
    public static String Season(int month,int day){
        String ay="";
        String season="";
        if(month<1||month>12||day>31||day<1){

            throw new IllegalArgumentException("Oyle bir tarih yok");

        }
        if(month==1){
            ay="January";
            season="Winter";
        }
        else if(month==2){
            ay="February";
            season="Winter";
        }
        else if(month==3&& day>15){
            ay="March";
            season="spring";
        }
        else if(month==3&&day<=15){
            ay="March";
            season="Winter";
        }
        else if(month==4){
            ay="April";
            season="spring";
        }
        else if(month==5){
            ay="May";
            season="spring";
        }
        else if(month==6){
            ay="June";
            if(day>15){
                season="summer";
            }
            else{
                season="spring";
            }
        }
        else if(month==7){
            ay="July";
            season="summer";
        }else if(month==8){
            ay="August";
            season="summer";
        }
        else if(month==9&&day<=15){
            ay="Septemper";
            season="summer";
        }
        else if(month==9&&day>15){
            ay="September";
            season="fall";
        }
        else if(month==10){
            ay="October";
            season="fall";
        }
        else if(month==11){
            ay="November";
            season="fall";
        }
        else if(month==12&&day<=15){
            ay="December";
            season="fall";
        }
        else{
            ay="December";
            season="fall";
        }
        return ay+" "+season;



    }
}
