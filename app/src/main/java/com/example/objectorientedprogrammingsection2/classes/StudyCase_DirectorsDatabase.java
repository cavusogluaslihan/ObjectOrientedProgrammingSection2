package com.example.objectorientedprogrammingsection2.classes;

public class StudyCase_DirectorsDatabase {
  private String director;
  private int directorId;

    public StudyCase_DirectorsDatabase() {
    }

    public StudyCase_DirectorsDatabase(String director, int directorId) {
        this.director = director;
        this.directorId = directorId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }
}
