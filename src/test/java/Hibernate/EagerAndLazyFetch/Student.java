package Hibernate.EagerAndLazyFetch;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int ID;
    @Column(name = "numele")
    private String nume;
    @Column(name = "prenumele")
    private String prenume;
    private int virsta;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "student",fetch = FetchType.EAGER)

    private List<Laptop> laptop=new ArrayList<>();

    public int getVirsta() {
        return virsta;
    }

    public void setVirsta(int virsta) {
        this.virsta = virsta;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Laptop> getLaptop() {
        return laptop;
    }

    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

}
