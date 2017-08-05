import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by spartans on 8/3/17.
 */
public class SchoolModel implements StudentIterator {

    private Scanner scan;
    public School school;
    public SchoolAdmin admin;
    public EventNotification noti;

    public static ArrayList<Student> student;

    public SchoolModel(){}

    public SchoolModel(String name){

        student = new ArrayList<>();
        scan = new Scanner(System.in);
        noti = new EventNotification();
        school = new School(name);
    }

    @Override
    public Iterator getIterator() {

        //returns iterator of student arraylist
        return student.iterator();
    }

    // add student for the specific school
    public void addStudent(){

        System.out.print("Enter Student name");
        String studentName = scan.nextLine();

        student.add(new Student(studentName));
    }

    // assign admin for the school
    public void assignAdmin(){

        System.out.print("Enter School Admin name");
        String adminName = scan.nextLine();

        admin = new SchoolAdmin(adminName);
    }

    // get admin information
    public void adminInfo(){
        System.out.print("Admin Info : "+admin.getUserName());
    }

    // send event invitation to the school
    public boolean sendNotificationToSchool(String schoolName){
        noti = new EventNotification();
        noti.sendEventNotification(schoolName);

        if(noti.invitationStatus())
            return true;
        else
            return false;
    }

    // display student information
    public void studentInfo(){
        school.studentInfo();
    }

    // display parent information
    public void parentInfo(){
        school.parentInfo();
    }

}
