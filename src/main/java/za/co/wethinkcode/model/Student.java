package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Student {

    // TODO: declare private fields:
    private int id;
    private String name;
    private int level;
    private double gpa;
    private  List<Course>  registerCourses;
    private List<Assignment> completedAssignments;
    // name (String)
    // level (int)
    // gpa (double)
    // registeredCourses (List<Course>)
    // completedAssignments (List<Assignment>)

    // TODO: implement constructor:

    public Student(int id, String name, int level, double gpa, List<Course> registerCourses, List<Assignment> completedAssignments) {
        this.id = id;
        this.name = name;
        this.level = 1;
        this.gpa = 0.0;
        this.registerCourses = new ArrayList<>();
        this.completedAssignments = new ArrayList<>();
    }

    // Student(int id, String name)
    //
    // Initial values:
    // - level = 1
    // - gpa = 0.0
    // - registeredCourses = new ArrayList<>()
    // - completedAssignments = new ArrayList<>()

    // TODO: implement getters:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getGpa() {
        return gpa;
    }
    // int getId()
    // String getName()
    // int getLevel()
    // double getGpa()

    // TODO: implement registerCourse(Course course)
    // - add course if not already registered
    public void registerCourse(Course course){
        if(!registerCourses.contains(course)){
            registerCourses.add(course);
        }
    }

    // TODO: implement completeAssignment(Assignment assignment)
    // - add assignment to completedAssignments
    public void CompleteAssignment(Assignment assignment){
        completedAssignments.add(assignment);
    }

    // TODO: implement updateGpa(double newGpa)
    // Rules:
    // - throw IllegalArgumentException if newGpa < 0
    // - throw IllegalArgumentException if newGpa > 4.0
    // - otherwise update GPA
    public void updateGPA(double newGpa){
        if (newGpa < 0) throw new IllegalArgumentException ("the gpa cannot be negative");

        if (newGpa >4.0) throw new IllegalArgumentException("Gpa cannot exceed 4.0 ");
        this.gpa= newGpa;
    }




    // TODO: implement levelUp()
    // - increase level by 1
    public void levelUp(){
        this.level++;

    }

    // TODO: implement getRegisteredCourses()
    // - return defensive copy
    public List<Course> getRegisterCourses() {
        return new ArrayList<>(registerCourses);
    }
// TODO: implement getCompletedAssignments()
    // - return defensive copy

    public List<Assignment> getCompletedAssignments() {
        return new ArrayList<>(completedAssignments);
    }


    // TODO: override toString()
    // Example:
    // Student: John (Level 2, GPA 3.5)

    @Override
    public String toString() {
        return "Student: "+ name + "(Level" + level+ " ,GPA "+ gpa + ")";
    }
}



