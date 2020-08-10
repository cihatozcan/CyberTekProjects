package OOP;

public class Arabalar {
    String renk;
    boolean start;
    private int model;
    int trim;

    public Arabalar(int model,String renk,int trim) {
        this.model = model;
        this.renk = renk;
        this.trim = trim;
    }
    public Arabalar(boolean start) {
        this.start = start;
    }

    @Override
    public String toString() {
        return "Arabalar{" +
                "renk='" + renk + '\'' +
                ", model=" + model +
                ", trim=" + trim +
                '}';
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getTrim() {
        return trim;
    }

    public void setTrim(int trim) {
        this.trim = trim;
    }



    public double fiyatHesaplama(){

        if(model>2000){
            return 5000.0;
        }
        return 1000.0;

    }
    public boolean start(boolean start){
       return this.start=start;

    }
}
