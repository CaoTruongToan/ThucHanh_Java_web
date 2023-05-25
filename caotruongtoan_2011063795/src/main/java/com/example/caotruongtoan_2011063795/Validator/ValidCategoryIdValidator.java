package com.example.caotruongtoan_2011063795.Validator;

import com.example.caotruongtoan_2011063795.Validator.annotation.ValidCategoryId;
import com.example.caotruongtoan_2011063795.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category != null && category.getId() != null;
    }
}
