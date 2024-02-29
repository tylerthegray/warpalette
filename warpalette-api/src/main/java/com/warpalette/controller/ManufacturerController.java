package com.warpalette.controller;

import com.warpalette.dto.ManufacturerDTO;
import com.warpalette.service.ManufacturerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ManufacturerController {

    private final ManufacturerService manufacturerService;

    @GetMapping("/manufacturers")
    public List<ManufacturerDTO> getAllManufacturers() {
        return manufacturerService.getAllManufacturers();
    }
}
