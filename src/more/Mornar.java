package more;

public class Mornar {

    String opis;
    int broj;

    public Mornar(String opis, int broj) {
        if (broj < 0 ) {
            this.broj = 0;
        }

        else this.broj = Math.min(broj, 100);
        this.opis = opis;
    }

}
