package mycode.Controller;

import mycode.Model.ModelReservetion;
import mycode.Model.ModelTicket;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlTicket {
    public ArrayList<ModelTicket> tickets;
    private String path;
    public ControlTicket(String path) {
        this.tickets=new ArrayList();
        this.path=path;
        load();
    }
    public void load() {
        File file = new File(path);

        try {
            try(Scanner scanner = new Scanner(file)){
                while (scanner.hasNextLine()) {
                    this.tickets.add(new ModelTicket(scanner.nextLine()));
                }

            }


        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void afisareTicket() {
        for (int i = 0; i < tickets.size(); i++) {
            System.out.println(tickets.get(i).description());
        }
    }
    public void addTicket(ModelTicket ticket){
        this.tickets.add(ticket);
    }
    public void updateidTicket(int id, int ticket){
        for (int i=0;i<tickets.size();i++){
            if(tickets.get(i).getId()==id){
                tickets.get(i).setTicket_id(ticket);
            }
        }
    }
    public void updatePrice(int id, int price){
        for (int i=0; i<tickets.size();i++){
            if(tickets.get(i).getId()==id){
               tickets.get(i).setPrice(price);
            }
        }
    }
    public void updateQuantity(int id, int quantity){
        for (int i=0; i<tickets.size();i++){
            if(tickets.get(i).getId()==id){
               tickets.get(i).setQuantity(quantity);
            }
        }
    }
    public void delete(int id){
        for (int i=0;i<tickets.size(); i++){
            if(tickets.get(i).getId()==id){
               tickets.remove(i);
            }
        }
    }
    public int nextValidId(){

        if(this.tickets.size()==0){
            return 1;
        }else{
            return this.tickets.get(this.tickets.size()-1).getTicket_id()+1;
        }
    }



    public String toSave(){
        String text="";
        for (ModelTicket n:tickets){
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
    public ModelTicket getbyid(int id){
        for (int i=0; i<tickets.size();i++){
            if(tickets.get(i).getId()==id){
                return tickets.get(i);
            }
        }
        return null;
    }

    public void clear(){
        this.tickets.clear();
    }

    public  int size(){

        return this.tickets.size();
    }
}
