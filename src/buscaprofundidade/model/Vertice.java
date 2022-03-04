/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaprofundidade.model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Vertice {
    
    private String nome;
    private List<Aresta> adj;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aresta> getAdj() {
        return adj;
    }

    public void setAdj(List<Aresta> adj) {
        this.adj = adj;
    }
    
    

    public Vertice() {
    }
    
    
    public Vertice(String nome){
        this.nome = nome;
        this.adj = new VirtualFlow.ArrayLinkedList<Aresta>();
    }
    
    public void addAdj(Aresta e){
        adj.add(e);
    }
    
}
