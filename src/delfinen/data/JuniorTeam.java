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
public class JuniorTeam extends CompetitiveTeam {
    
    private ArrayList<CompetitiveMember> members = new ArrayList<CompetitiveMember>();
    
    public JuniorTeam(String teamName) {
        super(teamName);
    }

    public ArrayList<CompetitiveMember> getJuniorMembers() {
        return members;
    }
    
    
}
