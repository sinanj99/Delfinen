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
    
    public CompetitiveMember(String firstName, String lastName, boolean active, LocalDate birthDate, Discipline discipline, Team team) {
        super(firstName, lastName, active, birthDate, discipline, team);
    }
    
}
