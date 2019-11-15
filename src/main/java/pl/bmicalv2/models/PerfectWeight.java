package pl.bmicalv2.models;

import java.text.DecimalFormat;

public class PerfectWeight {

    private double height;
    private double weight;
    DecimalFormat decimalFormat = new DecimalFormat();


    public PerfectWeight(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPerfectWeight(){
        return "Idealna waga dla Twojego wzrostu to (" + height + "cm) wynośi: " +
                decimalFormat.format((0.0001 * height * height * 18.5)) + "Kg - " +
                decimalFormat.format((0.0001 * height * height * 25)) + "Kg";
    }

}
