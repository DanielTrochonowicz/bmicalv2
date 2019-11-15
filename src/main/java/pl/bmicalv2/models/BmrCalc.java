package pl.bmicalv2.models;

import java.text.DecimalFormat;

public class BmrCalc {

    private double height;
    private double weight;
    private int age;
    private String gender;
    private String activity;

    public BmrCalc(){

    }

    public BmrCalc(double height, double weight, int age, String gender, String activity) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.activity = activity;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }


    public String getBmrDescription(){

        String bmrResult = "";
        double bmr = 9.99 * weight + ((6.25 * weight) - (4.92 * age));

        if (gender.equals("mele")){
            bmr +=5;
        }else {
            bmr -=161;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        switch (activity){
            case "lazy":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + decimalFormat.format(1.2 * bmr) + " kalorii";
                break;
            case "low":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + decimalFormat.format(1.3 * bmr) + " - " + decimalFormat.format(1.4 * bmr) + " kalorii";
                break;

            case "regular":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + decimalFormat.format(1.5 * bmr) + " - " + decimalFormat.format(1.6 * bmr) + " kalorii";
                break;

            case "sport":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + decimalFormat.format(1.7 * bmr) + " - " + decimalFormat.format(1.8 * bmr) + " kalorii";
                break;

            case "pro":
                bmrResult = "Twoje zapotrzebowanie kaloryczne wynosi: " + decimalFormat.format(1.9 * bmr) + " - " + decimalFormat.format(2.2 * bmr) + " kalorii";
                break;

            default:
                bmrResult = "Podałeś niepoprawne dane, nie można obliczyć wartości zapotrzebowania kalorycznego!";
                break;
        }
        return bmrResult;
    }
}
