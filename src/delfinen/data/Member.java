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
    private LocalDate birthDate;
    private Discipline discipline;
    private Team team;
    private Coach coach;
    private int id;

    public Member(String firstName, String lastName, boolean active, LocalDate birthDate, Discipline discipline, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.birthDate = birthDate;
        this.discipline = discipline;
        this.team = team;
    }
}
