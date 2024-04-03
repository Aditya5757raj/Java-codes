class Student
{
String name;
int rollno;
Student(String name,int rollno)
{
this.name = name;
this.rollno = rollno;
}
public static void main(String arg[])
{
Student s1 = new Student ("raju", 101);
Student s2 = new Student ("giri", 102);
Student s3 = new Student ("giri", 102);
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s3)); 
}
}