package Desafio_JAVA.Desafio1;

public abstract class Content{
    protected  static double defaultXP = 10d;

    private String tittle;
    private String describe;

    public abstract double calculateXP();
    public String getTittle() {
        return tittle;
    }

    public String getDescribe() {
        return describe;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

}