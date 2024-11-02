/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;

/**
 *
 * @author ACER^
 */
public class Employeetest {

    
    public static void main(String[] args) {
      Employee user1=new Employee("Rako", "omer", 1000);
      Employee user2=new Employee("aryan", "abdulla", 834);
        System.out.println("NAME\t\tYEARLY SALARY");
        System.out.println("-----\t\t--------------");
        System.out.println(user1.getFirstname()+" "+user1.getLastname()+"\t"+user1.getyearlysalary());
        System.out.println(user2.getFirstname()+" "+user2.getLastname()+"\t"+user2.getyearlysalary());
        System.out.println("\n%10 percent salary raised!!yohoooooo!");
        user1.giveraise(10);
        user2.giveraise(10);
        System.out.println("NAME\t\tYEARLY SALARY");
        System.out.println("-----\t\t--------------");
        System.out.println(user1.getFirstname()+" "+user1.getLastname()+"\t"+user1.getyearlysalary());
        System.out.println(user2.getFirstname()+" "+user2.getLastname()+"\t"+user2.getyearlysalary());
    }
    
}
