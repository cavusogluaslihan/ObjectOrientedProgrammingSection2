package com.example.objectorientedprogrammingsection2.classes;

public class StudyCase_MoviesDatabase {
    private int movieId;
    private String movieName;
    private int year;
   private StudyCase_CategoryDatabase categoryInfo;
   private StudyCase_DirectorsDatabase directorInfo;

    public StudyCase_MoviesDatabase() {
    }

    public StudyCase_MoviesDatabase(int movieId, String movieName, int year, StudyCase_CategoryDatabase categoryInfo, StudyCase_DirectorsDatabase directorInfo) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.year = year;
        this.categoryInfo = categoryInfo;
        this.directorInfo = directorInfo;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public StudyCase_CategoryDatabase getCategoryInfo() {
        return categoryInfo;
    }

    public void setCategoryInfo(StudyCase_CategoryDatabase categoryInfo) {
        this.categoryInfo = categoryInfo;
    }

    public StudyCase_DirectorsDatabase getDirectorInfo() {
        return directorInfo;
    }

    public void setDirectorInfo(StudyCase_DirectorsDatabase directorInfo) {
        this.directorInfo = directorInfo;
    }
}
