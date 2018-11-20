/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

import java.util.ArrayList;


public class Result {
    private int min;
    private int time;
    ArrayList<Integer> crawlResults = new ArrayList<Integer>();
    ArrayList<Integer> rygcrawlResults = new ArrayList<Integer>();
    ArrayList<Integer> butterflyResults = new ArrayList<Integer>();
    ArrayList<Integer> brystResults = new ArrayList<Integer>();
    

    public Result(int min, int time) {
        this.min = min;
        this.time = time;
    }

    public int getMin() {
        return min;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Resultat: "  + min + ":" + time;
    }
    
    
}
