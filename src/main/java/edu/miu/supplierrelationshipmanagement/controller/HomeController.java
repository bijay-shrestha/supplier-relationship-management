package edu.miu.supplierrelationshipmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Controller
public class HomeController {

    @GetMapping(value = {"/", "/srm", "/home", "/srm/home"})
    public String displayHomePage(){
        return "public/index";
    }
}
