package Inheritancech9;

public class teacher  extends Employee{
    private int classSize;

    /**
     * calls constructor from Employee with super key
     * @param name
     */
    public teacher(String name){ // constructor are the method which we call them when we create a instance object
        super(name);
        this.setSalary(this.getSalary()/2);
        this.setClassSize(30);
    }


    /**
     *  sets the class size
     * @param classSize
     */
    public void setClassSize(int classSize){
        this.classSize=classSize;
    }


    /**
     * gets the class size
     * @return
     */
    public int getClassSize(){
        return this.classSize;
    }

    /**
     * returns "A+" if "apple", else "F"
     * @param fruit
     * @return "A+" if "apple", else "F"
     */
    public String grade(String fruit){
        if(fruit.equalsIgnoreCase("apple"))
            return "A+";
        else
            return "F";

    }

    /**
     * Returns the teacher's name and salary
     * @return
     */
    public String toString(){
        return String.format("[Teacher name=%s, salary=%.2f, classSize=%d]",
                this.getName(),this.getSalary(),this.getClassSize());
    }

}
