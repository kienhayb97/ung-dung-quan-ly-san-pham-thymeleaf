package com.codegym.controller;

import com.codegym.model.product;
import com.codegym.service.productService;
import com.codegym.service.productServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.LastModified;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class productController {
    private productService productService = new productServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("product", productService.findAll());
        return "index";
    }
    @GetMapping("/product/create")
    public String create(Model model){
        model.addAttribute("product", new product());
        return "create";
    }
    @PostMapping("/product/save")
    public String save(product product, RedirectAttributes redirect) {
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        redirect.addFlashAttribute("success", "saved product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }
    @PostMapping("/product/update")
    public String update(product product, RedirectAttributes redirect){
        productService.update(product.getId(), product);
        redirect.addFlashAttribute("success", "Modufied product successfully" );
        return "redirect:/";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("product", productService.findById(id));
    return "delete";
    }
    @PostMapping("/product/delete")
    public String delete(product product, RedirectAttributes redirect){
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed product successfully!");
        return "redirect:/";
    }
    @GetMapping("/product/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "view";
    }

}
