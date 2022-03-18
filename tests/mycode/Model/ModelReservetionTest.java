package mycode.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelReservetionTest {
    @Test
    public void propietati(){
        ModelReservetion modelReservetion=new ModelReservetion(1,"Austria",23,2);
        assertEquals("1,Austria,23,2",modelReservetion.save());
    }
}
