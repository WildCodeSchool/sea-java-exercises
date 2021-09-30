package dojos.dojo30092021;

public class ExklusivKunde extends Kunde{
    public ExklusivKunde(String id, String name, String email) {
        super(id, name, email);
    }

    public double berechneRabatt(int wert){
        double rabatt = (wert*0.1);
        System.out.println("I am Kunde "+ getName()+" with Id "+ this.id +" and a will pay only "+(wert-rabatt)+" euros for the new product!");
        return rabatt;
    }
}
