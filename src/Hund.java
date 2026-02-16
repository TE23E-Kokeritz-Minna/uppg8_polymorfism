public class Hund extends Djur implements Dresserad{

    public Hund(){
        super(5, 20000);
    }

    @Override
    public void sitt() {
        IO.println("sitt");
    }
    @Override
    public void apport() {
        IO.println("apport");
    }

    @Override
    public void kom() {
        IO.println("Kom");
    }

    @Override
    public String läte() {
        return "Voff";
    }

    public void spåra(String bytet){
        IO.println("spårar " + bytet);
    }

}
