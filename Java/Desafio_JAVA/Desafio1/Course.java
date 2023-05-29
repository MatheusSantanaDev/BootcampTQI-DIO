
class Course{
    private String tittle;
    private String describe;
    private int workload;

    public String getTittle() {
        return tittle;
    }

    public String getDescribe() {
        return describe;
    }

    public int getWorkload() {
        return workload;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "{" +
                "tittle='" + tittle + '\'' +
                ", describe='" + describe + '\'' +
                ", workload=" + workload +
                '}';
    }
}