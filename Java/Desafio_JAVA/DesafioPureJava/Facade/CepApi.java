package Desafio_JAVA.DesafioPureJava.Facade;

import Desafio_JAVA.DesafioPureJava.Singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();
    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Uberlandia";
    }

    public String recuperarEstado(String cep){
        return "MG";
    }
}
