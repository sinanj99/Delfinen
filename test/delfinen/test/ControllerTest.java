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
import delfinen.logic.Controller;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
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
    LocalDate birthDate = LocalDate.of(1999, 10, 21);
    Discipline dis = Discipline.CRAWL;
    CompetitiveTeam cteam = new CompetitiveTeam("Konkurrenceholdet");
    MotionistTeam mteam = new MotionistTeam("Motionistholdet");
    CompetitiveMember cmember = new CompetitiveMember(userId,firstName,lastName,activity,birthDate,dis,mteam);
    Member mmember = new Member(userId,firstName,lastName,activity,birthDate,dis,mteam);
    JuniorTeam jteam = new JuniorTeam("Juniorholdet");
    SeniorTeam steam = new SeniorTeam("Seniorholdet");
    
    public ControllerTest() 
    {
        
    }

    @Test
    public void createMember()
    {
        Member actual = ctrl.createMember(userId,firstName,lastName,activity,birthDate,dis,mteam);
        assertNotNull(actual); 
        assertEquals("John", actual.getFirstName());
        assertEquals(LocalDate.of(1999,10,21),actual.getBirthDate());
        assertEquals(mteam, actual.getTeam());
    }
    @Test
    public void addCompetitiveMember()
    {
        ctrl.addCompetitiveMember(cmember,cteam);
        assertEquals(cmember.getActivity(),cteam.getCompetitiveMembers().get(0).getActivity());
        assertEquals(cmember.getFirstName(),cteam.getCompetitiveMembers().get(0).getFirstName());
    }
    @Test
    public void addMotionistMember()
    {
        mteam.getMotionistMembers().add(mmember);
        assertEquals(mmember.getActivity(),mteam.getMotionistMembers().get(0).getActivity());
        assertEquals(mmember.getFirstName(),mteam.getMotionistMembers().get(0).getFirstName());
    }
    @Test
    public void createCompetitiveMember()
    {
        CompetitiveMember actual = ctrl.createCompetitiveMember(userId,firstName,lastName,activity,birthDate,dis,cteam);
        assertNotNull(actual); 
        assertEquals("John", actual.getFirstName());
        assertEquals(LocalDate.of(1999,10,21),actual.getBirthDate());
        assertEquals(cteam, actual.getTeam());
    }
    
    @Test
    public void addJuniorMember()
    {
        ctrl.addJuniorMember(cmember,jteam);
        assertEquals(cmember.getActivity(),jteam.getMembers().get(0).getActivity());
        assertEquals(cmember.getFirstName(),jteam.getMembers().get(0).getFirstName());
    }
    
    @Test
    public void addSeniorMember()
    {
        ctrl.addMotionistMember(mmember,mteam);
        assertEquals(mmember.getActivity(),mteam.getMotionistMembers().get(0).getActivity());
        assertEquals(mmember.getFirstName(),mteam.getMotionistMembers().get(0).getFirstName());
    }
}
