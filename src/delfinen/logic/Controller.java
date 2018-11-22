/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.logic;

import delfinen.data.CompetitiveMember;
import delfinen.data.Discipline;
import delfinen.data.Member;
import delfinen.data.Team;
import delfinen.filehandler.CoachFile;
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

    CoachFile cf = null;

    public Member createMember(int id, String firstName, String lastName, String activity, int age, LocalDate birthDate, Discipline discipline, Team team) {
        Member member = new Member(id, firstName, lastName, activity, age, birthDate, discipline, team);
        return member;
    }

    public void chooseCompetitiveMember(String term) {
        CoachFile.deleteCompetitionMember(term, "/Users/sinanjasar/Desktop/delfinentxt/ChosenJuniorMembers.txt", "/Users/sinanjasar/Desktop/delfinentxt/TempDeleteChosenJuniorMembers.txt");
        CoachFile.deleteCompetitionMember(term, "/Users/sinanjasar/Desktop/delfinentxt/ChosenSeniorMembers.txt", "/Users/sinanjasar/Desktop/delfinentxt/TempDeleteChosenSeniorMembers.txt");

        if (CoachFile.getMember(Integer.parseInt(term)).getAge() < 18) {
            CoachFile.chooseJuniorCompetitionMember(term);
        } else {
            CoachFile.chooseSeniorCompetitionMember(term);
        }

    }

    public void printTrainingResult(String filePath, String tempFile, int id, double time, LocalDate date) {
        CoachFile.deleteResult(String.valueOf(id), filePath, tempFile);
        CoachFile.printResult(id, time, date, filePath);
    }

    public void printCompetitiveResult(int id, double time, LocalDate date, String filePath) {
        CoachFile.printResult(id, time, date, filePath);
    }

    public CompetitiveMember createCompetitiveMember(int id, String firstName, String lastName, String activity, int age, LocalDate birthDate, Discipline discipline, Team team) {
        CompetitiveMember member = new CompetitiveMember(id, firstName, lastName, activity, age, birthDate, discipline, team);
        return member;
    }

    public Member getMember(int id) {
        return CoachFile.getMember(id);
    }

    public ArrayList<Member> getMembers(String filePath) {
        return CoachFile.getMembers(filePath);
    }

    public double calculateContingent(Member member) {

        double contingent = 0;
        if (member.getActivity().equals("passive")) {
            contingent = 500;
        }
        if (member.getAge() < 18 && member.getActivity().equals("active")) {
            contingent = 1000;
        }
        if (member.getAge() >= 18 && member.getAge() <= 60 && member.getActivity().equals("active")) {
            contingent = 1600;
        }
        if (member.getAge() > 60 && member.getActivity().equals("active")) {
            contingent = 1600 * 0.75;
        }

        return contingent;
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

    public void competitiveChosen(String editTerm, int editTermInt, String newFirstName, String newLastName, String newActivity, int age, int year, int month, int day, Discipline newDis, Team newTeam) {

        PresidentFile.DeleteMotionistMember(editTerm);
        PresidentFile.DeleteJuniorMember(editTerm);
        PresidentFile.DeleteSeniorMember(editTerm);

        if (ChronoUnit.YEARS.between(LocalDate.of(year, month, day), LocalDate.now()) < 18) {
            printCompetitiveJuniorMember(createCompetitiveMember(editTermInt - 1, newFirstName, newLastName, newActivity, age, LocalDate.of(year, month, day), newDis, newTeam));

        } else {
            printCompetitiveSeniorMember(createCompetitiveMember(editTermInt - 1, newFirstName, newLastName, newActivity, age, LocalDate.of(year, month, day), newDis, newTeam));

        }
    }

    public void motionistChosen(String editTerm, int editTermInt, String newFirstName, String newLastName, String newActivity, int age, int year, int month, int day, Discipline newDis, Team newTeam) {
        PresidentFile.DeleteMotionistMember(editTerm);
        PresidentFile.printMotionistMember(createMember(editTermInt - 1, newFirstName, newLastName, newActivity, age, LocalDate.of(year, month, day), newDis, newTeam));
        PresidentFile.DeleteJuniorMember(editTerm);
        PresidentFile.DeleteSeniorMember(editTerm);

    }

    public void editAllMembers(String editTerm, String newFirstName, String newLastName, String newActivity, int age, int year, int month, int day, Discipline newDis, Team newTeam) {
        PresidentFile.editMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editMotionistMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editJuniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editSeniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
    }

}
