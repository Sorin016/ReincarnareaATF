package Hibernate.CreateUsingAnoutherClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertUsingAnotherClass {
    public static void main(String[] args) {

        NumePeLung sorin=new NumePeLung();
        sorin.setfName("sorin");
        sorin.setlName("Cucereavu");
        sorin.setFathersName("oleg");

        AlienCreateAnotherClass alienCreateAnotherClass=new AlienCreateAnotherClass();
        alienCreateAnotherClass.setAid(101);
        alienCreateAnotherClass.setAname(sorin);
        alienCreateAnotherClass.setColor("albastru");


        Configuration configuration=new Configuration().configure().addAnnotatedClass(AlienCreateAnotherClass.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(alienCreateAnotherClass);
        transaction.commit();
        session.close();
    }
}
