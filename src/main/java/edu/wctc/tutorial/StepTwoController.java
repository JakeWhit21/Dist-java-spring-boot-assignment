package edu.wctc.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StepTwoController {
    @RequestMapping("/how-to-step-two")
    public String showStepOne() {
        return"pages/how-to-two";
    }
}
