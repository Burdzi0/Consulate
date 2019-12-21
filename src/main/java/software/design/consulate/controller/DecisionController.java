package software.design.consulate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import software.design.consulate.model.dto.CreateDecisionDto;
import software.design.consulate.service.DecisionService;

@Controller
@RequestMapping("/decision")
public class DecisionController {

    private DecisionService decisionService;

    public DecisionController(DecisionService decisionService) {
        this.decisionService = decisionService;
    }

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public ModelAndView index() {
        final ModelAndView mav = new ModelAndView("decision/index");
        mav.addObject("decisions", decisionService.findAll());
        return mav;
    }

    @GetMapping(value = {"/new_decision", "/new_decision.html"})
    public ModelAndView newDecision() {
        final ModelAndView mav = new ModelAndView("decision/new_decision");
        mav.addObject("decisionDto", new CreateDecisionDto());
        return mav;
    }

    @PostMapping(value = "/save")
    public ModelAndView save(@ModelAttribute("applicationDto") CreateDecisionDto createDecisionDto) {
        decisionService.save(createDecisionDto);
        final ModelAndView mav = new ModelAndView("decision/index");
        mav.addObject("decisions", decisionService.findAll());
        return mav;
    }
}
