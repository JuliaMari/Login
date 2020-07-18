package com.programem.seguranca;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TerceiraController {
    @RequestMapping("/terceira")
    public String index(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
           if (!(auth instanceof AnonymousAuthenticationToken)){
            return "terceira";
        }
        return "erro";
    }

}
