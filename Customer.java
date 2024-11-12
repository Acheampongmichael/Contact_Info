/**
   The Customer class stores data about a person 
   who is a customer for the Person and Customer 
   Classes programming challenge.
*/

public class Customer extends Person
{
   private String customerNumber;
   private boolean isMailingList;

   public Customer(String name, String address, String number, String customerNumber,boolean isMail){
      super(name,address,number);
      this.customerNumber = customerNumber;
      this.isMailingList = isMail;
   }
 // Setters
   public void setCustomerNumber(String number){
   this.customerNumber = number;
   }

   public void setMailingList(boolean mail){
      this.isMailingList = mail;
   }

   // Getters
   public String getCustomerNumber(){
      return this.customerNumber;
   }

   public boolean getMailingList(){
      return this.isMailingList;
   }
}
