package software.design.consulate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import software.design.consulate.model.dto.matter.EditOfficialMatterDto;
import software.design.consulate.service.OfficialMatterService;

@Controller
@RequestMapping("/matter")
public class OfficialMatterController {

    private OfficialMatterService officialMatterService;

    public OfficialMatterController(OfficialMatterService decisionService) {
        this.officialMatterService = decisionService;
    }

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public ModelAndView index() {
        final ModelAndView mav = new ModelAndView("matter/official_matters");
        mav.addObject("matters", officialMatterService.findAll());
        return mav;
    }

    @GetMapping(value = "/delete/{id}")
    public RedirectView delete(@PathVariable Long id) {
        officialMatterService.delete(id);
        return new RedirectView("/matter");
    }

    @GetMapping(value = {"/info/{id}"})
    public ModelAndView matterInfo(@PathVariable Long id) {
        final ModelAndView mav = new ModelAndView("matter/matter_info");
        mav.addObject("matter", officialMatterService.getByLocalId(id));
        return mav;
    }

    @GetMapping(value = {"/edit/{id}"})
    public ModelAndView edit(@PathVariable Long id) {
        final ModelAndView mav = new ModelAndView("matter/matter_edit");
        mav.addObject("officialMatter", officialMatterService.getByLocalId(id));
        mav.addObject("matterId", id);
        mav.addObject("editOfficialMatterDto", new EditOfficialMatterDto());
        return mav;
    }

    @PostMapping(value = {"/edit/{id}"})
    public RedirectView editSubmit(@ModelAttribute("editOfficialMatterDto") EditOfficialMatterDto editOfficialMatterDto, @PathVariable Long id) {
        final var matter = officialMatterService.getByLocalId(id);
        officialMatterService.edit(matter, editOfficialMatterDto);
        return new RedirectView("/matter");
    }
//
//    @PostMapping(value = {"/edit"})
//    public RedirectView submitEdit(@ModelAttribute("editApplicationDto") EditApplicationDto editApplicationDto) {
//        officialMatterService.edit(editApplicationDto);
//        return new RedirectView("");
//    }
}
