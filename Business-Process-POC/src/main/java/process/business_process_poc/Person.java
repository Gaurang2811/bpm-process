package process.business_process_poc;

import org.hibernate.validator.constraints.NotBlank;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Name")
   @NotBlank
   @Valid
   private java.lang.String name;
   
   @org.kie.api.definition.type.Label("Gender")
   @NotBlank
   private java.lang.String gender;
   
   @org.kie.api.definition.type.Label("Age")
   @NotBlank
   private java.lang.String age;
   
   @org.kie.api.definition.type.Label("Time")
   @NotBlank
   private java.lang.Double time;
   
   @org.kie.api.definition.type.Label("Marital Status")
   private java.lang.String maritalStatus;
   
   @org.kie.api.definition.type.Label("Eligible or Not")
   private java.lang.Boolean isEligible;

   @org.kie.api.definition.type.Label("Principle Ammount")
   @NotBlank
   private java.lang.Double amount;

   @org.kie.api.definition.type.Label(value = "Rate")
   private java.lang.Double rate;

   @org.kie.api.definition.type.Label(value = "Simple Interest")
   private java.lang.Double interest;

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

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public java.lang.Double getRate()
   {
      return this.rate;
   }

   public void setRate(java.lang.Double rate)
   {
      this.rate = rate;
   }

   public java.lang.Double getInterest()
   {
      return this.interest;
   }

   public void setInterest(java.lang.Double interest)
   {
      this.interest = interest;
   }

   public Person(java.lang.String name, java.lang.String gender,
         java.lang.String age, java.lang.Double time,
         java.lang.String maritalStatus, java.lang.Boolean isEligible,
         java.lang.Double amount, java.lang.Double rate,
         java.lang.Double interest)
   {
      this.name = name;
      this.gender = gender;
      this.age = age;
      this.time = time;
      this.maritalStatus = maritalStatus;
      this.isEligible = isEligible;
      this.amount = amount;
      this.rate = rate;
      this.interest = interest;
   }
   
   	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", time=" + time + ", maritalStatus="
				+ maritalStatus + ", isEligible=" + isEligible + ", amount=" + amount + ", rate=" + rate + ", interest="
				+ interest + "]";
	}
	
	
}