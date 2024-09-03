package com.example.objectorientedprogrammingsection2.classes;

public class StudyCase_CategoryDatabase {
   private String category;
   private int categoryId;

    public StudyCase_CategoryDatabase() {
    }

    public StudyCase_CategoryDatabase(String category, int categoryId) {
        this.category = category;
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}

