package PersonelVeProjeTakipSistemi;

import java.io.*;
import java.util.*;

public class Personel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private int personelID;
    private String ad, soyad;
    private long kimlikNo;
    private String cinsiyet;
    private String mediniHal;
    private Date dogumTarihi;    
    private String egitimDurumu;
    private String gsm;
    private String email;
    private boolean[] progDil = {false,false,false,false,false,false,false,false};
    private boolean[] yabanciDil = {false,false,false,false};
    private int tecrubePuani;
    private int maas;
    private ArrayList<Integer> aktifProjeler = new ArrayList<Integer>();
    
    public Personel(){
        
    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getMediniHal() {
        return mediniHal;
    }

    public void setMediniHal(String mediniHal) {
        this.mediniHal = mediniHal;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEgitimDurumu() {
        return egitimDurumu;
    }

    public void setEgitimDurumu(String egitimDurumu) {
        this.egitimDurumu = egitimDurumu;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getProgDil(int index) {
        return progDil[index];
    }
    
    //progDili kontrolu
    public boolean hasProgDili(int index){
        return progDil[index];
    }

    public void setProgDil(int index, boolean check) {
        progDil[index] = check;
    }

    public boolean getYabanciDil(int index) {
        return yabanciDil[index];
    }
    
    //YabanciDil Kontrol
    public boolean hasYabanciDil(int index){
        return yabanciDil[index];
    }

    public void setYabanciDil(int index, boolean check) {
        yabanciDil[index] = check;
    }

    public int getTecrubePuani() {
        return tecrubePuani;
    }

    public void setTecrubePuani(int tecrubePuani) {
        this.tecrubePuani = tecrubePuani;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public ArrayList<Integer> getAktifProjeler() {
        Collections.sort(aktifProjeler);
        return aktifProjeler;
    }

    public void setAktifProjeler(ArrayList<Integer> aktifProjeler) {
        Collections.sort(aktifProjeler);
        this.aktifProjeler = aktifProjeler;
    }
    
    public void aktifProjeEkle(int projeId){
        Collections.sort(aktifProjeler);
        aktifProjeler.add(projeId);
    }
    
    public void aktifProjeSil(int projeId){
        Collections.sort(aktifProjeler);
        aktifProjeler.remove(aktifProjeler.lastIndexOf(projeId));
    }
    
    @Override
    public String toString(){
        String msg = ad + " " + soyad + " " + kimlikNo + " " + cinsiyet + " " + mediniHal + " " + dogumTarihi + " " + gsm + " ";
        msg += email;
        return msg;
    }
    
    public String getProgDiliString(){
        String txt = "";
        if(this.getProgDil(0))
            txt += "Assembly, ";
        if(this.getProgDil(1))
            txt += "Java, ";
        if(this.getProgDil(2))
            txt += "C/C++, ";
        if(this.getProgDil(3))
            txt += "C#, ";
        if(this.getProgDil(4))
            txt += "Javascript, ";
        if(this.getProgDil(5))
            txt += "Php, ";
        if(this.getProgDil(6))
            txt += "Html/Css, ";
        if(this.getProgDil(7))
            txt += "Python, ";
        txt = txt.substring(0, txt.lastIndexOf(","));
        return txt;
    }
    
    public String getYabanciDilString(){
        String txt = "";
        if(this.getYabanciDil(0))
            txt += "İngilizce, ";
        if(this.getYabanciDil(1))
            txt += "Almanca, ";
        if(this.getYabanciDil(2))
            txt += "Fransızca, ";
        if(this.getYabanciDil(3))
            txt += "Rusça, ";
        txt = txt.substring(0, txt.lastIndexOf(",")); 
        return txt;
    }

    
    
    
    
}
