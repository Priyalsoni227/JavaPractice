package collections;
import java.util.*;

class Student{
	int rollno;
	int age;
	String name;
	
	public Student(int rollno, int age, String name) {
		this.rollno=rollno;
		this.age=age;
		this.name=name;
	}
}

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1=new Student(1,23,"Sonoo");
       Student s2=new Student(102,21,"Ravi");
       Student s3=new Student(103,25,"Hanumat");
       
       ArrayList<Student> list=new ArrayList<Student>();
       list.add(s1);
       list.add(s2);
       list.add(s3);
       
       Iterator itr=list.iterator();
       while(itr.hasNext()) {
    	   Student st=(Student)itr.next();
    	   System.out.println(st.rollno+" "+st.name+" "+st.age);
       }
	}

}
