/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.filehandler;

import delfinen.data.Member;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sinanjasar
 */
public class CoachFile {

    /**
     * 
     * @param filePath The file this method goes through 
     * @return 
     */
    public static ArrayList<Member> getMembers(String filePath) {

        ArrayList<Member> members = new ArrayList<Member>();
        String ID = null;
        String active = null;
        String firstName = null;
        String lastName = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;
        String age = null;

        try {
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                active = x.next();
                age = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();
                members.add(new Member(Integer.parseInt(ID), firstName.trim(), lastName.trim(), Integer.parseInt(age), active));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return members;
    }
    
    /**
     * 
     * @param filePath the file this method goes through
     * @return an arraylist with all members from the specific file
     */

    public static int getChosenMembersSize(String filePath) {

        String ID = null;
        ArrayList<String> ids = new ArrayList<String>();
        try {
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();

                ids.add(ID);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ids.size();
    }
    
    /**
     * 
     * @param filePath the filepath this method goes through
     * @return ArrayList including all chosen members
     */

    public static ArrayList<String> getChosenMembers(String filePath) {
        String ID = null;
        ArrayList<String> ids = new ArrayList<String>();
        try {
            Scanner x = new Scanner(new File(filePath));
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
    /**
  * 
  * @param id a specific member's id
  * @return a specific member
  */
    public static Member getMember(int id) {
        ArrayList<Member> members = new ArrayList<>();
        String filePath = "/Users/sinanjasar/Desktop/delfinentxt/Members.txt";
        String ID = null;
        String firstName = null;
        String lastName = null;
        String active = null;
        String age = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;
        Member member = null;
        
        try {
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                active = x.next();
                age = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();
                // indsæt alder her!!
                if (ID.equals(String.valueOf(id))) {
                    member = new Member(id, firstName, lastName, Integer.parseInt(age), active);
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return member;
    }
    /**
 * 
 * @param id locates a member so you can add a result
 * @param time add second and miniseconds
 * @param date add a date
 * @param filePath the file this method goes through
 */
    public static void printResult(int id, double time, LocalDate date, String filePath) {

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

            printWriter.println(id + "," + time + "," + date);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Kunne ikke åbne filen '"
                    + orderFile + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    /**
 * 
 * @param term if this equals the id of a member you look for in a specific file then it chooses this member.
 */
    public static void chooseSeniorCompetitionMember(String term) {
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/Members.txt";
        String chosen = "/Users/sinanjasar/Desktop/delfinentxt/ChosenSeniorMembers.txt";
        File oldFile = new File(filepath);
        File newFile = new File(chosen);

        String ID = "";
        String activity = "";
        String firstName = "";
        String lastName = "";
        String birthDate = "";
        String dis = "";
        String team = "";
        String age = "";
        try {
            FileWriter fw = new FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                activity = x.next();
                age = x.next();
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

    /**
     * 
     * @param filepath the file this method goes through
     * @return the top 5 from a specific filepath including results from a disciplin:)
     */
    public static ArrayList<String> printTop5(String filepath) {
        File oldFile = new File(filepath);
        ArrayList<Double> timeList = new ArrayList<Double>();
        ArrayList<String> smallList = new ArrayList<String>();
        String ID = "";
        String time = "";
        String date = "";
        try {

            Scanner x = new Scanner(new File(filepath));
            
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                time = x.next();
                date = x.next();
                timeList.add(/*"Medlem " + ID + " - " + getMember(Integer.parseInt(ID)).getFirstName() + " " + getMember(Integer.parseInt(ID)).getLastName() + " - tid: " + */Double.parseDouble(time));
            
            }
            Collections.sort(timeList);
            
            for (int i = 0; i < 5; i++) {
                int memberId = getTop5Names(filepath, timeList.get(i));
                Member m = getMember(memberId);
                smallList.add("Id: " + memberId + " - " + m.getFirstName() + " " + m.getLastName() + " - tid: " + timeList.get(i));
                
            }
            x.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return smallList;
    }
    /**
 * 
 * @param filepath the file this method goes through
 * @param bestTime a Double with the seconds and miliseconds of the members:)
 * @return top 5 from a specific file according to the id of a member:)
 */
    public static int getTop5Names(String filepath, double bestTime) {
        
        File oldFile = new File(filepath);
//        File newFile = new File(chosen);

        String ID = "";
        String time = "";
        String date = "";
        int id = 0;

        try {
            
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                time = x.next();
                date = x.next();
                Double dTime = Double.parseDouble(time);
                
                if (dTime == bestTime) {
                    id = Integer.parseInt(ID);
                }
            }
            x.close();
//            pw.flush();
//            pw.close();

        } catch (Exception e) {

        }
        return id;
    }
     /**
     * 
     * @param term if this equals the id of a member you look for in a specific file then choose this member.
     */
    public static void chooseJuniorCompetitionMember(String term) {
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/Members.txt";
        String chosen = "/Users/sinanjasar/Desktop/delfinentxt/ChosenJuniorMembers.txt";
        File oldFile = new File(filepath);
        File newFile = new File(chosen);

        String ID = "";
        String activity = "";
        String firstName = "";
        String lastName = "";
        String birthDate = "";
        String dis = "";
        String team = "";
        String age = "";
        try {
            FileWriter fw = new FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                activity = x.next();
                age = x.next();
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
    /**
     * 
     * @param term if this equals the id of a member you look for in a specific file then choose this member.
     * @param filepath the file this method goes through
     * @param tempFile the file this method replaces
     */
    public static void deleteCompetitionMember(String term, String filepath, String tempFile) {

        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String ID = "";
        String firstName = "";
        String lastName = "";
        String age = "";

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext()) {
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                age = x.next();
                if (!ID.equals(term)) {
                    pw.println(ID + "," + firstName + "," + lastName + "," + age);
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
    /**
     * 
     * @param term if this equals the id of a member you look for in a specific file then choose this member.
     * @param filePath the file this method goes trough
     * @param tempFile the file this method replaces
     */
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
            Scanner x = new Scanner(new File(filePath));
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
