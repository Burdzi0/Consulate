package software.design.consulate.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import software.design.consulate.model.dto.StatusChangeDto;
import software.design.consulate.model.dto.application.ApplicationDto;
import software.design.consulate.model.dto.application.CreateApplicationDto;
import software.design.consulate.model.dto.application.EditApplicationDto;
import software.design.consulate.service.ApplicationService;
import software.design.consulate.service.OfficialMatterService;

@Controller
@RequestMapping("/application")
public class ApplicationController {

    private ApplicationService applicationService;
    private OfficialMatterService matterService;

    public ApplicationController(ApplicationService applicationService, OfficialMatterService matterService) {
        this.applicationService = applicationService;
        this.matterService = matterService;
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
        mav.addObject("createApplicationDto", new CreateApplicationDto());
        return mav;
    }

    @GetMapping(value = "/delete/{id}")
    public RedirectView delete(@PathVariable Long id) {
        if (!matterService.existForApplication(id)) {
            applicationService.delete(id);
        }
        return new RedirectView("/application", false);
    }

    @GetMapping(value = {"/info/{applicationId}"})
    public ModelAndView info(@PathVariable Long applicationId) {
        final ModelAndView mav = new ModelAndView("application/application_info");
        final var app = applicationService.getByLocalId(applicationId);
        mav.addObject("app", app);
        mav.addObject("display", matterService.existForApplication(app.getLocalId()));
        mav.addObject("statusChange", new StatusChangeDto());
        return mav;
    }

    @GetMapping(value = {"/infojs/{applicationId}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ApplicationDto infoAsJson(@PathVariable Long applicationId) {
        return applicationService.getByLocalId(applicationId);
    }

    @GetMapping(value = {"/edit/{applicationId}"})
    public ModelAndView edit(@PathVariable Long applicationId) {
        final ModelAndView mav = new ModelAndView("application/edit_application");
        mav.addObject("toBeUpdated", applicationService.getByLocalId(applicationId));
        mav.addObject("setId", applicationId);
        mav.addObject("editApplicationDto", new EditApplicationDto());
        return mav;
    }

    @PostMapping(value = {"/edit"})
    public RedirectView submitEdit(@ModelAttribute("editApplicationDto") EditApplicationDto editApplicationDto) {
        applicationService.edit(editApplicationDto);
        return new RedirectView("");
    }

    @PostMapping(value = "/save")
    public RedirectView save(@ModelAttribute("applicationDto") CreateApplicationDto applicationDto) {
        applicationService.save(applicationDto);
        return new RedirectView("");
    }

    @PostMapping(value = "/apply/{id}")
    public RedirectView apply(@PathVariable Long id, @ModelAttribute("manage") StatusChangeDto statusChange) {
        matterService.createOrRejectMatter(id, statusChange.getManage());
        return new RedirectView("/application");
    }

}
