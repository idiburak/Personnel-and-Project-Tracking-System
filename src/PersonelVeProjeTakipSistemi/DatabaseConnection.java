package PersonelVeProjeTakipSistemi;

import java.util.*;
import java.io.*;

public class DatabaseConnection {
    private ArrayList<Personel> personeller = new ArrayList<Personel>();
    private ArrayList<Proje> projeler = new ArrayList<Proje>();
    private String personelFile = "psData";
    private String projeFile = "prData";
    
    public DatabaseConnection(){
        readPersoneller();
        readProjeler();
    }
    
    //PRDATA DOSYASINDAN VERILERI OKUYAN METOD
    public void readPersoneller(){
        try {
            FileInputStream fin = new FileInputStream(personelFile);
            ObjectInputStream oin = new ObjectInputStream(fin);
            this.setPersoneller((ArrayList<Personel>) oin.readObject());
            fin.close(); oin.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //PSDATA DOSYASINDAN VERILERI OKUYAN METOD
    public void readProjeler(){
        try {
            FileInputStream fin = new FileInputStream(projeFile);
            ObjectInputStream oin = new ObjectInputStream(fin);
            this.setProjeler((ArrayList<Proje>) oin.readObject());
            fin.close(); oin.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //PRDATA DOSYASINA VERILERI YAZAN METOD
    public void writePersoneller(){
        try {
            
            FileOutputStream fout = new FileOutputStream(personelFile);
            ObjectOutputStream dis = new ObjectOutputStream(fout);
            dis.writeObject(getPersoneller());
            fout.close();
            dis.close();
            readPersoneller();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //PSDATA DOSYASINA VERILERI YAZAN METOD
    public void writeProjeler(){
        try {
            
            FileOutputStream fout = new FileOutputStream(projeFile);
            ObjectOutputStream dis = new ObjectOutputStream(fout);
            dis.writeObject(getProjeler());
            fout.close();
            dis.close();
            readProjeler();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    //PRDATA DOSYASINA VERI EKLEYEN METOD
    public void personelEkle(Personel person){
        readPersoneller();
        person.setPersonelID(personeller.size());
        personeller.add(person);
        writePersoneller();
    }
    
    //PSDATA DOSYASINA VERI EKLEYEN METOD
    public void projeEkle(Proje prj){
        readProjeler();
        prj.setProjeID(projeler.size());
        projeler.add(prj);
        writeProjeler();
    }
    
    //PRDATA DOSYASINDAN VERI SILEN METOD
    public void personelSil(Personel person){
        readPersoneller();
        int deleteId = person.getPersonelID();
        for(int i=deleteId+1 ; i<personeller.size() ; i++){
            personeller.get(i).setPersonelID(personeller.get(i).getPersonelID() - 1);
        }
        personeller.remove(deleteId);
        writePersoneller();
    }
    
    //PSDATA DOSYASINDAN VERI SILEN METOD
    public void projeSil(Proje prj){
        System.out.println("bu : " + this.projeler.size());
        readProjeler();
        System.out.println("oku : " + this.projeler.size());
        int deletedId = prj.getProjeID();
        for(int i=deletedId+1 ; i<projeler.size() ; i++){
            projeler.get(i).setProjeID(projeler.get(i).getProjeID() - 1);
        }
        projeler.remove(deletedId);
        writeProjeler();
    }

    /* GETTERS AND SETTERS */
    public ArrayList<Personel> getPersoneller() {
        return personeller;
    }

    public void setPersoneller(ArrayList<Personel> personeller) {
        this.personeller = personeller;
    }

    public ArrayList<Proje> getProjeler() {
        return projeler;
    }

    public void setProjeler(ArrayList<Proje> projeler) {
        this.projeler = projeler;
    }
    
    
    
    
     
}
