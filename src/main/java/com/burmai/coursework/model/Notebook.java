package com.burmai.coursework.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "notebook")
@Getter
@Setter
public class Notebook implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private int id;
    private String name;
    private int price;
    private Integer hdd;
    private Integer ssd;
    private double screenDiagonal;
    private String screenType;
    private String screenResolution;
    private String screenCover;
    private double weight;
    private Integer ram;
    @ManyToOne
    @JoinColumn(name = "cpu_id")
    private Cpu cpuByCpuId;
    @ManyToOne
    @JoinColumn(name = "gpu_id")
    private Gpu gpuByGpuId;

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", hdd=" + hdd +
                ", sdd=" + ssd +
                ", screenDiagonal=" + screenDiagonal +
                ", screenType='" + screenType + '\'' +
                ", screenResolution='" + screenResolution + '\'' +
                ", screenCover='" + screenCover + '\'' +
                ", weight=" + weight +
                ", cpuByCpuId=" + cpuByCpuId +
                ", gpuByGpuId=" + gpuByGpuId +
                '}';
    }
}
