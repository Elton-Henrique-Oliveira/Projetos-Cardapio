package com.elton.cardapio.food.controller;

import com.elton.cardapio.food.repository.FoodRepository;
import com.elton.cardapio.food.repository.entity.Food;
import com.elton.cardapio.food.repository.responses.FoodRequestDTO;
import com.elton.cardapio.food.repository.responses.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){

        Food foodData = new Food(data);

        repository.save(foodData);

        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAllFood() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();

        return foodList;
    }
}