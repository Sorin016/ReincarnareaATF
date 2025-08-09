package Hibernate.OneToOne;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Persiste {
    public static void main(String[] args) {
        Laptop laptopSorin = new Laptop();
        Laptop laptopAdriana = new Laptop();
        laptopSorin.setID(5);
        laptopSorin.setMarka("lenovo PAd");
        laptopAdriana.setID(6);
        laptopAdriana.setMarka("Microsoft");

        Student studentSorin = new Student();
        studentSorin.setID(5);
        studentSorin.setNume("Vecii");
        studentSorin.setPrenume("oleg");
        studentSorin.setVirsta(57);
        studentSorin.setLaptop(laptopSorin);
        Student studentAdriana = new Student();
        studentAdriana.setID(6);
        studentAdriana.setNume("Harara");
        studentAdriana.setPrenume("tamara");
        studentAdriana.setVirsta(61);
        studentAdriana.setLaptop(laptopAdriana);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(studentSorin);
        session.persist(studentAdriana);
        transaction.commit();
        session.close();
    }
}
