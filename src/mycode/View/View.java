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

//        this.modelTicket = new ModelTicket(this.controlTicket.nextValidId(), this.modelPassanger.getId(), 0);


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
                    //addCos();
                    break;
                case 3:

            }
        }
    }


 /*   public void addCos() {
        public void addCos() {
            System.out.println("Care  este destinatia  dorita");
            String nume = scanner.nextLine();
            System.out.println("Cate pachete doriti sa adaugati");
            int cantitate = Integer.parseInt(scanner.nextLine());
            if (controlReservetion.isNume(nume) == true && controlReservetion.isStock(cantitate) == true) {
                System.out.println("Nr de pachete nu este disponibil");

                ModelReservetion p = this.controlReservetion.reservetions(nume);


                p.setQuantity(p.getQuantity()-cantitate);


                ModelTicket x = new ModelTicket(
                        controlTicket.nextValidId(),
                        this.modelTicket.getId(),
                        p.getPrice() * cantitate,
                        cantitate
                );

                this.order.setAmmount(order.getAmmount()+x.getPrice());
                System.out.println(x.description());
                this.controlTicket.addTicket(x);

            }
        }



    }

  */
}
