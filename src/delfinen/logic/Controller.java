/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.logic;

import delfinen.data.Coach;
import delfinen.data.CompetitiveMember;
import delfinen.data.Discipline;
import delfinen.data.Member;
import delfinen.data.TeamType;
import java.time.LocalDate;

/**
 *
 * @author sinanjasar
 */
public class Controller 
{
    public Member createMember(String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, TeamType team)
    {
        return new Member(firstName, lastName, activity, birthDate, discipline, team);
    }
    public void editMember(String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, TeamType team)
    {
        createMember(firstName, lastName, activity, birthDate, discipline, team);
    }
    
    public void addMember(Member member, TeamType team)
    {
        team.getMembers().add(member);
    }
    public CompetitiveMember createCompetitiveMember(String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, TeamType team)
    {
        return new CompetitiveMember(firstName, lastName, activity, birthDate, discipline, team);
    }
}
