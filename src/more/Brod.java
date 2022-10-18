package more;

public class Brod {

    private String ime;
    private int brojPosade;
    private Mornar kapetan;
    private Mornar mornari[] = new Mornar[brojPosade];
    private int trenutniBroj;

    public Brod(String ime, int brojPosade, Mornar kapetan) {
        this.ime=ime;
        this.brojPosade = brojPosade;
        this.kapetan=kapetan;
        trenutniBroj=1;
    }

    public int dohvatiBr(){
        return trenutniBroj;
    }

}
