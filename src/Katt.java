public class Katt extends Djur{

    public Katt(){
        super(3, 10000);
    }

    @Override
    public String läte() {
        return "Miiuuuaaaooo";
    }

    public void leka(String sak){
        IO.println("Leker med " + sak);
    }
}
