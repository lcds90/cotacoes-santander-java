package com.project.santanderbootcamp.controller;

import com.project.santanderbootcamp.model.dto.StockDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController // Definir para o spring que é uma classe controller
@RequestMapping(value = "/stock") // Cria uma url para acesso aos endpoints
public class StockController { // Stock -> termo conhecido de ácoẽs e cotacões do mercado internacional

    // Resposta da requisićão com classe do sprint com o próprio DTO que envio.
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) // consome e retorna json
    public ResponseEntity<StockDTO> save(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto); // Response code 200
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> update(@Valid @RequestBody StockDTO dto){
        return ResponseEntity.ok(dto);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> findAll(){
        List<StockDTO> list = new ArrayList<>();
        StockDTO dto = new StockDTO();
        dto.setId(1L);
        dto.setName("Acao");
        dto.setPrice(200.33);
        dto.setVariation(20.00);
        dto.setDate(LocalDate.now());
        list.add(dto);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) // passando um parametro para a rota /stock/id
    public ResponseEntity<StockDTO> findById(@PathVariable Long id){
    List<StockDTO> list = new ArrayList<>();
    StockDTO dtoSelect = list.stream().filter(x -> x.getId().compareTo(id) == 0).findFirst().get();
    return ResponseEntity.ok(dtoSelect);
    }
    
}
