package com.warpalette.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_lines")
@Data
public class ProductLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    private String name;
}