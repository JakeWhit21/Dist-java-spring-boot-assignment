package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StepThreeController {
    @RequestMapping("/how-to-step-three")
    public String showStepOne() {
        return"pages/how-to-three";
    }
}
