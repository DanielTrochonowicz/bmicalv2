package pl.bmicalv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.bmicalv2.models.BmiCalc;
import pl.bmicalv2.models.BmrCalc;
import pl.bmicalv2.models.PerfectWeight;

@Controller
public class CalcControler {

    private double weight;
    private double height;

    @GetMapping("/calculate")
    public String getBmr(@RequestParam double height, @RequestParam double weight, ModelMap map, @RequestParam int age,
                         @RequestParam String activity, @RequestParam(value = "gender") String gender) {


        BmiCalc bmiCalc = new BmiCalc(height, weight);
        PerfectWeight perfectWeight = new PerfectWeight(height, weight);
        map.put("description", (bmiCalc.getBmiDescription()));
        map.put("perfectWeight", perfectWeight.getPerfectWeight());
        BmrCalc bmrCalc = new BmrCalc(height, weight, age, gender, activity);
        map.put("bmr", (bmrCalc.getBmrDescription()));
        return "calculate";
    }

    @GetMapping("/")
    public String homePage() {
        return "home";
    }
}
