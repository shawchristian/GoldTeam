import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmp 
{
   public static void main(String[] args) 
   {
      Configuration cfg = new Configuration();
      cfg.configure(“Hibernate.cfg.xml”);
      SessionFactory sf = cfg.buildSessionFactory();
      Session s = sf.openSession();
      Transaction tx = s.beginTransaction();
      Employee emp = new Employee();
      emp.setId(2);
      emp.setName(“Chad”);
      emp.setMobile(2099812787);
      emp.setEmail(“chaduras@hotmail.com”);
      s.save(emp);
      s.flush();
      tx.commit();
      s.close();
   }
}