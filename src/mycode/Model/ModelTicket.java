package mycode.Model;

public class ModelTicket {
    private int id;
    private int ticket_id;
    private int price;
    private int quantity;
    public ModelTicket(int id, int ticket_id, int price,int quantity){
        this.id=id;
        this.ticket_id=ticket_id;
        this.price=price;
        this.quantity=quantity;
    }
    public ModelTicket(String propietati){
        String[] line=propietati.split(",");
        this.id=Integer.parseInt(line[0]);
        this.ticket_id=Integer.parseInt(line[1]);;
        this.price=Integer.parseInt(line[2]);
        this.quantity=Integer.parseInt(line[3]);
    }
    public String description(){
        String text="";
        text+="Id-ul este " + this.id +"\n";
        text+="Id-ul ticketului este " + this.ticket_id+ "\n";
        text+="Id-ul pretului este " + this.price+"\n";
        text+="Nr biletelor este " + this.quantity+"\n";
        return text;

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getTicket_id(){
        return this.ticket_id;
    }
    public void setTicket_id(int ticket_id){
        this.ticket_id=ticket_id;
    }

    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getQuantity(){return this.quantity;}
    public void setQuantity(int quantity){this.quantity=quantity;}
    public String save(){
        String text="";
        text+=this.id+","+this.ticket_id+","+ this.price+","+this.quantity;
        return text;
    }
}
