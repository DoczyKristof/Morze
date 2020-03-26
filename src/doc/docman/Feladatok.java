package doc.docman;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Feladatok {

    private List<Morze> morzeList;
    private List<Idezetek> idezetekList;
    private String betu;

    public Feladatok() {
        this.Beolvasas("Forrasok/morzeabc.txt");
    }

    public void Beolvasas(String fajl) {
        this.morzeList = new ArrayList<>();

        try {
            FileReader fr = new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            String sor = br.readLine();
            while (sor != null) {
                this.morzeList.add(new Morze(sor));
                sor = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception fn) {
            fn.getMessage();
        }
    }

    public String harmadikFeladat() {
        return String.format("3.feladat: A morze abc %d db karakter kódját tartalmazza",
                this.morzeList.size());
    }

    public String negyedikFeladat() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("4.feladat: Kérek egy karaktert: ");
            betu = sc.nextLine().toLowerCase();
            if (!betu.matches("[a-zA-Z]+")) {
                System.out.println("Nem található a kódtárban ilyen karakter!");
            }
        } while (!betu.matches("[a-zA-Z]+") || (betu.length() != 1));
        //---------------
        for (Morze mo : morzeList) {
            if (mo.getBetu().toLowerCase().equals(betu)) {
                return String.format("A(z) %s karakter morze kódja: %s",
                        mo.getBetu(), mo.getMorzeJel());
            }
        }
        //---------------
        return "Nem található a kódtárban ilyen karakter!";
    }

    public void otodikFeladat() {
        idezetekList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("Forrasok/morze.txt");
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            String sor = br.readLine();
            while (sor != null) {
                this.idezetekList.add(new Idezetek(sor));
                sor = br.readLine();
            }
            br.close();
            fr.close();
        } catch (Exception fn) {
            fn.getMessage();
        }
        //---------------
    }
    public int Morze2Szöveg(String morze){
        int xd = (int)morze.chars().filter(c -> c == (int)' ').count();
        return xd;
    }

    public void anya(){
       for( int i = 0 ; i < idezetekList.size(); i++ ){
           Integer szam = Morze2Szöveg(idezetekList.get(i).toString());
           System.out.println(szam);
       }
    }
}