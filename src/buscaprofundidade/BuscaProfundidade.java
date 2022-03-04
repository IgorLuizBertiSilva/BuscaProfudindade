/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaprofundidade;

import buscaprofundidade.model.Aresta;
import buscaprofundidade.model.Grafo;
import buscaprofundidade.model.Vertice;

/**
 *
 * @author Aluno
 */
public class BuscaProfundidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Declaração do Grafo G
        System.out.println("Criando o grafo");
        Grafo grafo = new Grafo();
        
        // Preenchimento dos vertices do grafo, sem as arestas ainda
        System.out.println("====================================================");
        System.out.println("Preenchendo as arestas no Grafo");
        Vertice h = grafo.addVertice("h");
        Vertice e = grafo.addVertice("e");
        Vertice f = grafo.addVertice("f");
        Vertice k = grafo.addVertice("k");
        Vertice i = grafo.addVertice("i");
        Vertice b = grafo.addVertice("b");
        Vertice c = grafo.addVertice("c");
        Vertice a = grafo.addVertice("a");
        Vertice g = grafo.addVertice("g");
        Vertice m = grafo.addVertice("m");
        Vertice l = grafo.addVertice("l");
        Vertice d = grafo.addVertice("d");
        Vertice j = grafo.addVertice("j");
        
        System.out.println("====================================================");
        System.out.println("Preenchendo as arestas");
        
        Aresta he = grafo.addAresta(h, e);
        Aresta hf = grafo.addAresta(h, f);
        Aresta hj = grafo.addAresta(h, j);
        Aresta hk = grafo.addAresta(h, k);
        Aresta ei = grafo.addAresta(e, i);
        Aresta ik = grafo.addAresta(i, k);
        Aresta kl = grafo.addAresta(k, l);
        Aresta fb = grafo.addAresta(f, b);
        Aresta fc = grafo.addAresta(f, c);
        Aresta ja = grafo.addAresta(j, a);
        Aresta jg = grafo.addAresta(j, g);
        Aresta jm = grafo.addAresta(j, m);
        Aresta bc = grafo.addAresta(b, c);
        Aresta ca = grafo.addAresta(c, a);
        Aresta gd = grafo.addAresta(g, d);
        Aresta dm = grafo.addAresta(d, m);
        
        System.out.println("====================================================");
        System.out.println("Imprimindo o grafo");
        System.out.println(grafo);
        
        
    }
    
}
