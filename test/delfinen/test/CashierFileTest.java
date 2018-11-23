/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.test;

import delfinen.filehandler.CashierFile;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Obaydah Mohamad
 */
public class CashierFileTest {
    
    public CashierFileTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // 
    @Test
    public void TestGetPaymentsByMember() {
        
        int memberId = 5;
        int expected = 4;
        int actual = CashierFile.getPaymentsByMember(memberId).size();
        assertEquals(expected, actual);
        
        memberId = 2;
        expected = 4;
        actual = CashierFile.getPaymentsByMember(memberId).size();
        assertEquals(expected, actual);
        
        memberId = 1;
        expected = 2;
        actual = CashierFile.getPaymentsByMember(memberId).size();
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void TestGetDeficitByMember() {
        
        int memberId = 5;
        int expected = 2400;
        int actual = CashierFile.getDeficitByMember(memberId);
        assertEquals(expected, actual);
        
        memberId = 2;
        expected = 740;
        actual = CashierFile.getDeficitByMember(memberId);
        assertEquals(expected, actual);
        
        memberId = 1;
        expected = 0;
        actual = CashierFile.getDeficitByMember(memberId);
        assertEquals(expected, actual);
        
    }
}
