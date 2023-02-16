/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.eni.prorpjet;

/**
 *
 * @author erwan
 */
public class Adversaire {
    private String nomAdversaire;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    private int zone;
    public Adversaire(String unNom, int unNbPvActuel, int unNbPvMax, int uneAtk, int uneDef, int unCC)
    {   
        this.nomAdversaire = unNom;
        this.pvActuel = unNbPvActuel;
        this.pvMax= unNbPvMax;
        this.attaque = uneAtk;
        this.defense = uneDef;
        this.coupCritique = unCC;
        
        /*
        Ecrire le constructeur.
        */
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getNomAdversaire() {
        return nomAdversaire;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public double getCoupCritique() {
        return coupCritique;
    }

    public void setNomAdversaire(String nomAdversaire) {
        this.nomAdversaire = nomAdversaire;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
    }

    
    public void affStatsCombat() {
               
        System.out.println("l'Adversaire est : " + this.nomAdversaire );
        System.out.println("l'Adversaire possède : " + this.pvActuel/ this.pvMax + "  pv" );
        System.out.println("Vos statistiques sont les suivantes : " );
        System.out.println("l'Adversaire a : " + this.attaque + " d'attaque" );
        System.out.println("l'Adversaire a : " + this.defense + "defense");
        System.out.println("l'Adversaire a : " + this.coupCritique + "de Coupcritique");
        /*
        Cette fonction affiche les stats de l'adversaire. (Nom, PV, Att, Def, Crit)
        */
    }
    public void subirDegat(int attaquePersonnage, boolean critiquePersonnage)
    {

        if (critiquePersonnage== true) {
        this.pvActuel= (attaquePersonnage*2) - this.defense;
        
                if(this.pvActuel<0){
                    this.pvActuel=0;
                }
                        else {
                            System.out.println("les nouveaux pv de l'adversaire s'élève à :" +  this.pvActuel);
                    }
        }        
        else {
        this.pvActuel= attaquePersonnage - this.defense;
                if(this.pvActuel<0){
                        this.pvActuel=0;
                }
        
        System.out.println("les nouveaux pv de l'Adversaire s'élèvent à :" + this.pvActuel);
        }

    }
}
