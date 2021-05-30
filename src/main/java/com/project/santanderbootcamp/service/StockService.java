package com.project.santanderbootcamp.service;

// camada intermediaria, negocial

import com.project.santanderbootcamp.exceptions.BusinessException;
import com.project.santanderbootcamp.mapper.StockMapper;
import com.project.santanderbootcamp.model.Stock;
import com.project.santanderbootcamp.model.dto.StockDTO;
import com.project.santanderbootcamp.repository.StockRepository;
import com.project.santanderbootcamp.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository repository;

    @Autowired
    private StockMapper mapper;

    @Transactional
    public StockDTO save(StockDTO dto) {
        // o optional valida a burocracia com if else e return
        Optional<Stock> optionalStock = repository.findByNameAndDate(dto.getName(), dto.getDate());
        if(optionalStock.isPresent()){
            throw new BusinessException(MessageUtils.STOCK_ALREADY_EXISTS);
        }
        Stock stock = mapper.toEntity(dto);
        repository.save(stock);
        return mapper.toDto(stock);
    }
}
