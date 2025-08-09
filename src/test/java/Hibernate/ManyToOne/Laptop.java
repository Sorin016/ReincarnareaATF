package Hibernate.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Laptop {
    @Id
    private int ID;
    private String marka;
    @ManyToOne
    private Student student;

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
