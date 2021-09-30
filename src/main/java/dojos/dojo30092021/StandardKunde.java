package dojos.dojo30092021;

public class StandardKunde extends Kunde{
    public StandardKunde(String id, String name, String email) {
        super(id, name, email);
    }

    public double berechneRabatt(int wert){
        System.out.println("I am Kunde "+ getName()+" with Id "+ this.id +" and a will pay "+(wert)+" euros for the new product!");
        return wert;
    }
}
