/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author sinanjasar
 */
public class CompetitiveMember extends Member
{
    
    public CompetitiveMember(boolean active, LocalDate birthYear, Discipline discipline, ArrayList<Team> teams, Coach coach) {
        super(active, birthYear, discipline, coach);
    }
    
}
