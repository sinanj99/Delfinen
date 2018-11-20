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
    private Coach coach;
    private int id;
    private Result result;
    private ArrayList<Integer> results = new ArrayList<Integer>();

    public Member(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.activity = activity;
        this.birthDate = birthDate;
        this.discipline = discipline;
        this.team = team;
        this.id++;
        
        
    }
    
    public Member(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    

    @Override
    public String toString() {
        return id + "," + activity + "," + firstName + "," + lastName + "," + birthDate + "," + discipline + "," + team + "\n";
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

    public Coach getCoach() {
        return coach;
    }

    public int getId() {
        return id;
    }

    public Result getResult() {
        return result;
    }

    public ArrayList<Integer> getResults() {
        return results;
    }
    
    
    
}
