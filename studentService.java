package JAVA.Student;
import java.util.ArrayList;
import java.util.*;
public class studentService {
        ArrayList<student> students=new ArrayList<>();
    public void addStudent(student s){
        students.add(s);
        System.out.println("Student added successfully!!!");
    }
    public void viewStudents(){
        System.out.printf("%-15s %-15s %-10s %10s%n","Student ID","Name","age","Course");
        for(student s:students){
            System.out.printf("%-15d %-15s %-10d %10s%n",s.id,s.name,s.age,s.course);
        }
    }
    public void searchStudent(int id){
        for(student s:students){
            if(id==s.id){
                System.out.println("Student Name:"+s.name);
                return;
            }
        }
        System.out.println("Student Not Found!!!");
    }
}
