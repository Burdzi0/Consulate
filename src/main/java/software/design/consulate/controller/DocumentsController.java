package software.design.consulate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import software.design.consulate.model.dto.CreateDocumentDto;
import software.design.consulate.model.dto.decision.CreateDecisionDto;
import software.design.consulate.service.DocumentsService;

@Controller
@RequestMapping("/document")
public class DocumentsController {

    private DocumentsService documentsService;

    public DocumentsController(DocumentsService documentsService) {
        this.documentsService = documentsService;
    }

    @GetMapping(value = {"", "/", "/index", "/index.html"})
    public ModelAndView applications() {
        final ModelAndView mav = new ModelAndView("documents/documents");
        mav.addObject("docs", documentsService.findAll());
        return mav;
    }

    @GetMapping(value = "/delete/{id}")
    public RedirectView delete(@PathVariable Long id) {
        documentsService.delete(id);
        return new RedirectView("/document");
    }

    @PostMapping("/save")
    public RedirectView save(@ModelAttribute("createDocumentDto") CreateDocumentDto createDocumentDto) {
        documentsService.save(createDocumentDto);
        return new RedirectView("/document");
    }

    @GetMapping(value = {"/new", "/new_document"})
    public ModelAndView newDecision() {
        final ModelAndView mav = new ModelAndView("documents/new_document");
        mav.addObject("createDocumentDto", new CreateDocumentDto());
        return mav;
    }


}
