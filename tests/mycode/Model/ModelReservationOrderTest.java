package mycode.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelReservationOrderTest {
    @Test
    public void propietati(){
        ModelReservationOrder modelReservetionorder=new ModelReservationOrder(1,"Anglia",2,3);
        assertEquals("1,Anglia,2,3",modelReservetionorder.save());
    }

}