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
        ModelReservetion reservetion = new ModelReservetion(1,"Austria",2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,"Germania",44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3, "Anglia",54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        assertEquals(3,controlReservetion.size());


    }

    @Test
    public void updateprice() {
        ModelReservetion reservetion = new ModelReservetion(1,"Austria",2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,"Germania",44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3, "Anglia",54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        controlReservetion.updateiPrice(1,3);
        assertEquals(3, controlReservetion.getbyid(1).getPrice());

    }
    @Test
    public void updatequantity() {
        ModelReservetion reservetion = new ModelReservetion(1,"Austria",2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,"Germania",44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3, "Anglia",54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        controlReservetion.updateQuantity(1,3);
        assertEquals(3, controlReservetion.getbyid(1).getQuantity());

    }



    @Test
    public void updateName() {
        ModelReservetion reservetion = new ModelReservetion(1,"Austria",2,3);
        ModelReservetion reservetion2 = new ModelReservetion(2,"Germania",44, 6);
        ModelReservetion reservetion3= new ModelReservetion(3, "Anglia",54,55);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.addRezervare(reservetion3);
        controlReservetion.addRezervare(reservetion2);
        for(int i=1;i<4;i++){
            if (controlReservetion.getbyid(i).getIdreservetion()>=5 && controlReservetion.getbyid(i).getIdreservetion()<=200 ){
                controlReservetion.updatenameDestination(i, "Suedia");
            }
        }
        for(int i=1;i<4;i++){
            if (controlReservetion.getbyid(i).getIdreservetion()>=5 && controlReservetion.getbyid(i).getIdreservetion()<=200 ){
                assertEquals("Suedia",controlReservetion.getbyid(i).getNameDestination());
            }
        }
    }

    @Test
    public void testDelete(){
        ModelReservetion reservetion = new ModelReservetion(1,"Austria",2,3);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.delete(1);
        assertEquals(null,controlReservetion.getbyid(1));

    }



    @Test
    public void testtoSavedoi(){
        ModelReservetion reservetion = new ModelReservetion(1,"Austria",2,3);
        controlReservetion.addRezervare(reservetion);
        controlReservetion.save();
        controlReservetion.load();
        assertEquals(1,controlReservetion.getbyid(1).getIdreservetion());
    }



}