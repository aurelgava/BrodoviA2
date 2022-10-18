package more;

public class Brod {

    private String ime;
    private int brojPosade;
    private Mornar kapetan;

    public Brod(String ime, int brojPosade, Mornar kapetan) {
        this.ime=ime;
        this.brojPosade = brojPosade;
        this.kapetan=kapetan;
    }

    public String dohvatiKapetana() {
        return kapetan.toString();
    }
}
