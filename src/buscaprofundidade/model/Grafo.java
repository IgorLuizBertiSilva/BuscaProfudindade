/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaprofundidade.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class Grafo {
    
    private List<Vertice> vertices;
    private List<Aresta> arestas;

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
        this.vertices = vertices;
    }

    public List<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(List<Aresta> arestas) {
        this.arestas = arestas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.vertices);
        hash = 17 * hash + Objects.hashCode(this.arestas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Grafo other = (Grafo) obj;
        if (!Objects.equals(this.vertices, other.vertices)) {
            return false;
        }
        if (!Objects.equals(this.arestas, other.arestas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String r = "";
        for (Vertice u : vertices) {
            r += u.getNome() + " -> ";
            for (Aresta e : u.getAdj()) {
                Vertice v = e.getDestino();
                r += v.getNome() + ", ";
            }
            r += "\n";
        }
        return r;
    }
    
    

    public Grafo() {
        
        vertices = new ArrayList<Vertice>();
        arestas = new ArrayList<Aresta>();
        
        
    }
    
    public Vertice addVertice(String nome){
        
        Vertice vertice = new Vertice(nome);
        vertices.add(vertice);
        return vertice;
        
    }
    
    public Aresta addAresta(Vertice origem, Vertice destino){
        
        Aresta aresta = new Aresta(origem, destino);
        origem.addAdj(aresta);
        
        arestas.add(aresta);
        return aresta;
    }
    
    
    
}
