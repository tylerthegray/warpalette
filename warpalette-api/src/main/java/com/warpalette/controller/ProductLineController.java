package com.warpalette.controller;

import com.warpalette.dto.ProductLineDTO;
import com.warpalette.service.ProductLineService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductLineController {

    private final ProductLineService productLineService;

    @GetMapping("/manufacturers/{manufacturerId}/productlines")
    public List<ProductLineDTO> getAllProductLines(@PathVariable Long manufacturerId) {
        return productLineService.getAllProductLines(manufacturerId);
    }
}
