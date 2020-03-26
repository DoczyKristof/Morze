package doc.docman;

public class Idezetek {

    private String eloAdo;
    private String idezet;

    public Idezetek(String sor) {
        this.eloAdo = sor.split(";")[0];
        this.idezet = sor.split(";")[1];
    }

    public String getEloAdo() {
        return eloAdo;
    }

    public void setEloAdo(String eloAdo) {
        this.eloAdo = eloAdo;
    }

    public String getIdezet() {
        return idezet;
    }

    public void setIdezet(String idezet) {
        this.idezet = idezet;
    }

    @Override
    public String toString() {
        return "doc.docman.Idezetek{" +
                "eloAdo='" + eloAdo + '\'' +
                ", idezet='" + idezet + '\'' +
                '}';
    }
}
