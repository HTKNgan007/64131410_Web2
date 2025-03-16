package vn.nganha.SB_BMI.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiController {
	
	@GetMapping("/bmi")
	public String BMI(Model m){
		m.addAttribute("bmiResult", "Chưa có dữ liệu");
		return "tinh_bmi";
	}

	@PostMapping("/bmi")
	public String calculateBMI(@RequestParam("weight") double weight,
								@RequestParam("height") double height,
								@RequestParam(value = "isAsian", defaultValue = "false") boolean isAsian,
								Model m) {
		double bmi = weight / (height * height);
        String result;
        String asiaString = "";

        if (isAsian) {
        	asiaString = "Người châu Á";
            if (bmi < 18.5) {
                result = "Thiếu cân";
            } else if (bmi < 23.0) {
                result = "Bình thường";
            } else if (bmi < 25.0) {
                result = "Thừa cân";
            } else if (bmi < 30.0) {
                result = "Béo phì độ 1";
            } else {
                result = "Béo phì độ 2 (nặng)";
            }
        } else {
            if (bmi < 18.5) {
                result = "Thiếu cân";
            } else if (bmi < 25.0) {
                result = "Bình thường";
            } else if (bmi < 30.0) {
                result = "Thừa cân";
            } else if (bmi < 35.0) {
                result = "Béo phì độ 1";
            } else {
                result = "Béo phì độ 2 (nặng)";
            }
        }

        m.addAttribute("bmiResult", asiaString + "\nChỉ số BMI: " + String.format("%.2f", bmi) + " - " + result);
        return "tinh_bmi";
		
	}
}
