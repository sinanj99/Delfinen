/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sinanjasar
 */
public class Member {

    private String activity;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Discipline discipline;
    private Team team;
    private int id;
    private double bestCrawlResult;
    private double bestChestResult = 0;
    private double bestButterflyResult = 0;
    private double bestBackCrawlResult = 0;
    private LocalDate bestCrawlResultDate = null;
    private LocalDate bestChestResultDate = null;
    private LocalDate bestButterflyResultDate = null;
    private LocalDate bestBackCrawlResultDate = null;
    private int age;

    public Member(int id, String firstName, String lastName, String activity, int age, LocalDate birthDate, Discipline discipline, Team team) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.activity = activity;
        this.birthDate = birthDate;
        this.discipline = discipline;
        this.team = team;
        this.id++;
        this.age = age;
    }
    
    public Member(int id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    

    @Override
    public String toString() {
        return id + "," + firstName + "," + lastName + "," + activity + "," + age + "," + birthDate + "," + discipline + "," + team + "\n";
    }

    public String getActivity() {
        return activity;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public Team getTeam() {
        return team;
    }

    public int getId() {
        return id;
    }

    public void setBestCrawlResult(double bestCrawlResult) {
        this.bestCrawlResult = bestCrawlResult;
    }

    public void setBestChestResult(double bestChestResult) {
        this.bestChestResult = bestChestResult;
    }

    public void setBestButterflyResult(double bestButterflyResult) {
        this.bestButterflyResult = bestButterflyResult;
    }

    public void setBestBackCrawlResult(double bestBackCrawlResult) {
        this.bestBackCrawlResult = bestBackCrawlResult;
    }

    public void setBestCrawlResultDate(LocalDate bestCrawlResultDate) {
        this.bestCrawlResultDate = bestCrawlResultDate;
    }

    public void setBestChestResultDate(LocalDate bestChestResultDate) {
        this.bestChestResultDate = bestChestResultDate;
    }

    public void setBestButterflyResultDate(LocalDate bestButterflyResultDate) {
        this.bestButterflyResultDate = bestButterflyResultDate;
    }

    public void setBestBackCrawlResultDate(LocalDate bestBackCrawlResultDate) {
        this.bestBackCrawlResultDate = bestBackCrawlResultDate;
    }

    public double getBestCrawlResult() {
        return bestCrawlResult;
    }

    public double getBestChestResult() {
        return bestChestResult;
    }

    public double getBestButterflyResult() {
        return bestButterflyResult;
    }

    public double getBestBackCrawlResult() {
        return bestBackCrawlResult;
    }

    public LocalDate getBestCrawlResultDate() {
        return bestCrawlResultDate;
    }

    public LocalDate getBestChestResultDate() {
        return bestChestResultDate;
    }

    public LocalDate getBestButterflyResultDate() {
        return bestButterflyResultDate;
    }

    public LocalDate getBestBackCrawlResultDate() {
        return bestBackCrawlResultDate;
    }

    public int getAge() {
        return age;
    }
}
