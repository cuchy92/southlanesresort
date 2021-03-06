package southlanesresort.roomreservations.newhotelroomreservation;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class RoomReservation implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Customer E-mail")
   private java.lang.String customerEmail;

   @org.kie.api.definition.type.Label("Fullname")
   private java.lang.String customerName;

   @org.kie.api.definition.type.Label("Mobile")
   private java.lang.Integer customerMobile;

   @org.kie.api.definition.type.Label("Number of rooms")
   private java.lang.Integer numberOfRooms;

   @org.kie.api.definition.type.Label("Type of rooms")
   private java.lang.String typeOfRooms;

   @org.kie.api.definition.type.Label(value = "From")
   private java.util.Date from;

   @org.kie.api.definition.type.Label(value = "To")
   private java.util.Date to;

   public RoomReservation()
   {
   }

   public java.lang.String getCustomerEmail()
   {
      return this.customerEmail;
   }

   public void setCustomerEmail(java.lang.String customerEmail)
   {
      this.customerEmail = customerEmail;
   }

   public java.lang.String getCustomerName()
   {
      return this.customerName;
   }

   public void setCustomerName(java.lang.String customerName)
   {
      this.customerName = customerName;
   }

   public java.lang.Integer getCustomerMobile()
   {
      return this.customerMobile;
   }

   public void setCustomerMobile(java.lang.Integer customerMobile)
   {
      this.customerMobile = customerMobile;
   }

   public java.lang.Integer getNumberOfRooms()
   {
      return this.numberOfRooms;
   }

   public void setNumberOfRooms(java.lang.Integer numberOfRooms)
   {
      this.numberOfRooms = numberOfRooms;
   }

   public java.lang.String getTypeOfRooms()
   {
      return this.typeOfRooms;
   }

   public void setTypeOfRooms(java.lang.String typeOfRooms)
   {
      this.typeOfRooms = typeOfRooms;
   }

   public java.util.Date getFrom()
   {
      return this.from;
   }

   public void setFrom(java.util.Date from)
   {
      this.from = from;
   }

   public java.util.Date getTo()
   {
      return this.to;
   }

   public void setTo(java.util.Date to)
   {
      this.to = to;
   }

   public RoomReservation(java.lang.String customerEmail,
         java.lang.String customerName, java.lang.Integer customerMobile,
         java.lang.Integer numberOfRooms, java.lang.String typeOfRooms,
         java.util.Date from, java.util.Date to)
   {
      this.customerEmail = customerEmail;
      this.customerName = customerName;
      this.customerMobile = customerMobile;
      this.numberOfRooms = numberOfRooms;
      this.typeOfRooms = typeOfRooms;
      this.from = from;
      this.to = to;
   }

}