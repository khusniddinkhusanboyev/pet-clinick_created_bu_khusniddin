package uz.brogrammers.petclinick.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.brogrammers.petclinick.service.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets(Model model) {
        var list = vetService.findAll().stream()
                .toList();
        model.addAttribute("vets", list);
        return "vet/vet";
    }

}
