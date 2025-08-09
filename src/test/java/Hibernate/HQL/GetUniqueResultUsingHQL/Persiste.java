package Hibernate.HQL.GetUniqueResultUsingHQL;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Persiste {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        int c=6;

        Query q=session.createQuery("from Student where ID=1");
        Query q1=session.createQuery("Select ID, virsta from Student where ID=1");
        Query q2=session.createQuery("Select sum(ID) from Student");
        //atrage atentia ca daca in tabel este denumit coloana altfel decit in tabel din DB atunci nu o sa mearga cu
        // denumirea din DB ci cu denumitea variabilei din java deoarece hibernate este framework al ORM si lucreaza
        // el cu variabile si obiecte din java
        Query q3=session.createQuery("Select s.prenume from Student s where s.id= :c");
        q3.setParameter("c",c);

        var ss=q.uniqueResult();
        System.out.println(ss);

        List<Object[]> sss=(List<Object[]>)q1.list();
        for(Object[]gg:sss)
            System.out.println(gg[0]=" "+gg[1]);

        var xx=q2.uniqueResult();
        System.out.println(xx);

        var cc=q3.uniqueResult();
        System.out.println(" valoarea este "+cc);


        transaction.commit();
        session.close();
    }
}
