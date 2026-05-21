package za.co.wethinkcode.model;

public class Classroom {

    // TODO: declare private fields:
    // roomNumber (String)
    // assignedCourse (Course)
    // seatingCapacity (int)
    private String roomNumber;
    private Course assignedCourse;
    private int seatingCapacity;

    // TODO: implement constructor:
    // Classroom(String roomNumber, int seatingCapacity)
    //
    // Rules:
    // - seatingCapacity must be greater than 0

    public Classroom(String roomNumber, int seatingCapacity) {
        if(seatingCapacity <=0){
            throw new IllegalArgumentException(" invalid entry");
        }

        this.roomNumber = roomNumber;
        this.seatingCapacity = seatingCapacity;
    }


    // TODO: implement getters:
    // String getRoomNumber()
    // Course getAssignedCourse()
    // int getSeatingCapacity()

    public String getRoomNumber() {
        return roomNumber;
    }

    public Course getAssignedCourse() {
        return assignedCourse;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }


    // TODO: implement assignCourse(Course course)
    // - assign course to classroom
    public void assignCourse(Course course){
        this.assignedCourse = course;
    }

    // TODO: override toString()
    // Example:
    // Classroom A12 (Capacity: 40)

    @Override
    public String toString() {
        return "Classroom" +
                "roomNumber='" + roomNumber + '\'' +
                ", assignedCourse=" + assignedCourse +
                ", seatingCapacity=" + seatingCapacity ;
    }
}