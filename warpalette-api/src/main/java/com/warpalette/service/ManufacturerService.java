package com.warpalette.service;

import com.warpalette.dto.ManufacturerDTO;
import com.warpalette.entity.Manufacturer;
import com.warpalette.repository.ManufacturerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ManufacturerService {
    private final ManufacturerRepository manufacturerRepository;

    public List<ManufacturerDTO> getAllManufacturers() {
        return manufacturerRepository.findAllByOrderByName().stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private ManufacturerDTO mapToDTO(Manufacturer manufacturer) {
        return new ManufacturerDTO(manufacturer.getId(), manufacturer.getName());
    }
}
