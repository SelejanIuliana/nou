package mycode.Controller;

import mycode.Model.ModelReservationOrder;
import mycode.Model.ModelReservetion;
import mycode.Model.ModelTicket;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlReservationOrder {
    public ArrayList<ModelReservationOrder> reservetionsorder;
    private String path;
    public ControlReservationOrder(String path){
        this.reservetionsorder=new ArrayList();
        this.path=path;
        load();
    }

    public void load() {
        File file = new File(path);

        try {
            try(Scanner scanner = new Scanner(file)){
                while (scanner.hasNextLine()) {
                    this.reservetionsorder.add(new ModelReservationOrder(scanner.nextLine()));
                }

            }


        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void afisareRezervare() {
        for (int i = 0; i < reservetionsorder.size(); i++) {
            System.out.println(reservetionsorder.get(i).description());
        }
    }
    public void addRezervare(ModelReservationOrder reservetion){
        this.reservetionsorder.add(reservetion);
    }
    public void updateName(int id, String name){
        for (int i=0;i<reservetionsorder.size();i++){
            if(reservetionsorder.get(i).getId()==id){
                reservetionsorder.get(i).setNameDestination(name);
            }
        }
    }
    public void updatePrice(int id, int price){
        for (int i=0;i<reservetionsorder.size();i++){
            if(reservetionsorder.get(i).getId()==id){
                reservetionsorder.get(i).setPrice(price);
            }
        }
    }
    public void updatePacket(int id, int pachet){
        for (int i=0;i<reservetionsorder.size();i++){
            if(reservetionsorder.get(i).getId()==id){
                reservetionsorder.get(i).setPacket(pachet);
            }
        }
    }




    public void delete(int id){
        for (int i=0;i<reservetionsorder.size(); i++){
            if(reservetionsorder.get(i).getId()==id){
                reservetionsorder.remove(i);
            }
        }
    }
    public ModelReservationOrder getbyid(int id){
        for (int i=0; i<reservetionsorder.size();i++){
            if(reservetionsorder.get(i).getId()==id){
                return reservetionsorder.get(i);
            }
        }
        return null;
    }
    public int nextValidId(){

        if(this.reservetionsorder.size()==0){
            return 1;
        }else{
            return this.reservetionsorder.get(this.reservetionsorder.size()-1).getId()+1;
        }
    }




    public String toSave(){
        String text="";
        for (ModelReservationOrder n:reservetionsorder){
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
        this.reservetionsorder.clear();
    }

    public  int size(){

        return this.reservetionsorder.size();
    }
}
