package Hibernate.HQL.Sql;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;

import java.util.List;

public class Persiste {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        NativeQuery query = session.createNativeQuery("SELECT * FROM student");
        query.addEntity(Student.class);
        List<Object> list=query.list();
        list.forEach(e-> System.out.println(e));
        transaction.commit();
        session.close();
    }
}
