import org.hibernate.*;
import org.hibernate.cfg.*;
public class Logic {
    public static void main(String[] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Product s=(Product) session.load(Product.class,new Integer(101));
        System.out.println("Loaded object productID  is___"+s.getProductId());
        System.out.println("Loaded object product name is___"+s.getProName());
        System.out.println("Loaded object product price is___"+s.getPrice());
        System.out.println("Object Loaded successfully.....!!");
        session.close();        
        factory.close();    
        }
 
}
