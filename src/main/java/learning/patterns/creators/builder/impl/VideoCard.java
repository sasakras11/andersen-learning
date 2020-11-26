package learning.patterns.creators.builder.impl;

public class VideoCard {
    private String company;
    private int memoryGBCount;

    public VideoCard(String company, int memoryGBCount) {
        this.company = company;
        this.memoryGBCount = memoryGBCount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMemoryGBCount() {
        return memoryGBCount;
    }

    public void setMemoryGBCount(int memoryGBCount) {
        this.memoryGBCount = memoryGBCount;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "company='" + company + '\'' +
                ", memoryGBCount=" + memoryGBCount +
                '}';
    }
}
