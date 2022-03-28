package mycode.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTicketTest {
    @Test
    public void propietati(){
        ModelTicket modelTicket=new ModelTicket(1,"Anglia",2,3);
        assertEquals("1,Anglia,2,3",modelTicket.save());
    }
}