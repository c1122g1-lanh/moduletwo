package ss_5_accessmodifier.bai_2;

public class Student {
    private String name = "Join";
    private String classes = "C02";

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        this.classes = classes;
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
