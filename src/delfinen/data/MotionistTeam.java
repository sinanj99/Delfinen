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
public class MotionistTeam extends Team {
    private ArrayList<Member> motionistMembers = new ArrayList<Member>();
    
    public MotionistTeam(String teamName) {
        super(teamName);
    }
    public ArrayList<Member> getMotionistMembers() {
        return motionistMembers;
    }
    
}
