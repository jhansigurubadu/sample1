package singleton;

public class SingletonExample {
 private static SingletonExample obj;
    private SingletonExample(){
    }
    public static SingletonExample method(){
    if(obj == null){
        obj = new SingletonExample();
    }
    return obj;
    }
    public static void main(String[] args) {
        System.out.println(SingletonExample.method());
        SingletonExample abc =  SingletonExample.method();
        SingletonExample abc1 =  SingletonExample.method();
        System.out.println(abc);
        System.out.println(abc1);
    }
}

