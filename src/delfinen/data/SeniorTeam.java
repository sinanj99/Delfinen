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
public class SeniorTeam extends CompetitiveTeam {
    
    private ArrayList<CompetitiveMember> members = new ArrayList<CompetitiveMember>();

    public SeniorTeam(String teamName) {
        super(teamName);
    }

    public ArrayList<CompetitiveMember> getSeniorMembers() {
        return members;
    }
    
}
