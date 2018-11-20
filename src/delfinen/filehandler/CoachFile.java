/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.filehandler;

import delfinen.data.Discipline;
import delfinen.data.Member;
import delfinen.data.Result;
import delfinen.data.Team;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sinanjasar
 */
public class CoachFile 
{
    private static Scanner x;
    public static ArrayList<Member> getMembers(String filePath){
        ArrayList<Member> members = new ArrayList<>();
        
        String ID = null;
        String active = null;
        String firstName = null;
        String lastName = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;
        String coach = null;
        
        try{
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext()){
                ID = x.next();
                active = x.next();
                firstName = x.next();
                lastName = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();
                coach = x.next();
                
                members.add(new Member(Integer.parseInt(ID), firstName, lastName.trim()));
            }
          
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return members;
    }
}
