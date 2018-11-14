/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.filehandler;

import delfinen.data.CompetitiveMember;
import delfinen.data.Member;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
    public static int getLatestId() {
      
        String fileName = "C:\\Users\\goo-x\\OneDrive\\Skrivebord\\PersonId.txt";
        //String fileName = "SNE HER";
        String line = null;
        String lastLine = null;

        try {
            
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                lastLine = line;
            }   

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Kunne ikke åbne filen '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        
        try{
            File orderFile = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName,true);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(buffer);

            if(orderFile.exists() == false){
               orderFile.createNewFile();
               System.out.println("The file has been created");
            }
            
            int latestId = Integer.parseInt(lastLine) + 1;
            printWriter.print("\n");
            printWriter.print(latestId);
            printWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return Integer.parseInt(lastLine);
    }
    
    public static void printMember(Member member) throws IOException
    {
        File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\Person.txt");
        //File orderFile = new File("SNE HER");
        
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
        printWriter.close();
    }
    public static void printCompetitiveMember(CompetitiveMember member) throws IOException
    {
        File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\Person.txt");
        //File orderFile = new File("SNE HER");
        
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
        printWriter.close();
    }
}

