public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    private String name;
    private int age;
    private String group;

    public void studentinfo() {
        System.out.println("Студент:" + name + " Жашы:" + age + " Группасы:" + group);
    }

    public void studentLearn() {
        System.out.println("Студент:" + name + " окуп жатат.");
    }

    public void studentage() {
        if (age < 18) {
            System.out.println("Студент:" + name + " Жашы:" + age + " 18 керек");
        }else {
            System.out.println("Студент:"+name+" Жашы:"+age+" ден коп.");
            studentinfo();
            studentLearn();
        }
    }
}