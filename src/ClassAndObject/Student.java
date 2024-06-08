package ClassAndObject;

public class Student {
    private int roll_no;
    private String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                '}';
    }
}
