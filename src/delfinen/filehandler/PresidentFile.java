/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.filehandler;

import delfinen.data.CompetitiveMember;
import delfinen.data.Member;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Character.LINE_SEPARATOR;

/**
 *
 * @author sinanjasar
 */
public class PresidentFile 
{
    public static void printMember(Member member) throws IOException
    {
        File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\Person.txt");
        FileWriter fileWriter = new FileWriter(orderFile,true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(buffer);
 
        if(orderFile.exists() == false)
        {
           orderFile.createNewFile();
           System.out.println("The file has been created");
        }
         else
        {
            System.out.println("");
        }
        //printWriter.print("                                                                                     " + "Fornavn: " + firstName + " Efternavn: " + lastName + " Alder: " + ChronoUnit.YEARS.between(LocalDate.of(year, month, day), LocalDate.now()) + " Disciplin: " + dis);
        printWriter.print(member);
        printWriter.print(LINE_SEPARATOR);
        printWriter.close();
    }
    public static void printCompetitiveMember(CompetitiveMember member) throws IOException
    {
        File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\Person.txt");
        FileWriter fileWriter = new FileWriter(orderFile,true);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(buffer);
 
        if(orderFile.exists() == false)
        {
           orderFile.createNewFile();
           System.out.println("The file has been created");
        }
         else
        {
            System.out.println("");
        }
        //printWriter.print("                                                                                     " + "Fornavn: " + firstName + " Efternavn: " + lastName + " Alder: " + ChronoUnit.YEARS.between(LocalDate.of(year, month, day), LocalDate.now()) + " Disciplin: " + dis);
        printWriter.print(member);
        printWriter.print(LINE_SEPARATOR);
        printWriter.close();
    }
}

