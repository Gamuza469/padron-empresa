package com.example.padron.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.StringJoiner;

@Entity
@Table(name = "person_phone")
public class Phone implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "area_code")
    private Integer areaCode;
    private Long number;

    @ManyToOne
    private Person person;

    public Phone () {}

    public Phone (Integer id, Integer areaCode, Long number) {
        this.id = id;
        this.areaCode = areaCode;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        Integer personId = null;

        if (this.getPerson() != null) {
            personId = getPerson().getId();
        }

        return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
            .add("id=" + id)
            .add("personId=" + personId)
            .add("areaCode=" + areaCode)
            .add("number=" + number)
            .toString();
    }
}
