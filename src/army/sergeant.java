package army;

public class sergeant extends navy{

    private String rifleType;
    private String rank;
    private int countdays;
    public void changeRank(){
        if(this.countdays>500&&this.countdays<1000){
            this.setRank("Techniquel sergeant");
        }
        else if(this.countdays>1000){
            this.setRank("Master sergeant");
        }
    }
    public int getCountdays() {
        return countdays;
    }

    public void setCountdays(int countdays) {
        this.countdays = countdays;
    }

    public sergeant(String rifleType, String rank){
        this.rank=rank;
        this.rifleType=rifleType;
    }

    public String getRifleType() {
        return rifleType;
    }

    public void setRifleType(String rifleType) {
        this.rifleType = rifleType;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
