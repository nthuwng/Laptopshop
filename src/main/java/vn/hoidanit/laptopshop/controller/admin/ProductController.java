package vn.hoidanit.laptopshop.controller.admin;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.hoidanit.laptopshop.domain.Product;
import vn.hoidanit.laptopshop.service.UploadService;

@Controller
public class ProductController {
    @GetMapping("/admin/product")
    public String getDashboard() {
        return "/admin/product/show";
    }

    @GetMapping("/admin/product/create")
    public String getCreateProductPage(Model model) { // trùng tên nhưng vì không đặt method nên nó sẽ hiểu là GET
        model.addAttribute("newProduct", new Product());
        return "/admin/product/create";
    }
}
