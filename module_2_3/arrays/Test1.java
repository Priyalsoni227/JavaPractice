package arrays;

//arrays of objects

class Student{
	int roll_no;
	String name;
	
	public Student(int roll_no,String name) {
		this.roll_no=roll_no;
		this.name=name;
	}
}

public class Test1 {

	public static void main(String[] args) {
		Student[] arr;
		arr=new Student[5];
		arr[0]=new Student(1,"Alice");
		arr[1]=new Student(2,"Bob");
		arr[2]=new Student(3,"Tom");
		arr[3]=new Student(4,"John");
		arr[4]=new Student(5,"Dennis");
		
		for(Student s:arr) {
			System.out.println("Roll no.: "+s.roll_no+" name: "+s.name);
		}
      
	}

}
