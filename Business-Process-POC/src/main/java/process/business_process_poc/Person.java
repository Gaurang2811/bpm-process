package process.business_process_poc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Name")
   private java.lang.String name;
   @org.kie.api.definition.type.Label(value = "Gender")
   private java.lang.String gender;
   @org.kie.api.definition.type.Label(value = "Age")
   private java.lang.String age;
   @org.kie.api.definition.type.Label(value = "Principle Ammount")
   private java.lang.Double principle;
   @org.kie.api.definition.type.Label(value = "Time")
   private java.lang.Double time;
   @org.kie.api.definition.type.Label(value = "Marital Status")
   private java.lang.String maritalStatus;
   @org.kie.api.definition.type.Label(value = "Eligible or Not")
   private java.lang.Boolean isEligible;

   public Person()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getGender()
   {
      return this.gender;
   }

   public void setGender(java.lang.String gender)
   {
      this.gender = gender;
   }

   public java.lang.String getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.String age)
   {
      this.age = age;
   }

   public java.lang.Double getPrinciple()
   {
      return this.principle;
   }

   public void setPrinciple(java.lang.Double principle)
   {
      this.principle = principle;
   }

   public java.lang.Double getTime()
   {
      return this.time;
   }

   public void setTime(java.lang.Double time)
   {
      this.time = time;
   }

   public java.lang.String getMaritalStatus()
   {
      return this.maritalStatus;
   }

   public void setMaritalStatus(java.lang.String maritalStatus)
   {
      this.maritalStatus = maritalStatus;
   }

   public java.lang.Boolean getIsEligible()
   {
      return this.isEligible;
   }

   public void setIsEligible(java.lang.Boolean isEligible)
   {
      this.isEligible = isEligible;
   }

   public Person(java.lang.String name, java.lang.String gender,
         java.lang.String age, java.lang.Double principle,
         java.lang.Double time, java.lang.String maritalStatus,
         java.lang.Boolean isEligible)
   {
      this.name = name;
      this.gender = gender;
      this.age = age;
      this.principle = principle;
      this.time = time;
      this.maritalStatus = maritalStatus;
      this.isEligible = isEligible;
   }

}