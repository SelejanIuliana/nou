package mycode.Controller;

import mycode.Model.ModelPassanger;
import mycode.Model.ModelReservationOrder;
import mycode.Model.ModelReservetion;
import mycode.Model.ModelTicket;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlReservetion {
    public ArrayList<ModelReservetion> reservetions;
    private String path;
    public ControlReservetion(String path) {
        this.reservetions=new ArrayList();
        this.path=path;
        load();
    }
    public void load() {
        File file = new File(path);

        try {
            try(Scanner scanner = new Scanner(file)){
                while (scanner.hasNextLine()) {
                    this.reservetions.add(new ModelReservetion(scanner.nextLine()));
                }

            }


        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void afisareRezervare() {
        for (int i = 0; i < reservetions.size(); i++) {
            System.out.println(reservetions.get(i).description());
        }
    }
    public void addRezervare(ModelReservetion reservetion){
        this.reservetions.add(reservetion);
    }
    public void updateiIdTicket(int id, int ticket){
        for (int i=0;i<reservetions.size();i++){
            if(reservetions.get(i).getId()==id){
                reservetions.get(i).setTicket_id(ticket);
            }
        }
    }
    public void updateidrezer(int id, int idreser){
        for (int i=0;i<reservetions.size();i++){
            if(reservetions.get(i).getId()==id){
                reservetions.get(i).setIdReservetion(idreser);
            }
        }
    }


    public ModelReservetion getbyidreservation(int id){
        for (int i=0; i<reservetions.size();i++){
            if(reservetions.get(i).getId()==id){
                return reservetions.get(i);
            }
        }
        return null;
    }

    public void delete(int id){
        for (int i=0;i<reservetions.size(); i++){
            if(reservetions.get(i).getId()==id){
                reservetions.remove(i);
            }
        }
    }
    public int nextValidId(){

        if(this.reservetions.size()==0){
            return 1;
        }else{
            return this.reservetions.get(this.reservetions.size()-1).getId()+1;
        }
    }




    public String toSave(){
        String text="";
        for (ModelReservetion n:reservetions){
            text+=n.save()+"\n";
        }
        return text;
    }
    public void save(){
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.print(this.toSave());
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clear(){
        this.reservetions.clear();
    }

    public  int size(){

        return this.reservetions.size();
    }
}
