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

    public static void main(String[] args)
	{
Upes s1 = new Upes();
Upes s2 = new Upes();
s1.getAttendance(20);
s2.getAttendance(40);
s1.getCGPA(1,2, 3);
s2.getCGPA(56, 89, 95);
GE d1 = new GE();
GE d2 = new GE();
d1.getAttendance(20);
d2.getAttendance(40);
d1.getCGPA(40, 34, 76);
d2.getCGPA(56, 89,95);
    }
}