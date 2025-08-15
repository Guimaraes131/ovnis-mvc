package io.github.Guimaraes131.ovni;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
