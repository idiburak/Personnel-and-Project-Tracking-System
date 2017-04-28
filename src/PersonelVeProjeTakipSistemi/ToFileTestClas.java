/***********************************************************/
//BU CLASS YAZILAN METODLARI KONTROL ETMEK ICIN YAZILMISTIR
/***********************************************************/
package PersonelVeProjeTakipSistemi;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ToFileTestClas {
    
    public static void main(String Args[]){
        
/*          ArrayList<Personel> personeller = new ArrayList<Personel>();
            personeller.add(new Personel(personeller.size()));
            personeller.add(new Personel(personeller.size()));
            personeller.add(new Personel(personeller.size()));
            personeller.add(new Personel(personeller.size()));
            personeller.add(new Personel(personeller.size()));
            System.out.println(personeller.get(0).getPersonelID());

            String file = "data.dat";
            try {
                FileOutputStream fout = new FileOutputStream(file);
                ObjectOutputStream dis = new ObjectOutputStream(fout);

                dis.writeObject(personeller);

                fout.close();
                dis.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            Object tmp;
            System.out.println("Yazdir reis");
            try {
                FileInputStream fin = new FileInputStream(file);
                ObjectInputStream oin = new ObjectInputStream(fin);
                System.out.println(oin.readObject());


            } catch (Exception ex) {
                ex.printStackTrace();
            }


        DatabaseConnection dbc = new DatabaseConnection();
       ArrayList<Personel> personeller = new ArrayList<Personel>();
        dbc.personelEkle(new Personel());
        personeller = dbc.getPersoneller();

      //  personeller.add(new Personel());
      //  personeller.add(new Personel(personeller.size()));
        personeller.removeAll(personeller);
       dbc.setPersoneller(personeller);
     //   dbc.personelEkle(new Personel());

       dbc.writePersoneller();
      //  dbc.writeProjeler();

        for(Personel prs:personeller){
            System.out.println(prs.getPersonelID());
        }
    
        ArrayList<Proje> projeler = new ArrayList<Proje>();

        dbc.projeEkle(new Proje());
         projeler = dbc.getProjeler();
        projeler.removeAll(projeler);
        dbc.setProjeler(projeler);
        dbc.writeProjeler();
        for(Proje prj:projeler){
            System.out.println(prj.getProjeID());
        }
     */    
    }
    
}
