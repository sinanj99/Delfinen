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
    private TeamType team;
    private Coach coach;
    private static int id;

    public Member(String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, TeamType team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.activity = activity;
        this.birthDate = birthDate;
        this.discipline = discipline;
        this.team = team;
        this.id++;
    }

    @Override
    public String toString() {
        return "Member{" + "activity=" + activity + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", discipline=" + discipline + ", team=" + team + ", coach=" + coach + '}';
    }
    
    
}
