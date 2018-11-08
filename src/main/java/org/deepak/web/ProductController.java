package org.deepak.web;

import java.util.List;

import org.deepak.persistence.model.Product;
import org.deepak.persistence.repo.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( value = "/api/products" )
public class ProductController
{
   @RequestMapping ( method = RequestMethod.GET, value = "/all" )
   public List<Product> homePage()
   {
      return ProductRepository.getAllProducts();
   }
}
