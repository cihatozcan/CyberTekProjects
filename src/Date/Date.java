package Date;

public class Date {
    int year;
    int month;
    int day;
    //        2000 , 123       , 350
    public Date(int year, int month , int day){
        if(year<0||month<0||day<0){
            throw new IllegalArgumentException();
        }
        if(day>30){
            this.month+=day/31;  // 10 month 123+10= 133;
            this.day=day%31;     // 30 days
        }
        if(month>12){ // 133/12
            this.year+=month/12+year; //2011 month 1 day 30;
            this.month=month%12;
        }


    }                       //7
    public void addWeeks(int weeks){
        this.day+=weeks*7;
        if(this.day>30){
            this.month+=day/31;  // 10 month 123+10= 133;
            this.day=day%31;     // 30 days
        }
        if(month>12){ // 133/12
            this.year+=month/12; //2011 month 1 day 30;
            this.month=month%12;
        }

    }
    public void addDays(int day){
        this.day+=day;
        if(day>30){
            this.month+=day/31;  // 10 month 123+10= 133;
            this.day=day%31;     // 30 days
        }
        if(month>12){ // 133/12
            this.year+=month/12; //2011 month 1 day 30;
            this.month=month%12;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void convertDays(){

    }
    public boolean isLeapYear(){
        int leap = year%4;
        if(this.year%100==0||this.year%400==0){
            return false;
        }
        if(leap==0){
            return true;
        }
        return false;
    }
}
