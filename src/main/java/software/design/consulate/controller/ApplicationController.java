package software.design.consulate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import software.design.consulate.model.dto.CreateApplicationDto;
import software.design.consulate.service.ApplicationService;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    private ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public ModelAndView applications() {
        final ModelAndView mav = new ModelAndView("application/applications");
        mav.addObject("applications", applicationService.findAll());
        return mav;
    }

    @GetMapping(value = {"/new", "/new.html"})
    public ModelAndView newApplication() {
        final ModelAndView mav = new ModelAndView("application/new_application");
        mav.addObject("applicationDto", new CreateApplicationDto());
        return mav;
    }

    @PostMapping(value = "/save")
    public ModelAndView save(@ModelAttribute("applicationDto") CreateApplicationDto applicationDto) {
        applicationService.save(applicationDto);
        final ModelAndView mav = new ModelAndView("application/applications");
        mav.addObject("applications", applicationService.findAll());
        return mav;
    }

}
