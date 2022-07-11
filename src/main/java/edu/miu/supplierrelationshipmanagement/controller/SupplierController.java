package edu.miu.supplierrelationshipmanagement.controller;

import edu.miu.supplierrelationshipmanagement.model.Supplier;
import edu.miu.supplierrelationshipmanagement.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * @author bijayshrestha on 7/11/22
 * @project supplier-relationship-management
 */
@Controller
@RequestMapping(value = {"/srm/supplier"})
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping(value = "/list")
    public ModelAndView listSuppliers() {
        var suppliers = supplierService.getAllSuppliers();
        var modelAndView = new ModelAndView();
        modelAndView.addObject("suppliers", suppliers);
        modelAndView.addObject("size", suppliers.size());
        modelAndView.setViewName("secured/supplier/list");
        return modelAndView;
    }

    @GetMapping(value = "/new")
    public String displayNewSupplierForm(Model model) {
        var supplier = new Supplier();
        model.addAttribute("sup", supplier);
        return "secured/supplier/new";
    }

    @PostMapping(value = {"/new"}) // PRG: Post-Redirect-Get
    public String addNewSupplier(@Valid @ModelAttribute("sup") Supplier supplier,
                                  BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("sup", supplier);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "secured/supplier/new";
        }
        supplierService.addSupplier(supplier);
        return "redirect:/srm/supplier/list";
    }


}
