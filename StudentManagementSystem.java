package JAVA.Student;
import java.util.*;
//import JAVA.Student.studentService;
public class StudentManagementSystem {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int choice;
    studentService s1=new studentService();
    while(true){
        System.out.println("Enter Your Choice\n1.ADD STUDENT\n2.VIEW STUDENTS\n3.SEARCH STUDENT\n4.EXIT");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter id:");
                int id=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student Name:");
                String name=sc.nextLine();
                System.out.println("Enter Student Age:");
                int age=sc.nextInt();
                sc.nextLine();
                System.out.println("Enter student Course:");
                String course=sc.nextLine();
                student s=new student(id,name,age,course);
                s1.addStudent(s);
                break;
            case 2:
                System.out.println("STUDENT DETAILS!!!");
                s1.viewStudents();
                break;
            case 3:
                System.out.println("Enter Student Id:");
                int id1=sc.nextInt();
                s1.searchStudent(id1);
                break;
            case 4:
                System.out.println("Exiting !!!");
                return ;
            default:
                System.out.println("Enter a valid choice!!!");
                break;
        }
    }
}
}
