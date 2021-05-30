package com.project.santanderbootcamp.repository;

import com.project.santanderbootcamp.model.Stock;
import com.project.santanderbootcamp.model.dto.StockDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

// com a classe extendida possui as operaćões necessarias prontas para interaćão
@Repository
public interface StockRepository extends JpaRepository<Stock, Long> { // necessario passar o model e o tipo de id
    Optional<Stock> findByNameAndDate(String name, LocalDate date);

    @Query("SELECT stock " +
            "FROM Stock stock " +
            "WHERE stock.name = :name AND stock.date = :date AND stock.id <> :id ")
    Optional<Stock> findByStockUpdate(String name, LocalDate date, Long id);

    @Query("SELECT stock " +
            "FROM Stock stock " +
            "WHERE stock.date = :date ")
    Optional<List<Stock>> findByToday(LocalDate date);
}
