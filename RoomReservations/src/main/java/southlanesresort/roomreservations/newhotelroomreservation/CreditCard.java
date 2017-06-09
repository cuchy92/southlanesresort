package southlanesresort.roomreservations.newhotelroomreservation;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class CreditCard implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Name on credit card")
   private java.lang.String cardHolder;

   @org.kie.api.definition.type.Label("Credit card number")
   private java.lang.Integer cardNumber;

   @org.kie.api.definition.type.Label("CVV")
   private java.lang.Integer cvv;

   @org.kie.api.definition.type.Label(value = "Validity")
   private java.util.Date validity;

   public CreditCard()
   {
   }

   public java.lang.String getCardHolder()
   {
      return this.cardHolder;
   }

   public void setCardHolder(java.lang.String cardHolder)
   {
      this.cardHolder = cardHolder;
   }

   public java.lang.Integer getCardNumber()
   {
      return this.cardNumber;
   }

   public void setCardNumber(java.lang.Integer cardNumber)
   {
      this.cardNumber = cardNumber;
   }

   public java.lang.Integer getCvv()
   {
      return this.cvv;
   }

   public void setCvv(java.lang.Integer cvv)
   {
      this.cvv = cvv;
   }

   public java.util.Date getValidity()
   {
      return this.validity;
   }

   public void setValidity(java.util.Date validity)
   {
      this.validity = validity;
   }

   public CreditCard(java.lang.String cardHolder, java.lang.Integer cardNumber,
         java.lang.Integer cvv, java.util.Date validity)
   {
      this.cardHolder = cardHolder;
      this.cardNumber = cardNumber;
      this.cvv = cvv;
      this.validity = validity;
   }

}