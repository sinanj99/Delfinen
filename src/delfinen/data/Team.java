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
    private ArrayList<Member> members;
    private Coach coach;

//    public Team(ArrayList<Member> members, Coach coach) {
//        this.members = members;
//        this.coach = coach;
//    }
            
    public ArrayList<Member> getMembers() {
        return members;
    }

    public Coach getCoach() {
        return coach;
    }
    
    
}
