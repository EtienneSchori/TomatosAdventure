/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.home.Tomato.Adventure.Buisness;

/**
 *
 * @author etienne.schori
 */
public class Player {
    String pseudo;
    int force;
    int dexterite;
    int agilite;
    int constitution;
    int volonte;
    int charisme;
    int connaissance;
    int chance;

    public Player() {
    }

    public Player(String pseudo, int force, int dexterite, int agilite, int constitution, int volonte, int charisme, int connaissance, int chance) {
        this.pseudo = pseudo;
        this.force = force;
        this.dexterite = dexterite;
        this.agilite = agilite;
        this.constitution = constitution;
        this.volonte = volonte;
        this.charisme = charisme;
        this.connaissance = connaissance;
        this.chance = chance;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDexterite() {
        return dexterite;
    }

    public void setDexterite(int dexterite) {
        this.dexterite = dexterite;
    }

    public int getAgilite() {
        return agilite;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getVolonte() {
        return volonte;
    }

    public void setVolonte(int volonte) {
        this.volonte = volonte;
    }

    public int getCharisme() {
        return charisme;
    }

    public void setCharisme(int charisme) {
        this.charisme = charisme;
    }

    public int getConnaissance() {
        return connaissance;
    }

    public void setConnaissance(int connaissance) {
        this.connaissance = connaissance;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "Player{" + "pseudo=" + pseudo + ", force=" + force + ", dexterite=" + dexterite + ", agilite=" + agilite + ", constitution=" + constitution + ", volonte=" + volonte + ", charisme=" + charisme + ", connaissance=" + connaissance + ", chance=" + chance + '}';
    }

    
}
