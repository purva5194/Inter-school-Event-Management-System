/**
 * Created by spartans on 7/30/17.
 */

import java.util.*;

public class School {

    public String schoolName;
    SchoolModel model;

    public ArrayList<String> school = new ArrayList<>();


    public School(String name)
    {
        model = new SchoolModel();
        setSchoolName(name);

    }

    public void setSchoolName(String name){

        this.schoolName = name;
        school.add(name);
    }

    public  String getSchoolName(){
        return this.schoolName;
    }

    // get student information
   public void studentInfo(){

        //get the instance of the Iterator from StudentIterator
        Iterator<Student> itr=model.getIterator();

        System.out.print("Student List \n");
        while(itr.hasNext())
        {
            System.out.println(itr.next().getUserName());
        }
    }

    // get parent information
    public void parentInfo(){

        System.out.print("Parent List \n");

        //get the instance of the Iterator from StudentIterator
        Iterator<Student> itr=model.getIterator();

        while(itr.hasNext())
        {
            itr.next().parentInfo();
        }
    }



}
