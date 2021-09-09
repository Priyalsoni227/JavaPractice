package super_this_keyword;

//Java Program to illustrate using this
//many number of times

class Test5 {
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
     
     this.a = 9000;
     System.out.println(a);
 }

 public static void main(String[] args)
 {
     new Test5().GFG();
 }
}
