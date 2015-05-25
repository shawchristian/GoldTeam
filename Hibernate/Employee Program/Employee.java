import java.io.Serializable;
//This class will describe what makes an emplyee
public class Employee implements Serializable
{
   //employeeID
   private int id ;
   //employeeName
   private String name;
   //empplyeeMobilePhone
   private long mobile;
   //employeeEmail
   private String email;
   public Employee(){}
   public int getId() 
   {
      return id;
   }

public void setId(int id) 
{
   this.id = id;
}
       
public String getName() 
{
   return name;
}
       
   public void setName(String name) 
{
   this.name = name;
}
       
public long getMobile() 
{
   return mobile;
}

public void setMobile(long mobile) 
{
   this.mobile = mobile;
}

public String getEmail() 
{
   return email;
}

public void setEmail(String email) 
{
   this.email = email;
}
}