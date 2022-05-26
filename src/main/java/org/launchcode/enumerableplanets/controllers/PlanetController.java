package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.models.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PlanetController {
    private Planets type;

    @GetMapping
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        //System.out.println(Planets.values());
        return "index";
    }
}
