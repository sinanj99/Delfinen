/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.logic;

import delfinen.data.Coach;
import delfinen.data.Discipline;
import delfinen.data.Member;
import delfinen.data.Team;
import java.time.LocalDate;

/**
 *
 * @author sinanjasar
 */
public class Controller 
{
    public void createMember(String firstName, String lastName, boolean active, LocalDate birthDate, Discipline discipline, Team team)
    {
        Member member = new Member(firstName, lastName, active, birthDate, discipline, team);
    }
    public void editMember(String firstName, String lastName, boolean active, LocalDate birthDate, Discipline discipline, Team team)
    {
        createMember(firstName, lastName, active, birthDate, discipline, team);
    }
    
    public void addMember(Member member)
    {
        Team team = new Team();
        team.getMembers().add(member);
    }
}
