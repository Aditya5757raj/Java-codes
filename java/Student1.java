class Student
{
	private int age;
	private String name;
	final private static String uniName= "UPES";
	
	Student(int age, String name)
	{
		this.age= age;
		this.name= name;
	}
	Student()
	{
		this.age= 20;
		this.name= "Default";
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int newAge)
	{
		this.age = newAge;
	}
	public static String getUniName()
	{
		return uniName;
	}
	
	public static void setUniName(String newUniName)
	{
		uniName = newUniName;
	}

}

class Faculty
{
}	

public class Main1
{
	public static void main(String[] args)
	{
		Student s1= new Student(18, "Ram");
		Student s2= new Student(19, "Shyam");
		Student s3= new Student();
		Faculty f1= new Faculty();
		System.out.println(s1.getName());
		s1.setName("Laxman");
		System.out.println(s1.getName());
		System.out.println(Student.getUniName());		
		//Student.setUniName("DIT");
		System.out.println(Student.getUniName());
		
	}
}