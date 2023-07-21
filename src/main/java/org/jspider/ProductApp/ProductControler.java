package org.jspider.ProductApp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class ProductControler {
    List<Product>productData=new ArrayList<>();

    {
        productData.add(new Product(1,"Mobile",12222));
        productData.add(new Product(2,"Laptop",12222));
        productData.add(new Product(3,"TV",2222));

    }


  @GetMapping("/")
  public String getAllProduct(Model model){
      model.addAttribute("record",productData);
      return "productList";
  }

  @GetMapping("/addProduct")
  public String displayProductForm(Model model){
        model.addAttribute("product",new Product());
        return "addProduct";
  }
  public String addProductDetail(Product p){
        productData.add(p);
        return "redirect:/";

  }

  @GetMapping("/updateProduct/{id}")
  public String showUpdateForm(@PathVariable (value = "id")int id, Model model){
        Product p=productData.get(id-1);
        model.addAttribute("product",p);
        return "updateProduct";

  }

}
