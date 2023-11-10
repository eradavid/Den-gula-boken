import java.util.ArrayList;

public class Profil {

    private String namn;
    private String efternamn;
    private int ålder;
    private Adress adress;
    private ArrayList<Integer> telefonnummerLista;

    public Profil(String namn, String efternamn, int ålder, Adress adress, ArrayList<Integer> telefonnummerLista){
        this.namn = namn;
        this.efternamn = efternamn;
        this.ålder = ålder;
        this.adress = adress;
        this.telefonnummerLista = telefonnummerLista;
    }

    public String toString() {
        return "Namn: " + namn + ",  Efternamn: " + efternamn + ", Ålder: " + ålder + ", Adress: " + adress + ", Telefonnummer: " + telefonnummerLista;


    }
    public String getNamn()
    {
        return namn;
    }
    public String getEfternamn()
    {
        return efternamn;
    }
    public int getÅlder()
    {
        return ålder;
    }
    public Adress getAdress()
    {
        return adress;
    }
    public ArrayList<Integer> getTelefonnummerLista()
    {
        return telefonnummerLista;
    }


    public void setNamn(String nyttNamn) {
        this.namn = nyttNamn;
    }
    public void setEfternamn(String nyttEfternamn) {
        this.efternamn = nyttEfternamn;
    }
    public void setÅlder(int nyÅlder) {
        this.ålder = nyÅlder;
    }
    public void setAdress(Adress nyAdress) {
        this.adress = nyAdress;
    }
    public void setTelefonnummerLista(ArrayList<Integer> nyTelefonnummerLista) {
        this.telefonnummerLista = nyTelefonnummerLista;
    }
    public void läggTillTelefonnummer(int nyttTelefonnummer){
        telefonnummerLista.add(nyttTelefonnummer);
    }

}
