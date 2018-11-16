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
public class CompetitiveTeam extends Team {
    
    private ArrayList<CompetitiveMember> competitiveMembers = new ArrayList<CompetitiveMember>();
    
    public CompetitiveTeam(String teamName) {
        super(teamName);
    }
    public ArrayList<CompetitiveMember> getCompetitiveMembers() {
        return competitiveMembers;
    }
}
