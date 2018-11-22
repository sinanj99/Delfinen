/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Obaydah Mohamad
 */
public class Payment {
    private int id;
    private int memberId;
    private int amount;
    private String date;
    private int status;
    
    public Payment(int id, int memberId, int amount, String date, int status){
        this.id = id;
        this.memberId = memberId;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + id + "," + memberId + "," + amount + "," + date + "," + status + "}\n";
    }
    
    public int getPaymentId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }
    
    
    
}