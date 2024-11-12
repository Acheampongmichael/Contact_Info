/**
   The Person class stores data about a person for the
   Person and Customer Classes programming challenge.
*/
public class Person
{
   private String name;
   private String address;
   private String number;

   Person(String name, String address, String number){
      this.name = name;
      this.address = address;
      this.number = number;
   }
// Setters
   public void setName(String name){
      this.name = name;
   }

   public void setAddress(String address){
      this.address = address;
   }

   public void setNumber(String number){
      this.number = number;
   }

   // Getters
   public String getName(){
      return this.name;
   }

   public String getAddress(){
      return this.address;
   }

   public String getPhone(){
      return this.number;
   }
}
