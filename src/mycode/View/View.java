package mycode.View;

import mycode.Controller.ControlReservetion;
import mycode.Controller.ControlTicket;
import mycode.Model.ModelPassanger;
import mycode.Model.ModelReservetion;
import mycode.Model.ModelTicket;

import java.util.Scanner;

public class View {
    public ControlReservetion controlReservetion;
    public ControlTicket controlTicket;
    public Scanner scanner = new Scanner(System.in);
    ModelPassanger modelPassanger;
    ModelReservetion modelReservetion;
    ModelTicket modelTicket;

    public View() {
        this.controlReservetion = new ControlReservetion("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\src\\mycode\\Resources\\reservetion.txt");
        this.controlTicket = new ControlTicket("C:\\Users\\Iulia\\Desktop\\WebDev\\TemeOOP\\Airlinee\\src\\mycode\\Resources\\ticket.txt");
        this.modelPassanger = new ModelPassanger(1, "alina@gamil.com", "anan", "Ana Mindrut");

       // this.controlReservetion = new ModelTicket(this.controlTicket.nextValidId(), this.modelPassanger.getId(), 0);


    }


    public void meniu() {
        System.out.println("Apasati tasta 1 pentru a adauga o destinatie ");
        System.out.println("Apasati tasta 2 pentru a adauga in cos");
        System.out.println("Apasati tasta 3 pentru a vedea ce este in cos");

    }

    public void play() {
        boolean play = true;
        while (play) {
            meniu();
            int buton = Integer.parseInt(scanner.nextLine());
            switch (buton) {
                case 1:

                    controlTicket.afisareTicket();
                    break;
                case 2:
                    addCos();
                    break;
                case 3:

            }
        }
    }


    public void addCos() {
        System.out.println("Ce produs doriti sa adaugati");
        String nume=scanner.nextLine();
        if(controlReservetion.isNume(nume)==true ){
            System.out.println("Destinatia dorita nu se mai afla in sistem");



        }

    }
}
