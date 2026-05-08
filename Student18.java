public class Student18 {
    String nim, name, className;
    double gpa;

    public Student18() {
    }

    public Student18(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.name = name;
        this.className = kls;
        this.gpa = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}