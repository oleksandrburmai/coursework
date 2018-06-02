package com.burmai.coursework.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "gpu")
@Getter
@Setter
public class Gpu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int ram;

    @Override
    public String toString() {
        return "Gpu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }

}
