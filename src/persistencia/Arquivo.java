/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author willi
 */
public class Arquivo<T> {
    private String NOME;

    public Arquivo(String NOME) {
        this.NOME = NOME;
    }
    
    public static List<File> getArquivos(String dir){
        File diretorio = new File(dir);
        File[] arquivos = diretorio.listFiles();
        return Arrays.asList(arquivos);
    }
    
    public String salvar(T objeto, String path){
        try {
            this.NOME = path;
            FileOutputStream arqGrav = new FileOutputStream(NOME);
            ObjectOutputStream objGrav = new ObjectOutputStream(arqGrav);
            objGrav.writeObject(objeto);
            objGrav.flush();
            objGrav.close();
            arqGrav.flush();
            arqGrav.close();
            return "Objeto gravado com sucesso";
            
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String salvar(T objeto){
        try {
            FileOutputStream arqGrav = new FileOutputStream(NOME);
            ObjectOutputStream objGrav = new ObjectOutputStream(arqGrav);
            objGrav.writeObject(objeto);
            objGrav.flush();
            objGrav.close();
            arqGrav.flush();
            arqGrav.close();
            return "Objeto gravado com sucesso";
            
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public T carregar(String path) throws ClassNotFoundException{
        try {
            this.NOME = path;
            T objeto = null;
            FileInputStream arqLeit = new FileInputStream(NOME);
            ObjectInputStream objLeit = new ObjectInputStream(arqLeit);
            objeto = (T) objLeit.readObject();
            arqLeit.close();
            objLeit.close();
            return objeto;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally{
        }
    }
    public T carregar() throws ClassNotFoundException{
        try {
            T objeto = null;
            FileInputStream arqLeit = new FileInputStream(NOME);
            ObjectInputStream objLeit = new ObjectInputStream(arqLeit);
            objeto = (T) objLeit.readObject();
            arqLeit.close();
            objLeit.close();
            return objeto;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally{
        }
    }
    
}
