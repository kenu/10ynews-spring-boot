package org.platanus.tenynews;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {
    private final DateService dateService;

    @GetMapping
    public String home(Model model){
        model.addAttribute("today", dateService.get10YearsAgoToday());
        model.addAttribute("query", dateService.getQuery());
        return "home";
    }
}
