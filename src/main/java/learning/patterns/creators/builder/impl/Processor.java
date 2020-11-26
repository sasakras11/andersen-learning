package learning.patterns.creators.builder.impl;

public class Processor {
    private int coresCount;
    private String company;

    public Processor(int coresCount, String company) {
        this.coresCount = coresCount;
        this.company = company;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "coresCount=" + coresCount +
                ", company='" + company + '\'' +
                '}';
    }
}
