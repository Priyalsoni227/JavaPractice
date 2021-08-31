package generics;

class Test<T>{
    T obj;
    Test(T obj){
        this.obj=obj;
    }
    
    public T getObject(){
        return this.obj;
    }
}

class TestMain {
    public static void main(String[] args) {
        Test<Integer> i=new Test<Integer>(20);
        System.out.println(i.getObject());
        Test<String> s=new Test<String>("Hello World");
        System.out.println(s.getObject());
    }
}
