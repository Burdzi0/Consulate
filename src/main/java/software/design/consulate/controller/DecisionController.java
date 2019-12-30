package software.design.consulate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
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
    public RedirectView save(@ModelAttribute("applicationDto") CreateDecisionDto createDecisionDto) {
        decisionService.save(createDecisionDto);
        return new RedirectView("");
    }

    @GetMapping(value = "/{id}")
    public RedirectView save(@PathVariable Long id) {
        decisionService.delete(id);
        return new RedirectView("");
    }
}
