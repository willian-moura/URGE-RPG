/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import persistencia.Arquivo;

/**
 *
 * @author alik
 */
public class Escudo implements Serializable{
    private String nome;
    private List<Personagem> jogadores = new ArrayList<>();
    private List<Personagem> inimigos = new ArrayList<>();
    private List<Iniciativa> turnOrder = new ArrayList<>();
    private String obs;
    private int posTurnOrder;

    public Escudo(String nome, String obs, int posTurnOrder) {
        this.nome = nome;
        this.obs = obs;
        this.posTurnOrder = posTurnOrder;
    }
    
    public static boolean existeEscudo(String nome){
        String PATH = System.getProperty("user.dir") + "//files//escudos";
        List<File> files = Arquivo.getArquivos(PATH);
        for(File f : files){
            if(f.getName().equals(nome + ".esc")) return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagem> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Personagem> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Personagem> getInimigos() {
        return inimigos;
    }

    public void setInimigos(List<Personagem> inimigos) {
        this.inimigos = inimigos;
    }

    public List<Iniciativa> getTurnOrder() {
        return turnOrder;
    }

    public void setTurnOrder(List<Iniciativa> turnOrder) {
        this.turnOrder = turnOrder;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getPosTurnOrder() {
        return posTurnOrder;
    }

    public void setPosTurnOrder(int posTurnOrder) {
        this.posTurnOrder = posTurnOrder;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
