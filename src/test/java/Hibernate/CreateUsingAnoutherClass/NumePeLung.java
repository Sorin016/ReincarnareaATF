package Hibernate.CreateUsingAnoutherClass;

import jakarta.persistence.Embeddable;

@Embeddable
public class NumePeLung {
    private String fName;
    private String lName;
    private String fathersName;

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


}
