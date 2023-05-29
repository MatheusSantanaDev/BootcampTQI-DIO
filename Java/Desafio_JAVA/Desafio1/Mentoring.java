
import java.time.LocalDate;

class Mentoring{
   private String tittle;
   private String describe;
   private LocalDate date;

    public String getTittle() {
        return tittle;
    }

    public String getDescribe() {
        return describe;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                "tittle='" + tittle + '\'' +
                ", describe='" + describe + '\'' +
                ", date=" + date +
                '}';
    }
}