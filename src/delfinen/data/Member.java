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
 * @author Shpati Jakupi
 */
public class Member {

    private String activity;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Discipline discipline;
    private Team team;
    private int id;
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
    
    public Member(int id, String firstName, String lastName, int age, String activity){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.activity = activity;
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

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setAge(int age) {
        this.age = age;
    }  


    public int getAge() {
        return age;
    }
}
