package army;

abstract public class military {
    private boolean isAtWar;
    private String uniform;
    private double salary;
    private int militarySize;
    public military(double salary,int militarySize){
        this.salary=salary;
        this.uniform="Black";
        this.isAtWar=false;
    }
    public military(){

    }

    public boolean isAtWar() {
        return isAtWar;
    }

    public void setAtWar(boolean atWar) {
        isAtWar = atWar;
    }

    public String getUniform() {
        return uniform;
    }

    public void setUniform(String uniform) {
        this.uniform = uniform;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMilitarySize() {
        return militarySize;
    }

    public void setMilitarySize(int militarySize) {
        this.militarySize = militarySize;
    }

    @Override
    public String toString() {
        return "military{" +
                "isAtWar=" + isAtWar +
                ", uniform='" + uniform + '\'' +
                ", salary=" + salary +
                ", militarySize=" + militarySize +
                '}';
    }
}
