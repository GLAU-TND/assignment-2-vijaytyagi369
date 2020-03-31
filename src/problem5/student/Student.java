package problem5.student;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String firstName;
    private String lastName;
    private int backLog;

    public Student(int rollNo, String firstName, String lastName, int backLog) {
        this.rollNo = rollNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.backLog = backLog;
    }
    public int getBackLog() {
        return backLog;
    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "RollNo:-"+ this.getRollNo() +" Name:- "+this.getFirstName()+" "+this.getLastName()
                +"backLogs"+this.getBackLog();
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.rollNo, student.rollNo);
    }
}
