import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateEmp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Configuration cfg = new Configuration();
        cfg.configure(“Hibernate.cfg.xml”);
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();
        Employee emp = new Employee();
        emp.setId(9);
        emp.setName(“bradd pitt”);
        emp.setMobile(111111);
        emp.setEmail(“bradpitt@gmail.com”);
        s.saveOrUpdate(emp);
        s.flush();
        tx.commit();
        s.close();
    }
}