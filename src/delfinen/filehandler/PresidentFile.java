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
import java.util.Scanner;

/**
 *
 * @author sinanjasar
 */
public class PresidentFile {

    private static Scanner x;

    public static int getLatestId() {

        //String fileName = "C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\PersonId.txt";
        String fileName = "/Users/sinanjasar/Desktop/delfinentxt/personID.txt";
        String line = null;
        String lastLine = null;

        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                lastLine = line;
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Kunne ikke åbne filen '"
                    + fileName + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            File orderFile = new File(fileName);
            FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(buffer);

            if (orderFile.exists() == false) {
                orderFile.createNewFile();
                System.out.println("The file has been created");
            }

            int latestId = Integer.parseInt(lastLine) + 1;
            printWriter.print("\n");
            printWriter.print(latestId);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(lastLine);
    }

    public static void printMember(Member member) {
        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\Person.txt");
        File orderFile = new File("/Users/sinanjasar/Desktop/delfinentxt/MotionistMembers.txt");

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

            printWriter.print(member);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Kunne ikke åbne filen '"
                    + orderFile + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

//    public static void printCompetitiveMember(CompetitiveMember member) {
//        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\Person.txt");
//        File orderFile = new File("/Users/sinanjasar/Desktop/delfinentxt/Members.txt");
//
//        try {
//            FileWriter fileWriter = new FileWriter(orderFile, true);
//            BufferedWriter buffer = new BufferedWriter(fileWriter);
//            PrintWriter printWriter = new PrintWriter(buffer);
//
//            if (orderFile.exists() == false) {
//                orderFile.createNewFile();
//                System.out.println("The file has been created");
//            } else {
//                System.out.println("");
//            }
//
//            printWriter.print(member);
//            printWriter.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println(
//                    "Kunne ikke åbne filen '"
//                    + orderFile + "'");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
////
//    public static void printCompetitiveTeamMembers(String editTerm, String newFirstName, String newLastName, String newActivity, String newBirthdate, String newDis, String newTeam) {
//        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\CompetitiveTeam.txt");
//        File orderFile = new File("/Users/sinanjasar/Desktop/delfinentxt/CompetitiveTeam.txt");
//        try {
//            FileWriter fileWriter = new FileWriter(orderFile, true);
//            BufferedWriter buffer = new BufferedWriter(fileWriter);
//            PrintWriter printWriter = new PrintWriter(buffer);
//
//            if (orderFile.exists() == false) {
//                orderFile.createNewFile();
//                System.out.println("The file has been created");
//            } else {
//                System.out.println("");
//            }
//            printWriter.print(member + "\n\n");
//            printWriter.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println(
//                    "Kunne ikke åbne filen '"
//                    + orderFile + "'");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }

//    public static void printMotionistTeamMembers(Member member) {
//        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\MotionistTeam.txt");
//        File orderFile = new File("/Users/sinanjasar/Desktop/delfinentxt/MotionistTeam.txt");
//        try {
//            FileWriter fileWriter = new FileWriter(orderFile, true);
//            BufferedWriter buffer = new BufferedWriter(fileWriter);
//            PrintWriter printWriter = new PrintWriter(buffer);
//
//            if (orderFile.exists() == false) {
//                orderFile.createNewFile();
//                System.out.println("The file has been created");
//            } else {
//                System.out.println("");
//            }
//            printWriter.print(member + "\n\n");
//            printWriter.close();
//        } catch (FileNotFoundException ex) {
//            System.out.println(
//                    "Kunne ikke åbne filen '"
//                    + orderFile + "'");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
    public static void printJuniorTeamMembers(CompetitiveMember member) {
        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\JuniorTeam.txt");
        File orderFile = new File("/Users/sinanjasar/Desktop/delfinentxt/CompetitiveJuniorTeam.txt");
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
            printWriter.print(member);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Kunne ikke åbne filen '"
                    + orderFile + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void printSeniorTeamMembers(CompetitiveMember member) {
        //File orderFile = new File("C:\\Users\\goo-x\\OneDrive\\Skrivebord\\del\\SeniorTeam.txt");
        File orderFile = new File("/Users/sinanjasar/Desktop/delfinentxt/CompetitiveSeniorTeam.txt");
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
            printWriter.print(member);
            printWriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Kunne ikke åbne filen '"
                    + orderFile + "'");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void editMember(String editTerm, String newFirstName, String newLastName, String newActivity, String newBirthdate, String newDis, String newTeam) {
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/MotionistMembers.txt";
        String tempName = "/Users/sinanjasar/Desktop/delfinentxt/TempMember.txt";
        String tempFile = tempName;
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String ID = "";
        String firstName = "";
        String lastName = "";
        String activity = "";
        String birthDate = "";
        String dis = "";
        String team = "";
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
                activity = x.next();
                birthDate = x.next();
                dis = x.next();
                team = x.next();
                if (ID.equals(editTerm)) {
                    pw.println(editTerm + "," + newFirstName + "," + newLastName + "," + newActivity + "," + newBirthdate + "," + newDis + "," + newTeam);
                } else {
                    pw.println(editTerm + "," + firstName + "," + lastName + "," + activity + "," + birthDate + "," + dis + "," + team);
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

//
//    public static void editCompetitiveMember(String editTerm, String newFirstName, String newLastName, String newActivity, String newBirthdate, String newDis, String newTeam) {
//        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/CompetitiveTeam.txt";
//        String tempName = "/Users/sinanjasar/Desktop/delfinentxt/TempCompetitive.txt";
//        String tempFile = tempName;
//        File oldFile = new File(filepath);
//        File newFile = new File(tempFile);
//
//        String ID = "";
//        String firstName = "";
//        String lastName = "";
//        String activity = "";
//        String birthDate = "";
//        String dis = "";
//        String team = "";
//        try {
//            FileWriter fw = new FileWriter(tempFile, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//            x = new Scanner(new File(filepath));
//            x.useDelimiter("[,\n]");
//
//            while (x.hasNext()) {
//                ID = x.next();
//                firstName = x.next();
//                lastName = x.next();
//                activity = x.next();
//                birthDate = x.next();
//                dis = x.next();
//                team = x.next();
//                if (ID.equals(editTerm)) {
//                    pw.println(editTerm + "," + newFirstName + "," + newLastName + "," + newActivity + "," + newBirthdate + "," + newDis + "," + newTeam);
//                } else {
//                    pw.println(editTerm + "," + firstName + "," + lastName + "," + activity + "," + birthDate + "," + dis + "," + team);
//                }
//            }
//            x.close();
//            pw.flush();
//            pw.close();
//            oldFile.delete();
//            File dump = new File(filepath);
//            newFile.renameTo(dump);
//        } catch (Exception e) {
//
//        }
//
//    }
//
//    public static void editMotionistMember(String editTerm, String newFirstName, String newLastName, String newActivity, String newBirthdate, String newDis, String newTeam) {
//        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/MotionistTeam.txt";
//        String tempName = "/Users/sinanjasar/Desktop/delfinentxt/TempMotionist.txt";
//        String tempFile = tempName;
//        File oldFile = new File(filepath);
//        File newFile = new File(tempFile);
//
//        String ID = "";
//        String firstName = "";
//        String lastName = "";
//        String activity = "";
//        String birthDate = "";
//        String dis = "";
//        String team = "";
//        try {
//            FileWriter fw = new FileWriter(tempFile, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//            x = new Scanner(new File(filepath));
//            x.useDelimiter("[,\n]");
//
//            while (x.hasNext()) {
//                ID = x.next();
//                firstName = x.next();
//                lastName = x.next();
//                activity = x.next();
//                birthDate = x.next();
//                dis = x.next();
//                team = x.next();
//                if (ID.equals(editTerm)) {
//                    pw.println(editTerm + "," + newFirstName + "," + newLastName + "," + newActivity + "," + newBirthdate + "," + newDis + "," + newTeam);
//                } else {
//                    pw.println(editTerm + "," + firstName + "," + lastName + "," + activity + "," + birthDate + "," + dis + "," + team);
//                }
//            }
//            x.close();
//            pw.flush();
//            pw.close();
//            oldFile.delete();
//            File dump = new File(filepath);
//            newFile.renameTo(dump);
//        } catch (Exception e) {
//
//        }
//
//    }
//
    public static void editSeniorMember(String editTerm, String newFirstName, String newLastName, String newActivity, String newBirthdate, String newDis, String newTeam) {
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/CompetitiveSeniorTeam.txt";
        String tempName = "/Users/sinanjasar/Desktop/delfinentxt/TempSenior.txt";
        String tempFile = tempName;
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String ID = "";
        String firstName = "";
        String lastName = "";
        String activity = "";
        String birthDate = "";
        String dis = "";
        String team = "";
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
                activity = x.next();
                birthDate = x.next();
                dis = x.next();
                team = x.next();
                if (ID.equals(editTerm)) {
                    pw.println(editTerm + "," + newFirstName + "," + newLastName + "," + newActivity + "," + newBirthdate + "," + newDis + "," + newTeam);
                } else {
                    pw.println(editTerm + "," + firstName + "," + lastName + "," + activity + "," + birthDate + "," + dis + "," + team);
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

    public static void editJuniorMember(String editTerm, String newFirstName, String newLastName, String newActivity, String newBirthdate, String newDis, String newTeam) {
        String filepath = "/Users/sinanjasar/Desktop/delfinentxt/CompetitiveJuniorTeam.txt";
        String tempName = "/Users/sinanjasar/Desktop/delfinentxt/TempJunior.txt";
        String tempFile = tempName;
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String ID = "";
        String firstName = "";
        String lastName = "";
        String activity = "";
        String birthDate = "";
        String dis = "";
        String team = "";
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
                activity = x.next();
                birthDate = x.next();
                dis = x.next();
                team = x.next();
                if (ID.equals(editTerm)) {
                    pw.println(editTerm + "," + newFirstName + "," + newLastName + "," + newActivity + "," + newBirthdate + "," + newDis + "," + newTeam);
                } else {
                    pw.println(editTerm + "," + firstName + "," + lastName + "," + activity + "," + birthDate + "," + dis + "," + team);
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

}
