public class Main {
    public static void main(String[] args) {
        Student gr1 = new Student();
        gr1.setName("Adilet");
        gr1.setAge(18);
        gr1.setGroup("first group");

        gr1.studentinfo();
        gr1.studentLearn();

        Student gr2 = new Student();
        gr2.setName("Abai");
        gr2.setAge(16);
        gr2.setGroup("Second group");
        gr2.studentage();
    }
}
