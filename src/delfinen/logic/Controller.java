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
    public void createMember(boolean active, LocalDate birthYear, Discipline discipline, Coach coach)
    {
        Member member = new Member(active, birthYear, discipline, coach);
    }
    public void editMember(boolean active, LocalDate birthYear, Discipline discipline, Coach coach)
    {
        createMember(active, birthYear, discipline, coach);
    }
    
    public void addMember(Member member)
    {
        Team team = new Team();
        team.getMembers().add(member);
    }
}
