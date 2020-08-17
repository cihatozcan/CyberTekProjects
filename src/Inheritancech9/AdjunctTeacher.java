package Inheritancech9;
//AdjunctTeacher subclass of Teacher - salary 20% less than teacher, classSize default 15
//  fields - none
//  constructor(name)
//  toString [AdjunctTeacher name=xxxx, salary=xxxx, classSize=xxxx]
public class AdjunctTeacher extends teacher{
    /**
     * calls a contructor from upper class, sets the salary %20less and class size to 15
     * @param name
     */
    public AdjunctTeacher(String name){
        super(name); //calls the super class constructor which is requires only name
        this.setSalary(this.getSalary()*.8);
        this.setClassSize(15);
    }

    /**
     * returns the String of the class
     * @return
     */
    public String toString(){
        return String.format("[AdjunctTeacher name=%s, salary=%.2f, classSize=%d]",
                this.getName(),this.getSalary(),this.getClassSize());
    }

}
