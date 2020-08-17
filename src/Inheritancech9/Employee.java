package Inheritancech9;

 abstract public class Employee { //abstract means you can't create instance object from Employee class
                                  // fields - employee name, salary default $50000
      private String name;
      private double salary;
    //Employee Burak = new Employee("Burak");
    /**
     * constructor that takes all fields, uses setName, setSalary
     * @param name
     * @param salary
     */
    public Employee(String name,double salary){
        this.setNAme(name);
        this.setSalary(salary);
    }
    // constructor that just takes name and calls other constructor

      /**
       *
       * @param name
       */
      public Employee(String name){
          this(name,50000);
      }

    // getters/setters- get/setName, get/setSalary

      /**
       * gets the employee name
       * @return name
       */
      public String getName(){
          return this.name;
      }

      /**
       * gets the employee salary
       * @return salary
       */
      public double getSalary(){
          return this.salary;
      }

      /**
       * Sets employee name
       * @param name
       */
      public void setNAme(String name){
          this.name=name;
      }

      /**
       * Sets the employee salary
       * @param salary
       */
      public void setSalary(double salary){
          this.salary=salary;
      }
     @Override
     public String toString() {
         return "Employee{" +
                 "name='" + name + '\'' +
                 ", salary=" + salary +
                 '}';
     }
 }
