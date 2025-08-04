package Hibernate.Read;

import Hibernate.Create.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetOrSelect {
    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Alien alienSelect = session.find(Alien.class, 104);
        System.out.println(alienSelect.getAname());
        transaction.commit();
        session.close();
    }
}
