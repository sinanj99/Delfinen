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
public class Team {
//    private Coach coach;
    private String teamName;
    private ArrayList<Member> members = new ArrayList<Member>();
    private ArrayList<Integer> bestResults = new ArrayList<Integer>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }
    
    @Override
    public String toString() {
        return teamName;
    }

    public ArrayList<Integer> getBestResults() {
        return bestResults;
    }
    
    
}
