/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.logic;

import delfinen.data.CompetitiveMember;
import delfinen.data.CompetitiveTeam;
import delfinen.data.Discipline;
import delfinen.data.JuniorTeam;
import delfinen.data.Member;
import delfinen.data.MotionistTeam;
import delfinen.data.SeniorTeam;
import delfinen.data.Team;
import java.time.LocalDate;

/**
 *
 * @author sinanjasar
 */
public class Controller 
{
    public Member createMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team)
    {
        return new Member(id, firstName, lastName, activity, birthDate, discipline, team);
    }
    
//    public void editMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team)
//    {
//        createMember(id, firstName, lastName, activity, birthDate, discipline, team);
//    }
    
    public void addCompetitiveMember(CompetitiveMember member, CompetitiveTeam team)
    {
        team.getCompetitiveMembers().add(member);
    }
    public void addMotionistMember(Member member, MotionistTeam team)
    {
        team.getMotionistMembers().add(member);
    }
    
    public CompetitiveMember createCompetitiveMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team)
    {
        return new CompetitiveMember(id, firstName, lastName, activity, birthDate, discipline, team);
    }

    public void addJuniorMember(CompetitiveMember member, JuniorTeam team) 
    {
        team.getMembers().add(member);
    }

    public void addSeniorMember(CompetitiveMember member, SeniorTeam team) {
        team.getMembers().add(member);
    }
}
