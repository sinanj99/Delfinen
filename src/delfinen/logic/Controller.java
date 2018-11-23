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

    /**
     * Retrieves a Member with the given parameters and creates and returns a new member.
     * @param id int id of the member
     * @param firstName Stringfirstname of the member
     * @param lastName String lastname of the member
     * @param activity String activity of the member (passive/active)
     * @param age The age of the member
     * @param birthDate birthdate of the member
     * @param discipline member's discipline
     * @param team member's team
     * @return The created member with the given parameters
     */
    public Member createMember(int id, String firstName, String lastName, String activity, int age, LocalDate birthDate, Discipline discipline, Team team) {
        Member member = new Member(id, firstName, lastName, activity, age, birthDate, discipline, team);
        return member;
    }
    
    /**
     * Retrieves a term and matches it with a member ID
     * @param term the edit term
     */

    public void chooseCompetitiveMember(String term) {
        CoachFile.deleteCompetitionMember(term, "/Users/sinanjasar/Desktop/delfinentxt/ChosenJuniorMembers.txt", "/Users/sinanjasar/Desktop/delfinentxt/TempDeleteChosenJuniorMembers.txt");
        CoachFile.deleteCompetitionMember(term, "/Users/sinanjasar/Desktop/delfinentxt/ChosenSeniorMembers.txt", "/Users/sinanjasar/Desktop/delfinentxt/TempDeleteChosenSeniorMembers.txt");

        if (CoachFile.getMember(Integer.parseInt(term)).getAge() < 18) {
            CoachFile.chooseJuniorCompetitionMember(term);
        } else {
            CoachFile.chooseSeniorCompetitionMember(term);
        }

    }
    
    /**
     * Prints training result
     * @param filePath the file the method goes trhough
     * @param tempFile the temporary file the filepath gets replaced with
     * @param id the id of the member the method looks for
     * @param time the result - seconds : miliseconds
     * @param date the date of the results
     */

    public void printTrainingResult(String filePath, String tempFile, int id, double time, LocalDate date) {
        CoachFile.deleteResult(String.valueOf(id), filePath, tempFile);
        CoachFile.printResult(id, time, date, filePath);
    }
    
    /**
     * Prints a competition result
     * @param id of the member
     * @param time the result (seconds:miliseconds)
     * @param date date of the result
     * @param filePath the file the result are printed to
     */

    public void printCompetitiveResult(int id, double time, LocalDate date, String filePath) {
        CoachFile.printResult(id, time, date, filePath);
    }
    
    /**
     * Retrieves the parameters of a member and creates and returns a competitive member.
     * @param id the id of the member
     * @param firstName the firstname of the member
     * @param lastName the lastname of the member
     * @param activity the activity of the member
     * @param age the age of the member
     * @param birthDate the birthdate of the member
     * @param discipline the discipline of the member
     * @param team the team of the member
     * @return CompetitiveMember with the given parameters
     */

    public CompetitiveMember createCompetitiveMember(int id, String firstName, String lastName, String activity, int age, LocalDate birthDate, Discipline discipline, Team team) {
        CompetitiveMember member = new CompetitiveMember(id, firstName, lastName, activity, age, birthDate, discipline, team);
        return member;
    }

    /**
     * Retrieves Member id and finds member with the id
     * @param id id of the member
     * @return the member with the given id
     */
    public static Member getMember(int id) {
        return CoachFile.getMember(id);
    }

    /**
     * Retrieves the filepath the method goes through and returns and ArrayList including all members from the file. 
     * @param filePath the file in which the methods searches for a member
     * @return ArrayList including all members from the filepath
     */
    public ArrayList<Member> getMembers(String filePath) {
        return CoachFile.getMembers(filePath);
    }

    /**
     * Retrieves id of the member you are looking for and calculates the members contingent. 
     * @param id id of the member
     * @return the contingent of member with the given id
     */
    public double getContingent(int id){
        Member m = getMember(id);
        int age = m.getAge();
        String status = m.getActivity();
        
        if(status.equals("active")){
            if(age < 18) return 1000;
            if(age >= 18 && age <= 60) return 1600;
            if(age > 60) return 1600 * 0.75;
        }
        if(status.equals("passive")) return 500;
        
        return 0;
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
    
    /**
     * Deletes an already existing Competitive Member with the edit term and replaces with a new Competitive Member with the given parameters.
     * @param editTerm edit term of the member edited member
     * @param editTermInt edit term of the edited member
     * @param newFirstName new firstname of the member
     * @param newLastName new lastname of the member
     * @param newActivity new activity of the member
     * @param age age of the member
     * @param year year - used for birthdate
     * @param month - used for birthdate
     * @param day - used for birthdate
     * @param newDis new discipline of the member
     * @param newTeam new team of the member
     */
    
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
    
    /**
     * Deletes an already existing Motionist Member with the edit term and replaces a new Motionist Member with the given parameters.
     * @param editTerm edit term
     * @param editTermInt edit term
     * @param newFirstName new first name of the member
     * @param newLastName new last name of the member
     * @param newActivity new activity of the member
     * @param age age of the member
     * @param year - used for birthdate
     * @param month - used for birthdate
     * @param day - used for birthdate
     * @param newDis new discipline of member
     * @param newTeam new team of member
     */

    public void motionistChosen(String editTerm, int editTermInt, String newFirstName, String newLastName, String newActivity, int age, int year, int month, int day, Discipline newDis, Team newTeam) {
        PresidentFile.DeleteMotionistMember(editTerm);
        PresidentFile.printMotionistMember(createMember(editTermInt - 1, newFirstName, newLastName, newActivity, age, LocalDate.of(year, month, day), newDis, newTeam));
        PresidentFile.DeleteJuniorMember(editTerm);
        PresidentFile.DeleteSeniorMember(editTerm);

    }
    /**
     * Retrieves term of the member you want to edit and looks through all files and edits members with an id matching the edit term.
     * @param editTerm edit term 
     * @param newFirstName new first name of the member
     * @param newLastName new last name of the member
     * @param newActivity new activity of the member
     * @param age age of the member
     * @param year - used for birthdate
     * @param month- used for birthdate
     * @param day - used for birthdate
     * @param newDis new discipline of member
     * @param newTeam new team of member
     */
    public void editAllMembers(String editTerm, String newFirstName, String newLastName, String newActivity, int age, int year, int month, int day, Discipline newDis, Team newTeam) {
        PresidentFile.editMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editMotionistMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editJuniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
        PresidentFile.editSeniorMember(editTerm, newFirstName, newLastName, newActivity, String.valueOf(age), String.valueOf(LocalDate.of(year, month, day)), String.valueOf(newDis), String.valueOf(newTeam));
    }

}
