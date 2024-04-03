class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("Student " + (i + 1), 1000 + i);
        }
        try {
            for (int i = 0; i < 11; i++) {  
                System.out.println(String.format("Name: %s, Roll Number: %d", students[i].name, students[i].rollNumber));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }
    }
}
