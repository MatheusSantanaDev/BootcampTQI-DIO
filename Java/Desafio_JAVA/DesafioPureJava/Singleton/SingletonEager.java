package Desafio_JAVA.DesafioPureJava.Singleton;

//Singleton "faster"
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
