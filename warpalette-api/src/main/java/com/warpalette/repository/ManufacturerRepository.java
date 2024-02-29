package com.warpalette.repository;

import com.warpalette.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long>
{
    List<Manufacturer> findAllByOrderByName();
}