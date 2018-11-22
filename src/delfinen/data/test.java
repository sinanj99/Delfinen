/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import delfinen.filehandler.CoachFile;
import delfinen.logic.Controller;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author sinanjasar
 */
public class test {
    public static void main(String[] args) {
        /*int day = 21;
        int month = 10;
        int year = 1999;
        
        int age = (int) ChronoUnit.YEARS.between(LocalDate.of(year,month,day), LocalDate.now());
        System.out.println(age);
        
        ArrayList<Member> jMembers = CoachFile.getMembers("/Users/sinanjasar/Desktop/delfinentxt/Members.txt");
        System.out.println(jMembers.size());*/
//        System.out.println((CoachFile.getTop5Names("/Users/sinanjasar/Desktop/delfinentxt/ChestResults.txt", 11.3)));
        Team team = new Team("holdet");
        //Member member = new Member(1,"","","passive",12,LocalDate.of(1999, 10, 1), Discipline.BRYST, team);
        
        Controller ctrl = new Controller();
        Member member = ctrl.getMember(1);
        System.out.println(ctrl.calculateContingent(member));
//ctrl.editAllMembers("39", "John", "Johnsen", "passive", 2, 1999, 10, 21, Discipline.BRYST, new Team("Holdet"));
//        System.out.println(ctrl.getMember(39));
        
    }
}
