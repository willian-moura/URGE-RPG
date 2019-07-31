/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author alik
 */
public class Iniciativa implements Serializable{
    private int iniciativa;
    private String nome;
    private int vida;

    public Iniciativa(int iniciativa, String nome, int vida) {
        this.iniciativa = iniciativa;
        this.nome = nome;
        this.vida = vida;
    }
        
    
    
    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
