package com.warpalette.controller;

import com.warpalette.dto.PaintDTO;
import com.warpalette.service.PaintService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PaintController {

    private final PaintService paintService;

    @GetMapping("productlines/{productLineId}/paints")
    public List<PaintDTO> getAllByProductLineId(@PathVariable Long productLineId) {
        return paintService.getAllByProductLineId(productLineId);
    }

}
