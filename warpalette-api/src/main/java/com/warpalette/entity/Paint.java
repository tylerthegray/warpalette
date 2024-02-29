package com.warpalette.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "paints")
@Data
public class Paint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn(name = "product_line_id")
    private ProductLine productLine;

    private String name;

    private String color;
}