package ClassAndObject;

public class Employee {
    private String name;
    private int join_year;
    private String address;

    public Employee(String name, int join_year, String address) {
        this.name = name;
        this.join_year = join_year;
        this.address = address;
    }
    void print(){
        System.out.println(name +"\t" + join_year +"\t" +address);
    }
}
