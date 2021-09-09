package super_this_keyword;


//Program to illustrate this keyword
//is used to refer current class
class Test4 {
 // instance variable
 int a = 10;

 // static variable
 static int b = 20;

 void GFG()
 {
  
     this.a = 100;
     System.out.println(a);

  
     this.b = 600;
      System.out.println(b);
 }

 public static void main(String[] args)
 {
    
     new Test4().GFG();
 }
}
