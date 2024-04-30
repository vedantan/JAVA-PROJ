class Student {
    int rollno;
    String name;
    float marks  ;
    boolean pass;


}
public class AssigningValue {
    public static void main(String[] args) {
        int[] rollno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
        boolean[] pass = new boolean[5];
        Student[] students = new Student[5];

        Student vedant = new Student();
        vedant.rollno = 42;
        vedant.name = "Vedant Nillawar";
        vedant.marks = 88.8f;
        vedant.pass= true;

        System.out.println(vedant.rollno);
        System.out.println(vedant.name);
        System.out.println(vedant.marks);
        System.out.println(vedant.pass);
    }
}
