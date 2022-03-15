package mycode.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelPassangerTest {
    @Test
    public void propietati(){
        ModelPassanger modelPassanger=new ModelPassanger(1,"ana@yahoo.com","asa","Ana Mihut");
        assertEquals("1,ana@yahoo.com,asa,Ana Mihut",modelPassanger.save());
        }
}