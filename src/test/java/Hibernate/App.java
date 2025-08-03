package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien alien=new Alien();
        alien.setAid(102);
        alien.setAname("dan");
        alien.setColor("albastru");
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(alien);
        transaction.commit();
        session.close();
    }
}
