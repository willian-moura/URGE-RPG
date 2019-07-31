/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testearquivo;

import entidades.Escudo;
import entidades.Personagem;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import persistencia.Arquivo;

/**
 *
 * @author willi
 */
public class SalvarLer {
    public static void main(String args[]) throws ClassNotFoundException{
        final String PATH = System.getProperty("user.dir") + "//files//escudos";
        List<File> files = Arquivo.getArquivos(PATH);
        
//        Escudo escudo = new Escudo("teste.esc", "Teste");
//        Arquivo<Escudo> arq = new Arquivo<>(PATH + "//teste.esc");
//        arq.salvar(escudo);
        
        for(File f : files){
            System.out.println(f);
        }
        
        
        
        
        
        
        //System.out.println(per.info());
        

        
        
    }
}
