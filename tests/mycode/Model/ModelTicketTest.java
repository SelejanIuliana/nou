package mycode.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTicketTest {
    @Test
    public void propietati(){
        ModelTicket modelTicket=new ModelTicket(1,22,345,4);
        assertEquals("1,22,345,4",modelTicket.save());
    }
}