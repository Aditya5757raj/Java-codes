interface UniGuidelines {
    int noClass = 45;

    int getCgpa(float a, float b, float c);

    boolean getAttendance(int noAttend);
}

class UPES implements UniGuidelines {

    public boolean getAttendance(int noAttend) {
        float attendCriteria = 75.00f;
        float attend = (float) noAttend / (float) noClass * 100;
        return attend > attendCriteria;
    }

    public int getCgpa(float a, float b, float c) {
        float CGPA_criteria = 5;
        float totalCGPA = (a + b + c) / 3;
        if (totalCGPA < CGPA_criteria) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
        return 0;
    }
}

class GE implements UniGuidelines {

    public boolean getAttendance(int noAttend) {
        float attendCriteria = 73.00f;
        float attend = (float) noAttend / (float) noClass * 100;
        return attend > attendCriteria;
    }

    public int getCgpa(float a, float b, float c) {
        float CGPA_criteria = 4;
        float totalCGPA = (a + b + c) / 3;
        if (totalCGPA < CGPA_criteria) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }
        return 0;
    }
}

 class Main {

    public static void main(String[] args) {
        UPES s1 = new UPES();
        UPES s2 = new UPES();
        boolean s1Attendance = s1.getAttendance(20);
        boolean s2Attendance = s2.getAttendance(40);
        System.out.println("Student 1 Attendance: " + s1Attendance);
        System.out.println("Student 2 Attendance: " + s2Attendance);
        s1.getCgpa(1, 2, 3);
        s2.getCgpa(56, 89, 95);
        
        GE d1 = new GE();
        GE d2 = new GE();
        boolean d1Attendance = d1.getAttendance(20);
        boolean d2Attendance = d2.getAttendance(40);
        System.out.println("Student 1 (GE) Attendance: " + d1Attendance);
        System.out.println("Student 2 (GE) Attendance: " + d2Attendance);
        d1.getCgpa(39, 34, 76);
        d2.getCgpa(55, 69, 95);
    }
}
