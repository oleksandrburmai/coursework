package com.burmai.coursework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "cpu")
@Setter
@Getter
public class Cpu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double ghz;


    @Override
    public String toString() {
        return "Cpu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ghz=" + ghz +
                '}';
    }
}
