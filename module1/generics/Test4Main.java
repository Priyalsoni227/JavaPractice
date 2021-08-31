package generics;

//Generic types differ based on their type arguments
class Test4<T>{
    T obj;
    Test4(T obj){
        this.obj=obj;
    }
    
    public T getObject(){
        return this.obj;
    }
}

class Test4Main {
    public static void main(String[] args) {
        Test<Integer> iobj=new Test<Integer>(20);
        System.out.println(iobj.getObject());
        Test<String> sobj=new Test<String>("Hello World");
        System.out.println(sobj.getObject());
        iobj=sobj;//this results an error
    }
}
