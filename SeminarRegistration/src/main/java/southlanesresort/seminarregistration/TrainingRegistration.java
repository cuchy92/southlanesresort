package southlanesresort.seminarregistration;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TrainingRegistration implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Training")
   private java.lang.String training;

   @org.kie.api.definition.type.Label(value = "Employee")
   private java.lang.String employee;

   public TrainingRegistration()
   {
   }

   public java.lang.String getTraining()
   {
      return this.training;
   }

   public void setTraining(java.lang.String training)
   {
      this.training = training;
   }

   public java.lang.String getEmployee()
   {
      return this.employee;
   }

   public void setEmployee(java.lang.String employee)
   {
      this.employee = employee;
   }

   public TrainingRegistration(java.lang.String training, java.lang.String employee)
   {
      this.training = training;
      this.employee = employee;
   }

}