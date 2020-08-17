package Inheritancech9;

import day15_String.Str;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
    /**
     * main method for abstract class
     * @param args
     */
    public static void main(String[]args){


     teacher burak = new teacher("Burak");

        // Employee "John"
      //  Employee john = new Employee("John");
        //System.out.println(john);

        // Teacher "Jane"
        teacher jane = new teacher("Jane");
        System.out.println(jane);
        System.out.println(jane.grade("apple"));
        System.out.println(jane.grade("fruit"));
        // AdjunctTeacher with "Joe"
        AdjunctTeacher joe = new AdjunctTeacher("Joe");
        System.out.println(joe.grade("apple"));
        // Print these three in array
        Employee[] emps ={jane,joe}; //Polymorphism when you don't know which codes will be executed
        for(Employee e:emps){
            //is object a teacher?              //because emps has 3 different class object but when for loop executes the
            if(e instanceof teacher){           //line 25 it calls 3 different toString method
                teacher t=(teacher)e;
                System.out.print(t.grade("apple")+" ");
            }
            System.out.println(e);
        }

        System.out.println(Arrays.toString(emps));

        // Which of these can be stored into an Employee, Teacher, AdjunctTeacher?

        // make Employee abstract class
    }
}
