package com.uom.saas.entiry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("first_aids")
public class FirstAid {

    @Id
    private int id;
    private String emergency;
    private String firstAid;

    public FirstAid(int id, String emergency, String firstAid) {
        this.id = id;
        this.emergency = emergency;
        this.firstAid = firstAid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmergency(String emergency) {
        this.emergency = emergency;
    }

    public void setFirstAid(String firstAid) {
        this.firstAid = firstAid;
    }

    public int getId() {
        return id;
    }

    public String getEmergency() {
        return emergency;
    }

    public String getFirstAid() {
        return firstAid;
    }
}
