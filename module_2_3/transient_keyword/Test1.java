package transient_keyword;
import java.io.*;

public class Test1 implements Serializable {
    int i=10,j=20;
    
    transient int k=30;
    
    transient final int l=40;
    transient static int m=50;
    
	public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test1 input=new Test1();
        FileOutputStream fos=new FileOutputStream("abc.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(input);
        
        FileInputStream fis=new FileInputStream("abc.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Test1 output=(Test1)ois.readObject();
        System.out.println("i = "+output.i);
        System.out.println("j = "+output.j);
        System.out.println("k = "+output.k);
        System.out.println("l = "+output.l);
        System.out.println("m = "+output.m);
        
        

	}

}
