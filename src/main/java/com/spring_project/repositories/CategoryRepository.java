package com.spring_project.repositories;

import com.spring_project.entities.Category;
import com.spring_project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
