package mycode.Controller;

import mycode.Model.ModelPassanger;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlPassanger {
    public ArrayList<ModelPassanger> passangers;
    private String path;
    public ControlPassanger(String path) {
        this.passangers=new ArrayList();
        this.path=path;
        load();
    }
    public void load() {
        File file = new File(path);

        try {
            try(Scanner scanner = new Scanner(file)){
                while (scanner.hasNextLine()) {
                    this.passangers.add(new ModelPassanger(scanner.nextLine()));
                }

            }


        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void afisarePassanger() {
        for (int i = 0; i < passangers.size(); i++) {
            System.out.println(passangers.get(i).descrieClient());
        }
    }
    public void addPassanger(ModelPassanger passanger){
        this.passangers.add(passanger);
    }
    public void updateEmail(int id, String email){
        for (int i=0;i<passangers.size();i++){
            if(passangers.get(i).getId()==id){
                passangers.get(i).setEmail(email);
            }
        }
    }
    public void updatePassword(int id, String password){
        for (int i=0; i<passangers.size();i++){
            if(passangers.get(i).getId()==id){
                passangers.get(i).setPassword(password);
            }
        }
    }
    public void updateFullName(int id, String fullname){
        for (int i=0; i<passangers.size();i++){
            if(passangers.get(i).getId()==id){
               passangers.get(i).setFull_name(fullname);
            }
        }
    }
    public void delete(int id){
        for (int i=0;i<passangers.size(); i++){
            if(passangers.get(i).getId()==id){
               passangers.remove(i);
            }
        }
    }
    public int nextValidId(){

        if(this.passangers.size()==0){
            return 1;
        }else{
            return this.passangers.get(this.passangers.size()-1).getId()+1;
        }
    }

    public ArrayList<ModelPassanger>  listaPass(int personId){
        ArrayList<ModelPassanger>passangers=  new ArrayList<>();

        for (int i=0; i<passangers.size();i++){
            if(passangers.get(i).getId()==personId){
               passangers.add(passangers.get(i));
            }
        }
        return passangers;
    }
    public boolean isNume(String nume){
        for (int i=0; i<passangers.size();i++){
            if (passangers.get(i).getFull_name().equals(nume)){
                return true;
            }
        }
        return false;
    }
    public String toSave(){
        String text="";
        for (ModelPassanger n:passangers){
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
    public ModelPassanger getbyid(int id){
        for (int i=0; i<passangers.size();i++){
            if(passangers.get(i).getId()==id){
                return passangers.get(i);
            }
        }
        return null;
    }

    public void clear(){
        this.passangers.clear();
    }

    public  int size(){

        return this.passangers.size();
    }
}



