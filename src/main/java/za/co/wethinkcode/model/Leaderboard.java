package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Leaderboard {

    // TODO: declare private fields:
    // rankings (List<Student>)
    // studentLookup (HashMap<Integer, Student>)
    private List<Student> rankings;
    private HashMap<Integer,Student> studentLookup;


    // TODO: implement constructor:
    // Leaderboard()
    //
    // - initialise rankings as new ArrayList<>()
    // - initialise studentLookup as new HashMap<>()

    public Leaderboard(List<Student> rankings, HashMap<Integer, Student> studentLookup) {
        this.rankings = new ArrayList<>();
        this.studentLookup = new HashMap<>();
    }


    // TODO: implement addStudent(Student student)
    // - add student to rankings
    // - add student to studentLookup
    // - call updateRankings()
    public void addStudent(Student student){
        rankings.add(student);

        studentLookup.put(student.getId(), student);

        updateRankings();



    }

    // TODO: implement getStudentById(int studentId)
    // - return student from HashMap
    // - return null if not found
    public Student getStudentById(int studentId){
        return studentLookup.get(studentId);



    }

    // TODO: implement getTopStudent()
    // - return first student in rankings
    // - return null if rankings empty
    public Student getTopStudent(){
        if(rankings.isEmpty()) {
            return null;
        }
        return rankings.get(0);

        }
    }

    // TODO: implement getRankings()
    // - return defensive copy
    public List<Student> getRankings(){
     return new ArrayList<>(getRankings());


    // TODO: implement updateRankings()
    //
    // Ranking Rules:
    // - highest GPA first
    // - if GPA ties, preserve insertion order
    //
    // Hint:
    // - use Comparator
        void updateRankings() {
                rankings.sort(Comparator.comparingDouble(Student::getGpa).reversed());
            }


        }
    // TODO: implement totalStudents()
    public int totalStudents(){
        return rankings.size();
    // - return number of students

    // TODO: override toString()

    // Example:
    // Leaderboard:
    // 1. John - GPA 3.9
    // 2. Sarah - GPA 3.7
}

@Override
public String toString() {
    return "Leaderboard{}";
}