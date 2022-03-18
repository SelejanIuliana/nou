package mycode.Model;

public class ModelTicket {
    private int id;
    private int ticket_id;
    private  int idReservetion;
    public ModelTicket(int id, int ticket_id, int idReservetion){
        this.id=id;
        this.ticket_id=ticket_id;
        this.idReservetion=id;

    }
    public ModelTicket(String propietati){
        String[] line=propietati.split(",");
        this.id=Integer.parseInt(line[0]);
        this.ticket_id=Integer.parseInt(line[1]);;
        this.idReservetion=Integer.parseInt(line[2]);

    }
    public String description(){
        String text="";
        text+="Id-ul este " + this.id +"\n";
        text+="Id-ul ticketului este " + this.ticket_id+ "\n";
        text+="Nr rezervari este " + this.idReservetion+"\n";
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

    public int getIdReservetion(){
        return this.idReservetion;
    }
    public void setIdReservetion(int idReservetion){
        this.idReservetion=idReservetion;
    }

    public String save(){
        String text="";
        text+=this.id+","+this.ticket_id+","+this.idReservetion;
        return text;
    }
}
