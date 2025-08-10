package Hibernate.HQL.Update;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Persiste {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery query = session.createNativeQuery("UPDATE Student SET ID= :id " +
                        "where ID= 108")
                .setParameter("id", 7);

        query.executeUpdate();

        transaction.commit();
        session.close();
    }
}
