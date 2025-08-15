package io.github.Guimaraes131.ovni;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping("/ovni")
public class OvniController {

    private final OvniService service;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("ovnis", service.index());
        return "index";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @PostMapping("/form")
    public String create(Ovni ovni, RedirectAttributes redirect){
        service.save(ovni);
        redirect.addFlashAttribute("message", "Ovni criado com sucesso!");
        return "redirect:/ovni";
    }
}
