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

    private boolean active;
    private String firstName;
    private String lastName;
    private LocalDate birthYear;
    private Discipline discipline;
    private Team team;
    private Coach coach;
    private int id;

    public Member(boolean active, LocalDate birthYear, Discipline discipline, Coach coach) {
        this.active = active;
        this.birthYear = birthYear;
        this.discipline = discipline;
        this.team = team;
        this.coach = coach;
    }
}
