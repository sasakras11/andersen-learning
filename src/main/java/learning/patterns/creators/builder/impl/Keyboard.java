package learning.patterns.creators.builder.impl;

public class Keyboard {

    private int buttonCount;
    private String company;

    public Keyboard(int buttonCount, String company) {
        this.buttonCount = buttonCount;
        this.company = company;
    }

    public int getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(int buttonCount) {
        this.buttonCount = buttonCount;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "buttonCount=" + buttonCount +
                ", company='" + company + '\'' +
                '}';
    }
}
