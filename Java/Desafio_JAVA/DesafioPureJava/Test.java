package Desafio_JAVA.DesafioPureJava;

import Desafio_JAVA.DesafioPureJava.Facade.Facade;
import Desafio_JAVA.DesafioPureJava.Singleton.SingletonEager;
import Desafio_JAVA.DesafioPureJava.Singleton.SingletonLazy;
import Desafio_JAVA.DesafioPureJava.Singleton.SingletonLazyHolder;
import Desafio_JAVA.DesafioPureJava.Strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy
        Behaviour normal = new NormalBehaviour();
        Behaviour attach = new AttachBehaviour();
        Behaviour defense = new DefenseBehaviour();

        Robot robot = new Robot();
        robot.move();
        robot.setBehaviour(attach);
        robot.move();
        robot.move();
        robot.setBehaviour(normal);
        robot.move();
        robot.setBehaviour(defense);

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Matheus", "1234567");
    }
}
