package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Course {

    // TODO: declare private fields:
    // courseCode (String)
    // courseName (String)
    // maxCapacity (int)
    // enrolledStudents (List<Student>)
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private List<Student> enrolledStudents;



    // TODO: implement constructor:

    public Course(String courseCode, String courseName, int maxCapacity, List<Student> enrolledStudents) {
        if (maxCapacity <= 0) throw new IllegalArgumentException(" maxCapacity has to be greater  than 0");
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Course(String courseCode, String courseName, int maxCapacity)
    //
    // Rules:
    // - maxCapacity must be greater than 0
    // - initialise enrolledStudents as new ArrayList<>()

    // TODO: implement getters:
    // String getCourseCode()
    // String getCourseName()
    // int getMaxCapacity()

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }



    // TODO: implement enrolStudent(Student student)
    // - return false if course is full
    // - return false if student already enrolled
    // - otherwise add student and return true

    public boolean enrolStudent(Student student){
        if (enrolledStudents.size() > maxCapacity) {
            return false;
        }
        if  (enrolledStudents.contains(student)) {
            return false;
        }
        enrolledStudents.add(student);
            return true;

    }

    // TODO: implement removeStudentById(int studentId)
    // - remove matching student
    // - return true if removed
    // - otherwise false
    public boolean removeStudentById(int studentId){
        if(enrolledStudents.contains(studentId)){
            enrolledStudents.remove(studentId);
            return true;
        }
        return false;
    }

    // TODO: implement getEnrolledStudents()
    // - return defensive copy
    public ArrayList<Student> getEnrolledStudents(){
        return new ArrayList<>(enrolledStudents);
    }


    // TODO: implement getTotalStudents()
    // - return number of enrolled students
    public  int getTotalStudents(){
        return enrolledStudents.size();
    }

    // TODO: implement hasStudent(String studentName)
    // - return true if student exists by name
    public boolean hasStudent(String studentName){
        if (enrolledStudents.contains(studentName)){
            return true;
        }
        return false;
    }

    // TODO: override toString()
    // Example:
    // Course: CSC101 - Introduction to Programming

    @Override
    public String toString() {
        return "Course: " + courseCode +" - " + courseName;
    }
}