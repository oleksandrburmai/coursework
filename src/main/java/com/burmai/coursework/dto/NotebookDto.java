package com.burmai.coursework.dto;

import com.burmai.coursework.model.Cpu;
import com.burmai.coursework.model.Gpu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotebookDto {

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
    private Cpu cpuByCpuId;
    private Gpu gpuByGpuId;

}
