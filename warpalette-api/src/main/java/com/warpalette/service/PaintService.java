package com.warpalette.service;

import com.warpalette.dto.PaintDTO;
import com.warpalette.entity.Paint;
import com.warpalette.repository.PaintRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PaintService {

    private final PaintRepository paintRepository;

    public List<PaintDTO> getAllByProductLineId(Long productLineId) {
        return paintRepository.findAllByProductLineIdOrderByName(productLineId).stream().map(this::mapToDTO).collect(Collectors.toList());
    }

    private PaintDTO mapToDTO(Paint paint) {
        return new PaintDTO(paint.getId(), paint.getName(), paint.getColor());
    }
}
