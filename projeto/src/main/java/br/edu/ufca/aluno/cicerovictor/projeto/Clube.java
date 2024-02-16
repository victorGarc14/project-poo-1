/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.aluno.cicerovictor.projeto;

/**
 *
 * @author cicer
 */
public class Clube {
    private String nome;
    private int pontos;
    private int sdg;

    public Clube(String nome) {
        this.nome = nome;
    }
    public void ganhar(int sdg){
        adicionarPontos(3);  
        this.sdg +=sdg;
}
    public void empatar(){
        adicionarPontos(1);  
} 
    public void perder(int sdg){
        adicionarPontos(0); 
        this.sdg -=sdg;
}
    public void adicionarPontos(int pontos) {
        this.pontos += pontos;
    }
    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    /**
     *
     * @return
     */
    public int getSaldo() {
        return sdg;
    }

}