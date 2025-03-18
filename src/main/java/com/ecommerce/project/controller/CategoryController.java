package com.ecommerce.project.controller;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("api/public/categories")
    public List<Category> getCategories() {

        return categoryService.getAllCategories();
    }

    @PostMapping("api/public/categories")
    public String CreateCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return "Category created";
    }

    @DeleteMapping("/api/admin/categories/{categoryId}")
    public String deleteCategory(@PathVariable Long categoryId){
        String status = categoryService.deleteCategory(categoryId);
        return status;
    }


}
