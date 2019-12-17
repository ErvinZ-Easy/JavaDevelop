/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yizhe
 */
public class TicketDirectory {
    private List<Ticket> ticketdirectory;
    
    public TicketDirectory(){
        ticketdirectory=new ArrayList<>();

    }

    public List<Ticket> getTicketdirectory() {
        return ticketdirectory;
    }

    public void setTicketdirectory(List<Ticket> ticketdirectory) {
        this.ticketdirectory = ticketdirectory;
    }
    
    public Ticket addTicket(){
        Ticket t=new Ticket();
        ticketdirectory.add(t);
        return t;
    }
    
    public void cancelTicket(Ticket t){
        ticketdirectory.remove(t);
    }
}
