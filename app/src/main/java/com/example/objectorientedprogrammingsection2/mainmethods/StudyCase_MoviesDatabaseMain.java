package com.example.objectorientedprogrammingsection2.mainmethods;

import com.example.objectorientedprogrammingsection2.classes.StudyCase_CategoryDatabase;
import com.example.objectorientedprogrammingsection2.classes.StudyCase_DirectorsDatabase;
import com.example.objectorientedprogrammingsection2.classes.StudyCase_MoviesDatabase;

public class StudyCase_MoviesDatabaseMain {
    public static void main(String args[]){

        StudyCase_CategoryDatabase category1 = new StudyCase_CategoryDatabase("Drama",1);
        StudyCase_CategoryDatabase category2 = new StudyCase_CategoryDatabase("Comedy",2);
        StudyCase_CategoryDatabase category3 = new StudyCase_CategoryDatabase("Sci-Fi",3);

        StudyCase_DirectorsDatabase director1 = new StudyCase_DirectorsDatabase("Nuri Bilge Ceylan",1);
        StudyCase_DirectorsDatabase director2 = new StudyCase_DirectorsDatabase("Quetin Tarantino",2);
        StudyCase_DirectorsDatabase director3 = new StudyCase_DirectorsDatabase("Christopher Nolan",3);

        StudyCase_MoviesDatabase movie1 = new StudyCase_MoviesDatabase(1,"Django",2013,category1,director2);
        StudyCase_MoviesDatabase movie2 = new StudyCase_MoviesDatabase(2,"Inception",2006,category3,director3);

        System.out.println("Movie          : "+movie1.getMovieName());
        System.out.println("Year           : " +movie1.getYear());
        System.out.println("Category       : " +movie1.getCategoryInfo().getCategory());
        System.out.println("Director       : " +movie1.getDirectorInfo().getDirector());


        System.out.println("Movie          : "+movie2.getMovieName());
        System.out.println("Year           : " +movie2.getYear());
        System.out.println("Category       : " +movie2.getCategoryInfo().getCategory());
        System.out.println("Director       : " +movie2.getDirectorInfo().getDirector());







    }
}
