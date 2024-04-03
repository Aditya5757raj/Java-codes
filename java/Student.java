public class Student {
    int age;
    String name;
    String roll;
    static String uniName = "UPES";
    
    Student() {
        this.age = 12;
        this.name = "Aditya";
        this.roll = "217524";
    }
    
    Student(int age, String name, String roll) {
        this.age = age;
        this.name = name;
        this.roll = roll;
    }
    
    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name + "----" + roll;
    }
    
    public static void main(String[] args)
 {
        Student s0 = new Student(14,"adi","R412641");
        Student s1 = new Student(15, "Raju", "R21346");
        Student s2 = new Student(16, "Kundan", "R21347");
        
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Student.uniName);
    }
}
