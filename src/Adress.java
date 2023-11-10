public class Adress{
    private String stad;
    private String postkod;
    private String gata;
    private String portnummer;

    public Adress(String stad, String postkod, String gata, String portnummer){
        this.stad = stad;
        this.postkod = postkod;
        this.gata = gata;
        this.portnummer = portnummer;


    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public String getPostkod() {
        return postkod;
    }

    public void setPostkod(String postkod) {
        this.postkod = postkod;
    }

    public String getGata() {
        return gata;
    }

    public void setGata(String gata) {
        this.gata = gata;
    }

    public String getPortnummer() {
        return portnummer;
    }

    public void setPortnummer(String portnummer) {
        this.portnummer = portnummer;
    }

public String toString() {
        return "Stad: " + stad + ", Postkod: " + postkod + ", Gata: " + gata + ", Portnummer: " + portnummer;
}

}
