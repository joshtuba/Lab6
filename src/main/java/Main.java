/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raspb
 */
public class Main {
    public static void main(String[] args) {
        Employee Susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee Joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        //System.out.println(Mark.getPosition());
        
        EmployeeInfoHeader();
        
        Susan.displayEmployeeInfo();
        Mark.displayEmployeeInfo();
        Joy.displayEmployeeInfo();
    }
    
    public static void EmployeeInfoHeader() {
        System.out.print("Name" + "\t \t");
        System.out.print("ID Number" + "\t");
        System.out.print("Department" + "\t");
        System.out.println("Position");
        
        System.out.println("");

    }
}
