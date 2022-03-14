package mycode.Model;

public class ModelReservetion {
    private int idreservetion;
    private int idbooking;
    private int idname;
    private int idticket;
    public ModelReservetion(int idreservetion,int idbooking, int idname, int idticket){
        this.idreservetion=idreservetion;
        this.idbooking=idbooking;
        this.idname=idname;
        this.idticket=idticket;
    }
    public ModelReservetion(String propietati){
        String[] line=propietati.split(",");
        this.idreservetion=Integer.parseInt(line[0]);
        this.idbooking=Integer.parseInt(line[1]);
        this.idname=Integer.parseInt(line[2]);
        this.idticket=Integer.parseInt(line[3]);
    }
    public String descrierezervare(){
        String text="";
        text+="Id-ul rezervari este " + this.idreservetion +"\n";
        text+="Id-ul boolkingului este " + this.idbooking +"\n";
        text+="Id-ul numelui este " + this.idname +"\n";
        text+="Id-ul ticketului este" + this.idticket + "\n";
        return text;
    }

    public int getIdreservetion(){
        return this.idreservetion;
    }
    public void setIdreservetion(int idreservetion){
        this.idreservetion=idreservetion;
    }
    public int getIdbooking(){return  this.idbooking;}
    public void setIdbooking(int idbooking){
    this.idbooking=idbooking; }
    public int getIdname(){
        return this.idname;}
    public void setIdname(int idname){
        this.idname=idname;}
    public int getIdticket(){return this.idticket;}
    public void setIdticket(int idticket){
        this.idticket=idticket;
    }
    public String save(){
        String text="";
        text+=this.idreservetion+","+this.idbooking+","+this.idname+","+this.idticket;
        return text;
    }
}

