package Hibernate.CreateUsingAnoutherClass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AlienCreateAnotherClass {
    @Id
    @Column(name="id")
//    ca si la serializare si desirealizare
//    @Transient
    private int aid;
    @Column(name="name")
    private NumePeLung aname;
    private String color;

    public NumePeLung getAname() {
        return aname;
    }

    public void setAname(NumePeLung aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
