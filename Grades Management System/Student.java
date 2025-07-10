

class Student {
    String studentId;
    double grade;

    public Student(String studentId, double grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Grade: " + grade;
    }
}