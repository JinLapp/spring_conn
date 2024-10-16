

//package spring.boot.db.connection.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dummy_table")
public class DummyEntity {
    @Id
    private Long colID;
    private String colString;

    // Getters and Setters
    public Long getColID() {
        return colID;
    }

    public void setColID(Long colID) {
        this.colID = colID;
    }

    public String getColString() {
        return colString;
    }

    public void setColString(String colString) {
        this.colString = colString;
    }
}