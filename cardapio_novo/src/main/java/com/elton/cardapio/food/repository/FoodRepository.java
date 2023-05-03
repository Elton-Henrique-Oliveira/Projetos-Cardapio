package com.elton.cardapio.food.repository;

import com.elton.cardapio.food.repository.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Integer> {
}
