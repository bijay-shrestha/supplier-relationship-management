package edu.miu.supplierrelationshipmanagement.controller;

import edu.miu.supplierrelationshipmanagement.model.Product;
import edu.miu.supplierrelationshipmanagement.model.Supplier;
import edu.miu.supplierrelationshipmanagement.service.ProductService;
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
@RequestMapping(value = {"/srm/product"})
public class ProductController {

    private final ProductService productService;
    private final SupplierService supplierService;

    public ProductController(ProductService productService,
                             SupplierService supplierService) {
        this.productService = productService;
        this.supplierService = supplierService;
    }

    @GetMapping(value = "/list")
    public ModelAndView listSuppliers() {
        var products = productService.getAllProducts();
        var modelAndView = new ModelAndView();
        modelAndView.addObject("products", products);
        modelAndView.addObject("size", products.size());
        modelAndView.setViewName("secured/product/list");
        return modelAndView;
    }

    @GetMapping(value = "/new")
    public String displayNewProductForm(Model model) {
        var suppliers = supplierService.getAllSuppliers();
        var product = new Product();
        Integer supplierId=0;
        model.addAttribute("product", product);
        model.addAttribute("suppliers", suppliers);
        return "secured/product/new";
    }

    @PostMapping(value = {"/new"}) // PRG: Post-Redirect-Get
    public String addNewProduct(@Valid @ModelAttribute("product") Product product,
                                 BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("product", product);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "secured/product/new";
        }
        productService.addProduct(product);
        return "redirect:/srm/product/list";
    }

}
