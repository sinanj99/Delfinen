/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import java.util.ArrayList;

/**
 *
 * @author sinanjasar
 */
public class TeamType {
    private ArrayList<Member> competitiveMembers;
    private ArrayList<Member> motionistMembers;
    private Coach coach;
    private String teamName;

    public TeamType(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
            
    public ArrayList<Member> getMotionistMembers() {
        return motionistMembers;
    }
    public ArrayList<Member> getCompetitiveMembers() {
        return competitiveMembers;
    }

    public Coach getCoach() {
        return coach;
    }
    
    
}
