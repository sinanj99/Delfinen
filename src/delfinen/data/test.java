/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import delfinen.filehandler.CoachFile;
import static delfinen.filehandler.CoachFile.getMembers;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author sinanjasar
 */
public class test {
    public static void main(String[] args) {
        int day = 21;
        int month = 10;
        int year = 1999;
        
        int age = (int) ChronoUnit.YEARS.between(LocalDate.of(year,month,day), LocalDate.now());
        System.out.println(age);
        
        ArrayList<Member> jMembers = CoachFile.getMembers("/Users/sinanjasar/Desktop/delfinentxt/Members.txt");
        System.out.println(jMembers.size());
    }
}
