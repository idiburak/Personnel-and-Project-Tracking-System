package PersonelVeProjeTakipSistemi;

import java.util.*;
import java.io.*;

public class Proje implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int projeID;
    private String projeAdi, projeSahibi;
    private Date projeBaslangic, projeBitis;
    private int calisanKisiSayisi;
    private int projePuani;
    private boolean[] progDil = {false,false,false,false,false,false,false,false};
    private boolean projeninBitmeDurumu = false;
    private ArrayList<Integer> aktifPersonel = new ArrayList<Integer>();
    
    public Proje(){
        
    }
    
    public int getProjeID() {
        return projeID;
    }

    public void setProjeID(int projeID) {
        this.projeID = projeID;
    }
    
    public String getProjeAdi() {
        return projeAdi;
    }

    public void setProjeAdi(String projeAdi) {
        this.projeAdi = projeAdi;
    }

    public String getProjeSahibi() {
        return projeSahibi;
    }

    public void setProjeSahibi(String projeSahibi) {
        this.projeSahibi = projeSahibi;
    }

    public Date getProjeBaslangic() {
        return projeBaslangic;
    }

    public void setProjeBaslangic(Date projeBaslangic) {
        this.projeBaslangic = projeBaslangic;
    }

    public Date getProjeBitis() {
        return projeBitis;
    }

    public void setProjeBitis(Date projeBitis) {
        this.projeBitis = projeBitis;
    }

    public int getCalisanKisiSayisi() {
        return calisanKisiSayisi;
    }

    public void setCalisanKisiSayisi(int calisanKisiSayisi) {
        this.calisanKisiSayisi = calisanKisiSayisi;
    }

    public int getProjePuani() {
        return projePuani;
    }

    public void setProjePuani(int projePuani) {
        this.projePuani = projePuani;
    }

    public boolean getProgDil(int index) {
        return progDil[index];
    }

    public void setProgDil(int index , boolean check) {
        this.progDil[index] = check;
    }
    
     public boolean getProjeninBitmeDurumu() {
        return projeninBitmeDurumu;
    }

    public void setProjeninBitmeDurumu(boolean projeninBitmeDurumu) {
        this.projeninBitmeDurumu = projeninBitmeDurumu;
    }
    
    public ArrayList<Integer> getAktifPersonel() {
        Collections.sort(aktifPersonel);
        return aktifPersonel;
    }

    public void setAktifPersonel(ArrayList<Integer> aktifPersonel) {
        Collections.sort(aktifPersonel);
        this.aktifPersonel = aktifPersonel;
    }
    
    public void aktifPersonelEkle(Personel prs){
        Collections.sort(aktifPersonel);
        prs.aktifProjeEkle(projeID);
        aktifPersonel.add(prs.getPersonelID());
    }
    
    public void aktifPersonelSil(int personelId){
        Collections.sort(aktifPersonel);
        aktifPersonel.remove(aktifPersonel.lastIndexOf(personelId));
    }
    
    @Override
    public String toString(){
        String msg = projeID + " " + projeAdi + " " + projeSahibi + " ";
        msg += calisanKisiSayisi + " " + projePuani;
        return msg;
    }

     

}
