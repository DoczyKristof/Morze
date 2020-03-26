package doc.docman;

public class Morze {
    private String betu;
    private String morzeJel;

    public Morze(String sor) {
        this.betu = sor.split("\\t")[0];
        this.morzeJel = sor.split("\\t")[1];
    }

    public String getBetu() {
        return betu;
    }

    public void setBetu(String betu) {
        this.betu = betu;
    }

    public String getMorzeJel() {
        return morzeJel;
    }

    public void setMorzeJel(String morzeJel) {
        this.morzeJel = morzeJel;
    }

    @Override
    public String toString() {
        return betu + ": " + morzeJel;
    }
}
