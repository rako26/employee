/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;


public class Employee {
    private String Firstname;
    private String Lastname;
    private double monthlysalary;
    
    public Employee(String Firstname , String Lastname , double monthlysalary){
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        if(monthlysalary > 0){
            this.monthlysalary=monthlysalary;
        }
        else{this.monthlysalary=0;  
        }
    }
    public void setFirstname(String Firstname){
        this.Firstname=Firstname;
    }
    public String getFirstname(){
    return Firstname;
}
    public void setLastname(String Lastname){
        this.Lastname=Lastname;
    }
    public String getLastname(){
        return Lastname;
    }
    public void setmonthlysalary(double monthlysalary){
        if(monthlysalary>0){
        this.monthlysalary=monthlysalary;}
    }
    public double getmonthlysalary(){
        return monthlysalary;
    }
    public double getyearlysalary(){
        return monthlysalary * 12;
    }
    public void giveraise(double perc){
        monthlysalary += monthlysalary * (perc/100);
    }
}
