package Desafio_JAVA.Desafio1;

import java.time.LocalDate;

class Mentoring extends Content{

   private LocalDate date;

   public double calculateXP(){
       return defaultXP = 20d;
   }
   public Mentoring() {

   }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "tittle='" + getTittle() + '\'' +
                ", describe='" + getDescribe() + '\'' +
                ", date=" + date +
                '}';
    }
}