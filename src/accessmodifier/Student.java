package accessmodifier;

public class Student {
    private String name = "Tsu";
    private String classes = "dn-c0326m1-jv105";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display() {
        System.out.println("Name: " + name );
        System.out.println("Classes: " + classes);
    }
    public static void main(String[] args) {
        Student st = new Student();

        st.setName("Tsu");
        st.setClasses("dn-c0326m1-jv105");


        st.display();
    }

}


