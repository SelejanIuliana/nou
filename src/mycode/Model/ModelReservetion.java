package mycode.Model;

public class ModelReservetion {
    private int idreservetion;
    private String nameDestination;
    private int price;
    private int quantity;
    public ModelReservetion(int idreservetion, String nameDestination, int price, int quantity){
        this.idreservetion=idreservetion;
        this.nameDestination=nameDestination;
        this.price=price;
        this.quantity=quantity;
    }
    public ModelReservetion(String propietati){
        String[] line=propietati.split(",");
        this.idreservetion=Integer.parseInt(line[0]);
        this.nameDestination=line[1];
        this.price=Integer.parseInt(line[2]);
        this.quantity=Integer.parseInt(line[3]);
    }
    public String descrierezervare(){
        String text="";
        text+="Id-ul rezervari este " + this.idreservetion +"\n";
        text+= "Numele destinatie este" + this.nameDestination+ "\n";
        text+="Pretul este  este " + this.price +"\n";
        text+="Cantitatea este" + this.quantity + "\n";
        return text;
    }

    public int getIdreservetion(){
        return this.idreservetion;
    }
    public void setIdreservetion(int idreservetion){
        this.idreservetion=idreservetion;
    }
    public String getNameDestination(){return  this.nameDestination;}
    public void setNameDestination(String nameDestination){
        this.nameDestination=nameDestination;
    }
    public int getPrice(){
        return this.price;}
    public void setPrice(int price){
        this.price=price;}
    public int getQuantity(){return this.quantity;}
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public String save(){
        String text="";
        text+=this.idreservetion+","+this.nameDestination+ "," +this.price+","+this.quantity;
        return text;
    }
}

