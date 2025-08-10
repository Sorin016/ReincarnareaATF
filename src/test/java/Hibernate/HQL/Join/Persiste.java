package Hibernate.HQL.Join;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Persiste {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Student> students = session.createQuery(
                        "select s from Student s join s.laptop l where l.marka = :marka", Student.class)
                .setParameter("marka", "Mac")
                .getResultList();

        for(Student s : students){
            System.out.println(s);
        }

        transaction.commit();
        session.close();
    }
}
