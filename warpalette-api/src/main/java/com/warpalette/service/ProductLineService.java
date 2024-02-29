package com.warpalette.service;

import com.warpalette.dto.ProductLineDTO;
import com.warpalette.entity.ProductLine;
import com.warpalette.repository.ProductLineRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductLineService {
    private final ProductLineRepository productLineRepository;

    public List<ProductLineDTO> getAllProductLines(Long manufacturerId) {
        return productLineRepository.findAllByManufacturerIdOrderByName(manufacturerId).stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private ProductLineDTO mapToDTO(ProductLine productLine) {
        return new ProductLineDTO(productLine.getId(), productLine.getName());
    }
}
