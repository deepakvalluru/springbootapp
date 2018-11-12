package org.deepak.web;

import java.util.List;

import org.deepak.persistence.model.Product;
import org.deepak.persistence.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( value = "/api/products" )
public class ProductController
{
   @Autowired
   private ProductService productService;

   @RequestMapping ( method = RequestMethod.GET, value = "/all" )
   public List< Product > homePage()
   {
      return productService.getAllProducts();
   }

   @RequestMapping ( method = RequestMethod.GET, value = "/find/id/{id}" )
   public Product getProductByProductId( @PathVariable ( "id" ) Long id )
   {
      return productService.findByProductId( id );
   }

   @RequestMapping ( method = RequestMethod.GET, value = "/find/key/{key}" )
   public Product getProductByProductId( @PathVariable ( "key" ) String key )
   {
      return productService.findByUniqueKey( key );
   }

   @RequestMapping ( method = RequestMethod.GET, value = "/find/name/{name}" )
   public List< Product > getProductsByProductName( @PathVariable ( "name" ) String name )
   {
      return productService.findAllProductsByName( name );
   }

   @RequestMapping ( method = RequestMethod.GET, value = "/find/name/match/{name}" )
   public List< Product > getProductsByProductNameMatch( @PathVariable ( "name" ) String name )
   {
      return productService.findMatchingProductsByContainingName( name );
   }

   @RequestMapping ( method = RequestMethod.POST, value = "/create" )
   @ResponseBody
   public Product addProduct( @RequestBody Product product )
   {
      if( productService.checkIfProductExistsById( product.getId() )  || productService.checkIfProductExistsByUniqueKey( product.getUniqueKey() ) )
      {
         return null;
      }
      return productService.saveProduct( new Product( product.getName(), product.getPrice() ) );
   }

}
