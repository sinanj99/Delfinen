/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.test;

import delfinen.data.CompetitiveMember;
import delfinen.data.CompetitiveTeam;
import delfinen.data.Discipline;
import delfinen.data.JuniorTeam;
import delfinen.data.Member;
import delfinen.data.MotionistTeam;
import delfinen.data.SeniorTeam;
import delfinen.data.Team;
import delfinen.filehandler.CoachFile;
import delfinen.filehandler.PresidentFile;
import delfinen.logic.Controller;
import java.io.File;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sinanjasar
 */
public class ControllerTest {

    private Controller ctrl = new Controller();

    int userId = 1;
    String firstName = "John";
    String lastName = "Johnsen";
    String activity = "aktiv";
    int age = 19;
    LocalDate birthDate = LocalDate.of(1999, 10, 21);
    Discipline dis = Discipline.CRAWL;
    CompetitiveTeam cteam = new CompetitiveTeam("Konkurrenceholdet");
    MotionistTeam mteam = new MotionistTeam("Motionistholdet");
    CompetitiveMember cmember = new CompetitiveMember(userId, firstName, lastName, activity, age, birthDate, dis, mteam);
    Member mmember = new Member(userId, firstName, lastName, activity, age, birthDate, dis, mteam);
    JuniorTeam jteam = new JuniorTeam("Juniorholdet");
    SeniorTeam steam = new SeniorTeam("Seniorholdet");

    public ControllerTest() {

    }

    @Test
    public void createMember() {
        Member actual = ctrl.createMember(userId, firstName, lastName, activity, age, birthDate, dis, mteam);
        assertNotNull(actual);
        assertEquals("John", actual.getFirstName());
        assertEquals(LocalDate.of(1999, 10, 21), actual.getBirthDate());
        assertEquals(mteam, actual.getTeam());
        assertEquals(19, actual.getAge());
    }

    @Test
    public void createCompetitiveMember() {
        CompetitiveMember actual = ctrl.createCompetitiveMember(userId, firstName, lastName, activity, age, birthDate, dis, cteam);
        assertNotNull(actual);
        assertEquals("John", actual.getFirstName());
        assertEquals(LocalDate.of(1999, 10, 21), actual.getBirthDate());
        assertEquals(cteam, actual.getTeam());
    }

    @Test
    public void getMember() {
        int id = PresidentFile.getLatestId();
        Member actual = ctrl.createMember(id, firstName, lastName, activity, age, birthDate, dis, mteam);
        ctrl.printMember(actual);
        assertNotNull(actual);
        assertEquals(actual.getFirstName(), ctrl.getMember(id + 1).getFirstName());
        assertEquals(actual.getLastName(), ctrl.getMember(id + 1).getLastName());
        assertEquals(actual.getId(), ctrl.getMember(id + 1).getId());
    }

    @Test
    public void getMembers() {
        
        assertNotNull(ctrl.getMember(1));
        assertEquals(1200, ctrl.getContingent(1), 0);
        
        assertNotNull(ctrl.getMember(2));
        assertEquals(500, ctrl.getContingent(2), 0);
        
        assertNotNull(ctrl.getMember(5));
        assertEquals(1600, ctrl.getContingent(5), 0);
        
        assertNotNull(ctrl.getMember(4));
        assertEquals(1000, ctrl.getContingent(4), 0);

    }

    @Test
    public void printTrainingResult() {
        ctrl.printTrainingResult("/Users/sinanjasar/Desktop/delfinentxt/BestCrawlResults.txt", "/Users/sinanjasar/Desktop/delfinentxt/TempCrawlResults.txt", 12, 11.1, LocalDate.of(1999, 1, 1));

        Scanner x = null;
        try {
            x = new Scanner(new File("/Users/sinanjasar/Desktop/delfinentxt/BestCrawlResults.txt"));
        } catch (Exception e) {
        }
        x.useDelimiter("[,\n]");

        String ID = null;
        String result = null;
        String date = null;
        double time = 0;

        while (x.hasNext()) {
            ID = x.next();
            result = x.next();
            date = x.next();
        }
        if (12 == Integer.parseInt(ID)) {
            time = Double.parseDouble(result);
        }

        assertEquals(11.1, time, 0);
    }

    @Test
    public void printMember() {
        ctrl.printMember(mmember);

        Scanner x = null;
        try {
            x = new Scanner(new File("/Users/sinanjasar/Desktop/delfinentxt/Members.txt"));
        } catch (Exception e) {
        }
        x.useDelimiter("[,\n]");

        String ID = null;
        String result = null;
        String date = null;
        double time = 0;
        String fname = null;
        String lname = null;
        String active = null;
        String bday = null;
        String disci = null;
        String team = null;
        String age = null;

        while (x.hasNext()) {
            ID = x.next();
            fname = x.next();
            lname = x.next();
            active = x.next();
            age = x.next();
            bday = x.next();
            disci = x.next();
            team = x.next();
        }
        if(userId == Integer.parseInt(ID))
        {
            fname = x.next();
        }
        
        assertEquals(fname, mmember.getFirstName());
        assertEquals(lname, mmember.getLastName());
        assertEquals(Integer.parseInt(age), mmember.getAge());
    }
    
    @Test
    public void editMembers()
    {
        ctrl.editAllMembers("2", "John", "Johnsen", "passive", age, 1999, 10, 21, Discipline.BRYST, cteam);
        assertEquals("John", ctrl.getMember(2).getFirstName());
    }
            
    }
