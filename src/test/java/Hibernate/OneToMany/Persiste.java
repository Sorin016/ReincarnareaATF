package Hibernate.OneToMany;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Persiste {
    public static void main(String[] args) {
        Laptop laptopSorin = new Laptop();
        Laptop laptopAdriana = new Laptop();
        laptopSorin.setID(1);
        laptopSorin.setMarka("Mac");
        laptopAdriana.setID(2);
        laptopAdriana.setMarka("Acer");

        Student studentSorin = new Student();
        studentSorin.setID(1);
        studentSorin.setNume("Cucereavu");
        studentSorin.setPrenume("sorin");
        studentSorin.setVirsta(28);
        studentSorin.getLaptop().add(laptopSorin);

        Student studentAdriana = new Student();
        studentAdriana.setID(2);
        studentAdriana.setNume("Cucereavu");
        studentAdriana.setPrenume("adriana");
        studentAdriana.setVirsta(26);
        studentAdriana.getLaptop().add(laptopAdriana);

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
