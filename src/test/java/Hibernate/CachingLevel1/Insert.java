package Hibernate.CachingLevel1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
    public static void main(String[] args) {
        Alien alien=new Alien();
        alien.setAid(102);
        alien.setAname("dan");
        alien.setColor("albastru");

        Configuration configuration=new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        //Caching level 1 chiar daca ai de mai multe ori intrebare la DB, dar returnezi aceeisa informatie,
//        sistema intelege si foloseste caching level 1 care este integrat automat si inloca sa foloseasca resursele din nou
//                el iti returneaza deja raspunsul gata deoarece informatia este stocata in cachs

        Alien a=(Alien)session.find(Alien.class,102);
        Alien a1=(Alien)session.find(Alien.class,102);
        transaction.commit();
        session.close();

    }
}
