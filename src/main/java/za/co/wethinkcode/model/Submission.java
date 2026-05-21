package za.co.wethinkcode.model;

public class Submission {

    // TODO: declare private fields:
    private int submissionId;
    private int studentId;
    private int assignmentId;
    private int marksAwarded;
    // submissionId (int)
    // studentId (int)
    // assignmentId (int)
    // marksAwarded (int)

    // TODO: implement constructor:
    // Submission(int submissionId, int studentId, int assignmentId, int marksAwarded)
    //
    // Rules:
    // - marksAwarded cannot be negative
    // - marksAwarded cannot exceed 100

    public Submission(int submissionId, int studentId, int assignmentId, int marksAwarded) {
        if(marksAwarded <0 || marksAwarded >100){
            throw new IllegalArgumentException( " invalid entry");
        }
        this.submissionId = submissionId;
        this.studentId = studentId;
        this.assignmentId = assignmentId;
        this.marksAwarded = marksAwarded;
    }


    // TODO: implement getters:
    // int getSubmissionId()
    // int getStudentId()
    // int getAssignmentId()
    // int getMarksAwarded()

    public int getSubmissionId() {
        return submissionId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public int getMarksAwarded() {
        return marksAwarded;
    }


    // TODO: implement updateMarks(int newMarks)
    //
    // Rules:
    // - throw IllegalArgumentException if newMarks < 0
    // - throw IllegalArgumentException if newMarks > 100
    // - otherwise update marksAwarded
    public void updateMarks(int newMarks){
        if(newMarks <0 || newMarks >100){
            throw new IllegalArgumentException(" invalid entry");
        }
        this.marksAwarded= newMarks;
    }

    // TODO: override toString()
    // Example:
    // Submission 1 | Student 10 | Assignment 5 | Marks: 85

    @Override
    public String toString() {
        return "Submission{" +
                "submissionId=" + submissionId +
                ", studentId=" + studentId +
                ", assignmentId=" + assignmentId +
                ", marksAwarded=" + marksAwarded +
                '}';
    }
}