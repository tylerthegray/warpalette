package com.warpalette.repository;

import com.warpalette.entity.ProductLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductLineRepository extends JpaRepository<ProductLine, Long> {

    List<ProductLine> findAllByManufacturerIdOrderByName(Long manufacturerId);
}