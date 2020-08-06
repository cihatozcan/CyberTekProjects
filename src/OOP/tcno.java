package OOP;

public class tcno {
    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int tcno;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    String name;
    String lastname;

    public tcno(int tcno, int number) {
        this.tcno = tcno;
        this.number = number;
    }
    public String toString(){
        return "Your tc no:"+tcno+" You number "+number+" Your name is "+name+" your last name is "+lastname;
    }
}
