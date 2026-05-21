package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Assignment {

    // TODO: declare private fields:
    private int assignmentId;
    private String title;
    private int totalMarks;
    private List<Submission> submissions;
    // assignmentId (int)
    // title (String)
    // totalMarks (int)
    // submissions (List<Submission>)



    // TODO: implement constructor:
    // Assignment(int assignmentId, String title, int totalMarks)
    //
    // Rules:
    // - totalMarks cannot be negative
    // - totalMarks cannot exceed 100
    // - initialise submissions as new ArrayList<>()
    public Assignment(int assignmentId, String title, int totalMarks){
        if(totalMarks<0 || totalMarks>100){
            throw new IllegalArgumentException( " invalid entry");
        }
        this.assignmentId = assignmentId;
        this.title = title;
        this. totalMarks = totalMarks;
        this. submissions= new ArrayList<>();
    }


    // TODO: implement getters:
    // int getAssignmentId()
    // String getTitle()
    // int getTotalMarks()

    public int getTotalMarks() {
        return totalMarks;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public String getTitle() {
        return title;
    }


    // TODO: implement addSubmission(Submission submission)
    // - add submission to submissions list
    public void addSubmission(Submission submission){
        submissions.add(submission);
    }

    // TODO: implement getSubmissions()
    // - return defensive copy
    public ArrayList<Submission> getSubmissions(){
        return new ArrayList<>(submissions);
    }

    // TODO: implement getSubmissionCount()
    // - return number of submissions
    public int getSubmissionCount(){
        return submissions.size();
    }

    // TODO: override toString()
    // Example:
    // Assignment: OOP Project (100 Marks)

    @Override
    public String toString() {
        return "Assignment:" + title + "(" + totalMarks + " Marks)";
    }
}