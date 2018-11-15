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
    
    public CompetitiveMember(int id, String firstName, String lastName, String activity, LocalDate birthDate, Discipline discipline, Team team) {
        super(id, firstName, lastName, activity, birthDate, discipline, team);
    }
    
}
