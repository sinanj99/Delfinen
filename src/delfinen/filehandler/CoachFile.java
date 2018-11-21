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
public class CoachFile {

    private static Scanner x;

    public static ArrayList<Member> getMembers(String filePath) {
        ArrayList<Member> members = new ArrayList<>();

        String ID = null;
        String active = null;
        String firstName = null;
        String lastName = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;

        try {
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                active = x.next();
                firstName = x.next();
                lastName = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();

                members.add(new Member(Integer.parseInt(ID), firstName.trim(), lastName.trim()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return members;
    }
    
    public static ArrayList<String> getChosenMembers(String filePath) {
        String ID = null;
        ArrayList<String> ids = new ArrayList<String>();
        try {
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                
                ids.add(ID);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ids;
    }
    

    public static Member getMember(int id) {
        ArrayList<Member> members = new ArrayList<>();
        String filePath = "/Users/sinanjasar/Desktop/delfinentxt/Members.txt";
        String ID = null;
        String active = null;
        String firstName = null;
        String lastName = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;
        Member member = null;
        try {
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                active = x.next();
                firstName = x.next();
                lastName = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();
                if (ID.equals(String.valueOf(id))) 
                {
                    member = new Member(id, firstName, lastName);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }
    public static void printResult(int id, String firstName, String lastName, double time, LocalDate date, String filePath) {

        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\Person.txt");
        File orderFile = new File(filePath);

        try {
            FileWriter fileWriter = new FileWriter(orderFile, true);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(buffer);

            if (orderFile.exists() == false) {
                orderFile.createNewFile();
                System.out.println("The file has been created");
            } else {
                System.out.println("");
            }

            printWriter.print(id + "," + time + "," + date);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Kunne ikke åbne filen '"
                    + orderFile + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void chooseCompetitionMember(String term) {
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/Members.txt";
        String chosen = "/Users/sinanjasar/Desktop/delfinentxt/ChosenMembers.txt";
        File oldFile = new File(filepath);
        File newFile = new File(chosen);

        String ID = "";
        String activity = "";
        String firstName = "";
        String lastName = "";
        String birthDate = "";
        String dis = "";
        String team = "";
        try {
            FileWriter fw = new FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                activity = x.next();
                firstName = x.next();
                lastName = x.next();
                birthDate = x.next();
                dis = x.next();
                team = x.next();
                if (ID.equals(term)) {
                    pw.println(ID);
                }
            }
                x.close();
                pw.flush();
                pw.close();
         
        } catch (Exception e) {

        }

    }

    public static void deleteCompetitionMember(String term) {
        
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/ChosenMembers.txt";
        String tempFile = "/Users/sinanjasar/Desktop/delfinentxt/TempDeleteChosenMembers.txt";

        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String ID = "";
        String firstName = "";
        String lastName = "";

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                if (!ID.equals(term)) {
                    pw.println(ID + "," + firstName + "," + lastName);
                }
            }
                    
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

        } catch (Exception e) {
        }

    }
    public static void deleteResult(String term, String filePath, String tempFile) {

        File oldFile = new File(filePath);
        File newFile = new File(tempFile);

        String ID = "";
        String firstName = "";
        String lastName = "";
        String time = "";
        String date = "";

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                time = x.next();
                date = x.next();
                if (!ID.equals(term)) {
                    pw.println(ID + "," + time + "," + date);
                }
            }
                    
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filePath);
            newFile.renameTo(dump);

        } catch (Exception e) {
        }

    }
}
