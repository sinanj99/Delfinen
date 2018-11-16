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
import delfinen.filehandler.PresidentFile;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sinanjasar
 */
public class Controller 
{
    public Member createMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team)
    {
        Member member = new Member(id, firstName, lastName, activity, birthDate, discipline, team);
        //PresidentFile.printMember(member);
        return member;
    }
    public void addMember(Member member, Team team)
    {
        team.getMembers();
    }
            
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
        CompetitiveMember member = new CompetitiveMember(id, firstName, lastName, activity, birthDate, discipline, team);
        return member;
    }
    public void addJuniorMember(CompetitiveMember member, JuniorTeam team) 
    {
        team.getMembers().add(member);
    }

    public void addSeniorMember(CompetitiveMember member, SeniorTeam team) {
        
        team.getMembers().add(member);
    }
    public void printSenior(CompetitiveMember member)
    {
        PresidentFile.printSeniorTeamMembers(member);
    }
    public void printJunior(CompetitiveMember member)
    {
        PresidentFile.printJuniorTeamMembers(member);
    }

    public void printMember(Member member)
    {
        PresidentFile.printMember(member);
    }

    public void printMotionistTeamMembers(Member createMember) {
        PresidentFile.printMotionistTeamMembers(createMember);
    }

    public void printCompetitiveMember(CompetitiveMember createCompetitiveMember) {
        PresidentFile.printCompetitiveMember(createCompetitiveMember);
    }

    public void printCompetitiveTeamMembers(CompetitiveMember createCompetitiveMember) {
        PresidentFile.printCompetitiveTeamMembers(createCompetitiveMember);
    }

//    public void printJuniorMemberArrayList(ArrayList<CompetitiveMember> members) {
//        PresidentFile.printJuniorMemberArrayList(members);
//    }
//
//    public void PrintCompetitiveMemberArrayList(CompetitiveMember competitiveMember) {
//        PresidentFile.PrintCompetitiveMemberArrayList(competitiveMember);
//    }
//
//    public void printSeniorMemberArrayList(ArrayList<CompetitiveMember> members) {
//        PresidentFile.PrintSeniorMemberArrayList(members);
//    }
//
//    public void printMotionistMemberArrayList(ArrayList<Member> motionistMembers) {
//        PresidentFile.printMotionistMemberArrayList(motionistMembers);
//    }
}
