package mycode.Controller;
import mycode.Model.ModelPassanger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class ControlPassangerTest {

    private ControlPassanger controlPassanger;


    public ControlPassangerTest(){

        controlPassanger = new ControlPassanger("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\pasanger.txt");

        }


        @BeforeEach
        public void preconditie() {
            controlPassanger = new ControlPassanger("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\tests\\resources\\pasanger.txt");
        }


        //postconditie


        @AfterEach
        public void postcondite() {

            controlPassanger.clear();
            controlPassanger.save();
        }

        @Test
        public void testAdd() {
            ModelPassanger pasanger = new ModelPassanger(1, "victor@yahoo.com","asa", "Victor Daniel");
            ModelPassanger pasanger2 = new ModelPassanger(2,"ana@yahoo.com","dsds", "Ana Cristea");
            ModelPassanger pasanger3 = new ModelPassanger(3, "iuliana@gmail.com"," dsd","Iuliana Mindrut");
            controlPassanger.addPassanger(pasanger);
            controlPassanger.addPassanger(pasanger2);
            controlPassanger.addPassanger(pasanger3);
            assertEquals(3,controlPassanger.size());


        }

        @Test
        public void updateidEmail() {
            ModelPassanger pasanger = new ModelPassanger(1, "victor@yahoo.com","asa", "Victor Daniel");
            ModelPassanger pasanger2 = new ModelPassanger(2,"ana@yahoo.com","dsds", "Ana Cristea");
            ModelPassanger pasanger3 = new ModelPassanger(3, "iuliana@gmail.com"," dsd","Iuliana Mindrut");
            controlPassanger.addPassanger(pasanger);
            controlPassanger.addPassanger(pasanger2);
            controlPassanger.addPassanger(pasanger3);
            controlPassanger.updateEmail(1,"ligia.com");
            assertEquals("ligia.com", controlPassanger.getbyid(1).getEmail());

        }



        @Test
        public void updateFullName() {
            ModelPassanger pasanger = new ModelPassanger(1, "victor@yahoo.com","asa", "Victor Daniel");
            ModelPassanger pasanger2 = new ModelPassanger(2,"ana@yahoo.com","dsds", "Ana Cristea");
            ModelPassanger pasanger3 = new ModelPassanger(3, "iuliana@gmail.com"," dsd","Iuliana Mindrut");
            controlPassanger.addPassanger(pasanger);
            controlPassanger.addPassanger(pasanger2);
            controlPassanger.addPassanger(pasanger3);
            for(int i=1;i<4;i++){
                if (controlPassanger.getbyid(i).getId()>=5 && controlPassanger.getbyid(i).getId()<=200 ){
                    controlPassanger.updateFullName(i, "Ana Cristina");
                }
            }
            for(int i=1;i<4;i++){
                if (controlPassanger.getbyid(i).getId()>=5 && controlPassanger.getbyid(i).getId()<=200 ){
                    assertEquals("Ana Cristina",controlPassanger.getbyid(i).getFull_name());
                }
            }
        }

        @Test
        public void testDelete(){
            ModelPassanger pasanger3 = new ModelPassanger(3, "iulialigia@gmail.com"," sad","Raul Mindrut");
            controlPassanger.addPassanger(pasanger3);
            controlPassanger.delete(1);
            assertEquals(null,controlPassanger.getbyid(1));

        }



        @Test
        public void testtoSavedoi(){
            ModelPassanger pasanger3 = new ModelPassanger(3, "maria@gmail.com"," sds","Maria Ana");
            controlPassanger.addPassanger(pasanger3);
            controlPassanger.save();
            controlPassanger.load();
            assertEquals("maria@gmail.com",controlPassanger.getbyid(3).getEmail());
        }


    }





