package edu.wctc.tutorial;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StepOneController {
    @RequestMapping("/how-to-step-one")
    public String showStepOne() {
        return"pages/how-to-one";
    }
}
