package Desafio_JAVA.Desafio1;

class Course extends Content{
    private int workload;

    public double calculateXP(){
        return defaultXP*workload;
    }
    public Course() {

    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "{" +
                "tittle='" + getTittle() + '\'' +
                ", describe='" + getDescribe() + '\'' +
                ", workload=" + workload +
                '}';
    }
}