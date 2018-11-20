/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.data;

/**
 *
 * @author sinanjasar
 */
public class CompetitionResult extends Result {
    private String event;
    private int placement;
    private int time;
    
    public CompetitionResult(Member member, String discipline, int distance, int time, String event, int placement) {
        super(member, discipline, distance, time);
        this.event = event;
        this.placement = placement;
        this.time = time;
    }

    public String getEvent() {
        return event;
    }

    public int getPlacement() {
        return placement;
    }

    public int getTime() {
        return time;
    }


    
    
}
