package com.warpalette.repository;

import com.warpalette.entity.Paint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaintRepository extends JpaRepository<Paint, Long>
{
    List<Paint> findAllByProductLineIdOrderByName(Long productLineId);
}