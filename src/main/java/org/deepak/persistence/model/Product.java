package org.deepak.persistence.model;

import java.util.UUID;

public class Product
{
   private long id;
   
   private String uniqueKey;
   
   private String name;
   
   private float price;

   public Product( String name, float price )
   {
      this.uniqueKey = UUID.randomUUID().toString();
      this.name = name;
      this.price = price;
   }
   
   public Product()
   {
      
   }

   /**
    * @return the id
    */
   public long getId()
   {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId( long id )
   {
      this.id = id;
   }

   /**
    * @return the uniqueKey
    */
   public String getUniqueKey()
   {
      return uniqueKey;
   }

   /**
    * @param uniqueKey the uniqueKey to set
    */
   public void setUniqueKey( String uniqueKey )
   {
      this.uniqueKey = uniqueKey;
   }

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName( String name )
   {
      this.name = name;
   }

   /**
    * @return the price
    */
   public float getPrice()
   {
      return price;
   }

   /**
    * @param price the price to set
    */
   public void setPrice( float price )
   {
      this.price = price;
   }
   
}
