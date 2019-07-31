/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import persistencia.Arquivo;

/**
 *
 * @author willi
 */
public class Personagem implements Serializable{
    
    public enum Atributo{
        FOR("Força"),
        DES("Destreza"),
        CON("Constituição"),
        INT("Inteligência"),
        SAB("Sabedoria"),
        CAR("Carisma");
        
        private final String label;
        
        private Atributo(String label){
            this.label = label;
        }

        public String getLabel() {
            return label;
        }

        @Override
        public String toString() {
            return label;
        }  
    }
    
    public enum Pericia{
        ACROBACIA("Acrobacia", 1),
        ADESTRAR_ANIMAIS("Adestrar Animais", 4),
        ARCANISMO("Arcanismo", 3),
        ATLETISMO("Atletismo", 0),
        ATUACAO("Atuação", 5),
        ENGANACAO("Enganação", 5),
        FURTIVIDADE("Furtividade", 1),
        HISTORIA("História", 3),
        INTIMIDACAO("Intimidação", 5),
        INTUICAO("Intuição", 4),
        INVESTIGACAO("Investigação", 3),
        MEDICINA("Medicina", 4),
        NATUREZA("Natureza", 3),
        PERCEPCAO("Percepção", 4),
        PERSUASAO("Persuasão", 5),
        PRESTIDIGITACAO("Prestidigitação", 1),
        RELIGIAO("Religião", 3),
        SOBREVIVENCIA("Sobrevivência", 4);
        
        private final String label;
        private final int index;
        
        private Pericia(String label, int index){
            this.label = label;
            this.index = index;
        }

        public String getLabel() {
            return label;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public String toString() {
            return label;
        }        
    }
    
    public enum TesteResistencia{
        FORCA("Força", 0),
        DESTREZA("Destreza", 1),
        CONSTITUICAO("Constituição", 2),
        INTELIGENCIA("Inteligência", 3),
        SABEDORIA("Sabedoria", 4),
        CARISMA("Carisma", 5);
        
        private final String label;
        private final int index;
        
        private TesteResistencia(String label, int index){
            this.label = label;
            this.index = index;
        }

        public String getLabel() {
            return label;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public String toString() {
            return label;
        }  
    }
    
    private String nome, criador, classe, raca, equipamento, obs;
    private int proficiencia, classeArmadura, iniciativa, vida, vidaTemp, exp, nivel;
    /**
     *Atributos:
     *[0]força
     *[1]destreza
     *[2]constituição
     *[3]inteligência
     *[4]sabedoria
     *[5]carisma
     */
    private int[] atributos;
    private Pericia[] pericias = null;
    private TesteResistencia[] testes_res = null;

    public Personagem(String nome, String criador, String classe, String raca, String equipamento, String obs, int proficiencia, int classeArmadura, int iniciativa, int vida, int vidaTemp, int exp, int nivel, int[] atributos, Pericia[] pericias, TesteResistencia[] testes_res) {
        this.nome = nome;
        this.criador = criador;
        this.classe = classe;
        this.raca = raca;
        this.equipamento = equipamento;
        this.obs = obs;
        this.proficiencia = proficiencia;
        this.classeArmadura = classeArmadura;
        this.iniciativa = iniciativa;
        this.vida = vida;
        this.vidaTemp = vidaTemp;
        this.exp = exp;
        this.nivel = nivel;
        this.atributos = atributos;
        this.pericias = pericias;
        this.testes_res = testes_res;
    }

    public Personagem(String nome, String classe, String raca, int iniciativa, int vida, int[] atributos) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.iniciativa = iniciativa;
        this.vida = vida;
        this.atributos = atributos;
    }

    public static boolean existePer(String nome){
        String PATH = System.getProperty("user.dir") + "//files//personagens";
        List<File> files = Arquivo.getArquivos(PATH);
        for(File f : files){
            if(f.getName().equals(nome + ".per")) return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public int getProficiencia() {
        return proficiencia;
    }

    public void setProficiencia(int proficiencia) {
        this.proficiencia = proficiencia;
    }

    public int getClasseArmadura() {
        return classeArmadura;
    }

    public void setClasseArmadura(int classeArmadura) {
        this.classeArmadura = classeArmadura;
    }

    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaTemp() {
        return vidaTemp;
    }

    public void setVidaTemp(int vidaTemp) {
        this.vidaTemp = vidaTemp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Pericia[] getPericias() {
        return pericias;
    }

    public void setPericias(Pericia[] pericias) {
        this.pericias = pericias;
    }

    public TesteResistencia[] getTestes_res() {
        return testes_res;
    }

    public void setTestes_res(TesteResistencia[] testes_res) {
        this.testes_res = testes_res;
    }
    
    public int[] getAtributos() {
        return atributos;
    }

    public void setAtributos(int[] atributos) {
        this.atributos = atributos;
    }
    
    public int[] getModificadores(){
        int[] mods = new int[6];
        for(int i=0; i<6; i++){
            mods[i] = (atributos[i]/2) - 5;
        }
        return mods;
    }
    
    public String info(){
        String info = "______________________________________\n";
                
        info +=   "Nome: " + this.nome + "\n"
                + "Criador: " + this.criador + "\n"
                + "Classe: " + this.classe + "\n"
                + "Raça: " + this.raca + "\n"
                + "Exp: " + this.exp + "\n"
                + "Nível: " + this.nivel + "\n"
                + "Perícias Proficientes:\n";
        
        if(pericias!= null){
            for(Pericia p : pericias)
                info += "\t" + p.getLabel() + "\n";
        }else info += "Nenhuma\n";
        
        
        info += "Testes de Resistência Proficientes:\n";
        
        if(testes_res != null){
            for(TesteResistencia tr : testes_res)
                info += "\t" + tr.getLabel() + "\n";
        }else info += "Nenhum\n";
        
        
        info += "Atributos:\n";
        for(int i=0; i<atributos.length;i++)
            info += "\t" + Atributo.values()[i].getLabel() + ": " + atributos[i] + "[" + getModificadores()[i] + "]" + "\n"; 
        
        info += "______________________________________\n";
        
        return info;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
