package army;

public class navy extends military {
    private int shipCount;
    private String shipModel;
    public navy(){
    this.setUniform("Blue");
    }
    public navy(double salary,int militarySize){
        this.setMilitarySize(militarySize);
        this.setSalary(salary);
        this.setUniform("Blue");
        this.setAtWar(true);
    }

    public int getShipCount() {
        return shipCount;
    }

    public void setShipCount(int shipCount) {
        this.shipCount = shipCount;
    }

    public String getShipModel() {
        return shipModel;
    }

    public void setShipModel(String shipModel) {
        this.shipModel = shipModel;
    }

    public void setShipModel(String shipModel,int shipCount){
        this.shipModel=shipModel;
        this.shipCount=shipCount;
    }


    @Override
    public String toString() {
        return "navy's strength " +
                "uniform=" + this.getUniform() +
                '}'+"and personal :"+this.getMilitarySize();
    }
}
