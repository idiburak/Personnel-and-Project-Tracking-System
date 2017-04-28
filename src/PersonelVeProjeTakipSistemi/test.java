/***********************************************************/
//BU CLASS YAZILAN METODLARI KONTROL ETMEK ICIN YAZILMISTIR
/***********************************************************/
package PersonelVeProjeTakipSistemi;

public class test {
    public static void main(String args[]){
        Personel p = new Personel();
        p.aktifProjeEkle(5);
        p.aktifProjeEkle(1);
        
        Proje prj = new Proje();
        prj.setProjeID(2);
        
        p.setPersonelID(2);
        
        prj.aktifPersonelEkle(p);
        prj.aktifPersonelSil(2);
   //     p.getAktifProjeler().set(p.getAktifProjeler().size(), 5);
     //   p.getAktifProjeler().set(p.getAktifProjeler().size(), 5);
       // p.getAktifProjeler().set(p.getAktifProjeler().size(), 5);
       
        for(Integer count:p.getAktifProjeler()){
            System.out.println(p.getAktifProjeler().get(p.getAktifProjeler().lastIndexOf(count)));
        }
        
        
        
    }
    
}
