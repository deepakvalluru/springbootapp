package org.deepak.persistence.repo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.deepak.persistence.model.Product;

public class ProductRepository
{
   public static List< Product > getAllProducts()
   {
      return Stream.< Product > builder()
                   .add( new Product( "product1", 10 ) )
                   .add( new Product( "product2", 15 ) )
                   .build()
                   .collect( Collectors.toList() );
   }
}
