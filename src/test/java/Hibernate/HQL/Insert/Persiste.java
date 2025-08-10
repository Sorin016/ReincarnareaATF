package Hibernate.HQL.Insert;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

public class Persiste {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        NativeQuery query = session.createNativeQuery("Insert into Student (ID,numele,prenumele,virsta,laptop_ID) values " +
                        "(:id,:numele,:prenumele,:virsta,:laptop_ID)")
                .setParameter("id", 108)
                .setParameter("numele", "John")
                .setParameter("prenumele", "doe")
                .setParameter("virsta", 29)
                .setParameter("laptop_ID", 7);

        query.executeUpdate();

        transaction.commit();
        session.close();
    }
}
