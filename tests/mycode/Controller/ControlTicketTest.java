package mycode.Controller;

import mycode.Model.ModelPassanger;
import mycode.Model.ModelTicket;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class ControlTicketTest {
    private ControlTicket controlTicketTest;


    public ControlTicketTest(){

        controlTicketTest = new ControlTicket("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\ticket.txt");

    }


    @BeforeEach
    public void preconditie() {
        controlTicketTest = new ControlTicket("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\ticket.txt");
    }


    //postconditie


    @AfterEach
    public void postcondite() {

        controlTicketTest.clear();
        controlTicketTest.save();
    }

    @Test
    public void testAdd() {
        ModelTicket ticket = new ModelTicket(1,"Pro",23,34);
        ModelTicket ticket2 = new ModelTicket(2,"Gold",33,44 );
        ModelTicket ticket1 = new ModelTicket(3,"Premium", 45,44);
        controlTicketTest.addTicket(ticket);
        controlTicketTest.addTicket(ticket2);
        controlTicketTest.addTicket(ticket1);
        assertEquals(3,controlTicketTest.size());


    }

    @Test
    public void updateidPrice() {
        ModelTicket ticket = new ModelTicket(1,"Pro",23,34);
        ModelTicket ticket2 = new ModelTicket(2,"Gold",33,44 );
        ModelTicket ticket1 = new ModelTicket(3,"Premium", 45,44);
        controlTicketTest.addTicket(ticket);
        controlTicketTest.addTicket(ticket2);
        controlTicketTest.addTicket(ticket1);
        controlTicketTest.updatePrice(1,3425);
        assertEquals(3425, controlTicketTest.getbyid(1).getPrice());

    }



    @Test
    public void updateRezervation() {
        ModelTicket ticket = new ModelTicket(1,"Pro",23,34);
        ModelTicket ticket2 = new ModelTicket(2,"Gold",33,44 );
        ModelTicket ticket1 = new ModelTicket(3,"Premium", 45,44);
        controlTicketTest.addTicket(ticket);
        controlTicketTest.addTicket(ticket2);
        controlTicketTest.addTicket(ticket1);
        for(int i=1;i<4;i++){
            if (controlTicketTest.getbyid(i).getId()>=5 && controlTicketTest.getbyid(i).getId()<=200 ){
                controlTicketTest.updatePachet(i, 22);
            }
        }
        for(int i=1;i<4;i++){
            if (controlTicketTest.getbyid(i).getId()>=5 && controlTicketTest.getbyid(i).getId()<=200 ){
                assertEquals(22,controlTicketTest.getbyid(i).getPacket());
            }
        }
    }

    @Test
    public void testDelete(){
        ModelTicket ticket1 = new ModelTicket(3,"Premium", 45,44);
        controlTicketTest.addTicket(ticket1);
        controlTicketTest.delete(1);
        assertEquals(null,controlTicketTest.getbyid(1));

    }



    @Test
    public void testtoSavedoi(){
        ModelTicket ticket1 = new ModelTicket(3,"Premium", 45,44);
        controlTicketTest.addTicket(ticket1);
        controlTicketTest.save();
        controlTicketTest.load();
        assertEquals(3,controlTicketTest.getbyid(3).getId());
    }


}