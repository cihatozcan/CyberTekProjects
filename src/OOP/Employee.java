package OOP;

public class Employee {

    int emplid;

    public int getEmplid() {
        return emplid;
    }

    public void setEmplid(int emplid) {
        this.emplid = emplid;
    }

    public String getEmplname() {
        return emplname;
    }

    public void setEmplname(String emplname) {
        this.emplname = emplname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emplid=" + emplid +
                ", emplname='" + emplname + '\'' +
                '}';
    }

    public Employee(int emplid, String emplname) {
        this.emplid = emplid;
        this.emplname = emplname;
    }
    public int MaasHesapla(int saat){
        return saat*15;
    }

    String emplname;
}
