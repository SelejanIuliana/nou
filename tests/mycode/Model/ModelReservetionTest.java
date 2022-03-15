package mycode.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelReservetionTest {
    @Test
    public void propietati(){
        ModelReservetion modelReservetion=new ModelReservetion(1,22,33,45);
        assertEquals("1,22,33,45",modelReservetion.save());
    }
}
