package ClassAndObject;

public class Student1 {
    private int roll;
    private String name;
    private  String phone;
    private String address;


    Student1(int roll,String name, String phone, String address){
        this.roll = roll;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
