import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class SelectEmp {
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
        Employee emp = (Employee)s.get(Employee.class, new Integer(11));
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getMobile());
        System.out.println(emp.getEmail());
        s.close();
    }
}