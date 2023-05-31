package Desafio_JAVA.DesafioPureJava.Singleton;

//Singleton "Lazy holder"
public class SingletonLazyHolder {
    private static class InstanceHolder {
       public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
