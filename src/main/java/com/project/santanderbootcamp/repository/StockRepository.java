package com.project.santanderbootcamp.repository;

import com.project.santanderbootcamp.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// com a classe extendida possui as operaćões necessarias prontas para interaćão
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> { // necessario passar o model e o tipo de id
}
