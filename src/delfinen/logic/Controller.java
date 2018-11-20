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
import delfinen.data.Result;
import delfinen.data.SeniorTeam;
import delfinen.data.Team;
import delfinen.filehandler.PresidentFile;
import static delfinen.filehandler.PresidentFile.printCompetitiveJuniorMember;
import static delfinen.filehandler.PresidentFile.printCompetitiveSeniorMember;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author sinanjasar
 */
public class Controller {

    public Member createMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team) {
        Member member = new Member(id, firstName, lastName, activity, birthDate, discipline, team);
        //PresidentFile.printMember(member);
        return member;
    }

    public CompetitiveMember createCompetitiveMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team) {
        CompetitiveMember member = new CompetitiveMember(id, firstName, lastName, activity, birthDate, discipline, team);
        return member;
    }

    public void printSenior(CompetitiveMember member) {
        PresidentFile.printSeniorTeamMembers(member);
    }

    public void printJunior(CompetitiveMember member) {
        PresidentFile.printJuniorTeamMembers(member);
    }

    public void printMember(Member member) {
        PresidentFile.printMember(member);
    }

    public void printMotionistMember(Member member) {
        PresidentFile.printMotionistMember(member);
    }

    public void printCompetitiveMember(CompetitiveMember member) {
        PresidentFile.printCompetitiveMember(member);
    }

    public void competitiveChosen(String editTerm, int editTermInt, String newFirstName, String newLastName, String newActivity, int year, int month, int day, Discipline newDis, Team newTeam) {

        PresidentFile.DeleteMotionistMember(editTerm);
        PresidentFile.DeleteJuniorMember(editTerm);
        PresidentFile.DeleteSeniorMember(editTerm);

        if (ChronoUnit.YEARS.between(LocalDate.of(year, month, day), LocalDate.now()) < 18) {
            printCompetitiveJuniorMember(createCompetitiveMember(editTermInt - 1, newFirstName, newLastName, newActivity, LocalDate.of(year, month, day), newDis, newTeam));

        } else {
            printCompetitiveSeniorMember(createCompetitiveMember(editTermInt - 1, newFirstName, newLastName, newActivity, LocalDate.of(year, month, day), newDis, newTeam));

        }
    }

    public void motionistChosen(String editTerm, int editTermInt, String newFirstName, String newLastName, String newActivity, int year, int month, int day, Discipline newDis, Team newTeam) {
        PresidentFile.DeleteMotionistMember(editTerm);
        PresidentFile.printMotionistMember(createMember(editTermInt - 1, newFirstName, newLastName, newActivity, LocalDate.of(year, month, day), newDis, newTeam));
        PresidentFile.DeleteJuniorMember(editTerm);
        PresidentFile.DeleteSeniorMember(editTerm);

    }

    public void editAllMembers(String editTerm, String newFirstName, String newLastName, String newActivity, int year, int month, int day, Discipline newDis, Team newTeam) {
        PresidentFile.editMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editMotionistMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editJuniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editSeniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
    }

    public int getBestResultMember(Member member) {
        int smallest = member.getResults().get(0);
        for (int i = 1; i < member.getResults().size(); i++) {
            if (member.getResults().get(i) < smallest) {
                smallest = member.getResults().get(i);
            }
        }

        return smallest;
    }
    
    public void addBestTeam(Team team) {
       
        team.getBestResults().add(getBestResultMember);
    }
}

