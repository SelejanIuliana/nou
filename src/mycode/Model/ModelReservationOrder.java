package mycode.Model;

public class ModelReservationOrder {
    private int id;
    private String nameDestination;
    private int price;
    private int packet;

    public ModelReservationOrder(int id, String name,int price, int packet){
        this.id=id;
        this.nameDestination=name;
        this.price=price;
        this.packet=packet;
    }
    public ModelReservationOrder(String propietati){
        String[] line=propietati.split(",");
        this.id=Integer.parseInt(line[0]);
        this.nameDestination=line[1];
        this.price=Integer.parseInt(line[2]);
        this.packet=Integer.parseInt(line[3]);
    }
    public String description(){
        String text="";
        text+="Id-ul este " + this.id +"\n";
        text+="Numele este " + this.nameDestination+ "\n";
        text+="Produsul este " + this.price+"\n";
        text+="Stocul este " + this.packet+"\n";
        return text;

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNameDestination(){return this.nameDestination;}
    public void setNameDestination(String name){this.nameDestination=nameDestination;}
    public int getPrice(){return this.price;}
    public void setPrice(int price){this.price=price;}
    public int getPacket(){ return  this.packet;}
    public void setPacket(int stock){this.packet=packet;}

    public String save(){
        String text="";
        text+=this.id+","+this.nameDestination+","+this.price+ ","+this.packet;
        return text;
    }


}
