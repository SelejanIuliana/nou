package mycode.Controller;

import mycode.Model.ModelReservationOrder;
import mycode.Model.ModelReservetion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlReservationOrderTest {
    private ControlReservationOrder controlReservetionOrder;


    public ControlReservationOrderTest(){

        controlReservetionOrder = new ControlReservationOrder("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\reservationorder.txt");

    }


    @BeforeEach
    public void preconditie() {
        controlReservetionOrder = new ControlReservationOrder("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\reservationorder.txt");
    }


        //postconditie


    @AfterEach
    public void postcondite() {
        controlReservetionOrder.clear();
        controlReservetionOrder.save();
    }

    @Test
    public void testAdd() {
        ModelReservationOrder reservationOrder=new ModelReservationOrder(1,"Anglia",2,3);
        ModelReservationOrder reservationOrder1 = new ModelReservationOrder(1,"Austria",3,4);
        ModelReservationOrder reservationOrder2= new ModelReservationOrder(3,"Turcia",42,43);
        controlReservetionOrder.addRezervare(reservationOrder);
        controlReservetionOrder.addRezervare(reservationOrder1);
        controlReservetionOrder.addRezervare(reservationOrder2);
        assertEquals(3,controlReservetionOrder.size());


    }

    @Test
    public void updateprice() {
        ModelReservationOrder reservationOrder = new ModelReservationOrder(1,"Austria",2,3);
        ModelReservationOrder reservationOrder1 = new ModelReservationOrder(2,"Anglia",44,43);
        ModelReservationOrder reservationOrder2= new ModelReservationOrder(3,"Turcia",42,43);
        controlReservetionOrder.addRezervare(reservationOrder);
        controlReservetionOrder.addRezervare(reservationOrder1);
        controlReservetionOrder.addRezervare(reservationOrder2);
        controlReservetionOrder.updatePrice(1,3);
        assertEquals(3, controlReservetionOrder.getbyid(1).getPrice());

    }
    @Test
    public void updatePacket() {
        ModelReservationOrder reservationOrder = new ModelReservationOrder(1,"Austria",2,3);
        ModelReservationOrder reservationOrder1 = new ModelReservationOrder(2,"Anglia",44,43);
        ModelReservationOrder reservationOrder2= new ModelReservationOrder(3,"Turcia",42,43);
        controlReservetionOrder.addRezervare(reservationOrder);
        controlReservetionOrder.addRezervare(reservationOrder1);
        controlReservetionOrder.addRezervare(reservationOrder2);
        controlReservetionOrder.updatePacket(1,3);
        assertEquals(3, controlReservetionOrder.getbyid(1).getPacket());

    }



    @Test
    public void updateName() {
        ModelReservationOrder reservationOrder = new ModelReservationOrder(1,"Austria",2,3);
        ModelReservationOrder reservationOrder1 = new ModelReservationOrder(2,"Anglia",44,43);
        ModelReservationOrder reservationOrder2= new ModelReservationOrder(3,"Turcia",42,43);
        controlReservetionOrder.addRezervare(reservationOrder);
        controlReservetionOrder.addRezervare(reservationOrder1);
        controlReservetionOrder.addRezervare(reservationOrder2);
        for(int i=1;i<4;i++){
            if (controlReservetionOrder.getbyid(i).getId()>=5 && controlReservetionOrder.getbyid(i).getId()<=200 ){
                controlReservetionOrder.updateName(i, "Suedia");
            }
        }
        for(int i=1;i<4;i++){
            if (controlReservetionOrder.getbyid(i).getId()>=5 && controlReservetionOrder.getbyid(i).getId()<=200 ){
                assertEquals("Suedia",controlReservetionOrder.getbyid(i).getNameDestination());
            }
        }
    }

    @Test
    public void testDelete(){
        ModelReservationOrder reservationOrder2= new ModelReservationOrder(3,"Turcia",42,43);
        controlReservetionOrder.addRezervare(reservationOrder2);
        controlReservetionOrder.delete(1);
        assertEquals(null,controlReservetionOrder.getbyid(1));

    }



    @Test
    public void testtoSavedoi(){
        ModelReservationOrder reservationOrder2= new ModelReservationOrder(3,"Turcia",42,43);
        controlReservetionOrder.addRezervare(reservationOrder2);
        controlReservetionOrder.save();
        controlReservetionOrder.load();
        assertEquals(3,controlReservetionOrder.getbyid(3).getId());
    }

}