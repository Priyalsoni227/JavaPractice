package static_keyword;

//A java program to demonstrate use of
//static keyword with methods and variables

class Student{
	String name;
	int rollNo;
	
	static String cllgName;
	static int counter=0;
	
	
	
	public Student(String name) {
		this.name=name;
		this.rollNo=setRollNo();
	}
	
	static int setRollNo(){
		counter++;
		return counter;
	}
	
	static void setCllgName(String name) {
		cllgName=name;
	}
	
	void getStudentInfo() {
		System.out.println("Name: "+name);
		System.out.println("Roll no.: "+rollNo);
		System.out.println("College: "+cllgName);
		
	}
	
	
}

public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student.setCllgName("XYZ");
       Student s1=new Student("Alice");
       Student s2=new Student("Bob");
       
       s1.getStudentInfo();
       s2.getStudentInfo();
	}

}
