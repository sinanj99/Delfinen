///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package delfinen.data;
//
//import java.util.ArrayList;
//
//
//public class Result {
//    private int distance;
//    private int time;
//    private String discipline;
//    private Member member;
//    ArrayList<Result> crawlResults = new ArrayList<Result>();
//    ArrayList<Result> rygcrawlResults = new ArrayList<Result>();
//    ArrayList<Result> butterflyResults = new ArrayList<Result>();
//    ArrayList<Result> brystResults = new ArrayList<Result>();
//    
//
//    public Result(Member member, String discipline, int distance, int time) {
//        this.discipline = discipline;
//        this.member = member;
//        this.distance = distance;
//        this.time = time;
//    }
//
//    public int getDistance() {
//        return distance;
//    }
//
//    public int getTime() {
//        return time;
//    }
//
//    @Override
//    public String toString() {
//        return member.getId() + " - " + member.getFirstName() + ": " + distance + ":" + time + "\n";
//    }
//
//    public Member getMember() {
//        return member;
//    }
//
//    public ArrayList<Result> getCrawlResults() {
//        return crawlResults;
//    }
//
//    public ArrayList<Result> getRygcrawlResults() {
//        return rygcrawlResults;
//    }
//
//    public ArrayList<Result> getButterflyResults() {
//        return butterflyResults;
//    }
//
//    public ArrayList<Result> getBrystResults() {
//        return brystResults;
//    }
//    
//    
//}
