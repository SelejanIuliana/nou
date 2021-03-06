package mycode.Model;

public class ModelTicket {
    private int id;
    private String name;
    private int price;
    private int packet;
    public ModelTicket(int id, String name,int price, int packet){
        this.id=id;
        this.name=name;
        this.price=price;
        this.packet=packet;
    }
    public ModelTicket(String propietati){
        String[] line=propietati.split(",");
        this.id=Integer.parseInt(line[0]);
        this.name=line[1];
        this.price=Integer.parseInt(line[2]);
        this.packet=Integer.parseInt(line[3]);
    }
    public String description(){
        String text="";
        text+="Id-ul este " + this.id +"\n";
        text+="Numele este " + this.name+ "\n";
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
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    public int getPrice(){return this.price;}
    public void setPrice(int price){this.price=price;}
    public int getPacket(){ return  this.packet;}
    public void setPacket(int packet){this.packet=packet;}

    public String save(){
        String text="";
        text+=this.id+","+this.name+","+this.price+ ","+this.packet;
        return text;
    }

}
