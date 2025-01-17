/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import distribuidos.sistemas.trabalho.classes.Cidade;
import distribuidos.sistemas.trabalho.classes.Contato;
import distribuidos.sistemas.trabalho.dao.BuscarCidade;
import distribuidos.sistemas.trabalho.dao.BuscarContato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Listar {
    private Contato contato;
    private Cidade cidade;
    
    public List<String> listar(List<String> dados) throws Exception{
        contato = new Contato();
        List<String> retorno = new ArrayList<>();
        int i = 0;
        if(dados.get(i).equals("l")){ // Testa se for consultar
            i++;
            String nome = new String(dados.get(i));
            i++;
            String uf = new String(dados.get(i));
            i++;
            
            BuscarCidade ic = new BuscarCidade();
            cidade = ic.buscarCidade(nome, uf);
            BuscarContato bc = new BuscarContato();
            List<Contato> lc;
            if(cidade !=null){
                lc = bc.listar(cidade); // Todos os contatos que preciso mandar estão aqui
                
                for(Contato c : lc){
                    String aux = c.getCodigo()+" "+c.getNome()+" "+c.getEmail()+ " \n";
                    retorno.add(aux);
                }
            }
        }
        return retorno;
    }
}