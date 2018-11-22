/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.filehandler;

import delfinen.data.CompetitiveMember;
import delfinen.data.Member;
import delfinen.data.Payment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Younes
 */
public class CashierFile {
    
    public static void addPayment(String id){
        String filePath = "/Users/sinanjasar/Desktop/delfinentxt/Payments.txt";
        File oldFile = new File(filePath);
        String tempPaymentsPath = "/Users/sinanjasar/Desktop/delfinentxt/TempPayments.txt";
        File newFile = new File(tempPaymentsPath);
        
        String paymentId = "";
        String memberId = "";
        String amount = "";
        String date = "";
        String status = "";
        
        try {
            FileWriter fw = new FileWriter(tempPaymentsPath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext()){
                paymentId = x.next();
                memberId = x.next();
                amount = x.next();
                date = x.next();
                status = x.next();
                
                if(paymentId.equals(id)){
                    pw.println(paymentId + "," + memberId + "," + amount + "," + date + ",1");
                }else{
                    pw.println(paymentId + "," + memberId + "," + amount + "," + date + "," + status);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            bw.close();
            oldFile.delete();
            File dump = new File(filePath);
            newFile.renameTo(dump);
            System.out.println(oldFile);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Payment> getPaymentsByMember(int id){
        String filePath = "/Users/sinanjasar/Desktop/delfinentxt/Payments.txt";
        ArrayList<Payment> payments = new ArrayList<>();
        
        String paymentId = null;
        String memberId = null;
        String amount = null;
        String date = null;
        String status = null;
        
        try{
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext()){
                paymentId = x.next();
                memberId = x.next();
                amount = x.next();
                date = x.next();
                status = x.next();
                
                if(Integer.parseInt(memberId) == id){
                    int intPaymentId = Integer.parseInt(paymentId);
                    int intMemberId = Integer.parseInt(memberId);
                    int intAmount = Integer.parseInt(amount);
                    int intStatus = Integer.parseInt(status.trim());
                    
                    Payment payment = new Payment(intPaymentId, intMemberId, intAmount, date, intStatus);
                    
                    payments.add(payment);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return payments;
    }
    
    public static int getDeficitByMember(int id){
        String filePath = "/Users/sinanjasar/Desktop/delfinentxt/Payments.txt";
        
        String paymentId = null;
        String memberId = null;
        String amount = null;
        String date = null;
        String status = null;
        int deficit = 0;
        
        try{
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext()){
                paymentId = x.next();
                memberId = x.next();
                amount = x.next();
                date = x.next();
                status = x.next();
                int intStatus = Integer.parseInt(status.trim());
                
                if(Integer.parseInt(memberId) == id && intStatus == 0){
                    deficit += Integer.parseInt(amount);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return deficit;
    }
    
    public static ArrayList<Member> getDeficitMembers(){
        String filePath = "/Users/sinanjasar/Desktop/delfinentxt/Members.txt";
        ArrayList<Member> members = new ArrayList<>();
        
        String ID = null;
        String active = null;
        String firstName = null;
        String lastName = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;
        String age = null;
        int deficitId = 0;
        
        try{
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext()){
                ID = x.next(); 
                firstName = x.next();
                lastName = x.next();
                active = x.next();
                age = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();
                deficitId = Integer.parseInt(ID);

                if(getDeficitByMember(deficitId) > 0){
                    members.add(new Member(Integer.parseInt(ID), firstName, lastName.trim(), Integer.parseInt(age)));
                }
            }
            

          
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return members;
    }
    
    public static ArrayList<Member> getMembers(String filePath){
        ArrayList<Member> members = new ArrayList<>();
        
        String ID = null;
        String active = null;
        String firstName = null;
        String lastName = null;
        String birthDay = null;
        String disciplin = null;
        String team = null;
        String age = null;
        
        try{
            Scanner x = new Scanner(new File(filePath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext()){
                ID = x.next();
                firstName = x.next();
                lastName = x.next();
                active = x.next();
                age = x.next();
                birthDay = x.next();
                disciplin = x.next();
                team = x.next();
                
                members.add(new Member(Integer.parseInt(ID), firstName, lastName.trim(), Integer.parseInt(age)));
            }
          
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return members;
    }
   
}
