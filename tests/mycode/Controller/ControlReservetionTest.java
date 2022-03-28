package mycode.Controller;

import mycode.Model.ModelPassanger;
import mycode.Model.ModelReservetion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlReservetionTest {
    private ControlReservetion controlReservetion;


    public ControlReservetionTest(){

        controlReservetion = new ControlReservetion("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\pasanger.txt");

    }


    @BeforeEach
    public void preconditie() {
        controlReservetion = new ControlReservetion("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\pasanger.txt");
    }


    //postconditie


    @AfterEach
    public void postcondite() {

        controlReservetion.clear();
        controlReservetion.save();
    }

    @Test
    public void testAdd() {
        ModelReservetion reservetion = new ModelReservetion(1,2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3,54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        assertEquals(3,controlReservetion.size());


    }

    @Test
    public void updatidTicket() {
        ModelReservetion reservetion = new ModelReservetion(1,2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3,54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        controlReservetion.updateiIdTicket(1,3);
        assertEquals(3, controlReservetion.getbyidreservation(1).getTicket_id());

    }
    @Test
    public void updatereserv() {
        ModelReservetion reservetion = new ModelReservetion(1,2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3,54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        controlReservetion.updateidrezer(1,3);
        assertEquals(3, controlReservetion.getbyidreservation(1).getIdReservetion());

    }




    @Test
    public void testDelete(){
        ModelReservetion reservetion = new ModelReservetion(1,2,3);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.delete(1);
        assertEquals(null,controlReservetion.getbyidreservation(1));

    }



    @Test
    public void testtoSavedoi(){
        ModelReservetion reservetion = new ModelReservetion(1,2,3);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.save();
        controlReservetion.load();
        assertEquals(1,controlReservetion.getbyidreservation(1).getId());
    }



}