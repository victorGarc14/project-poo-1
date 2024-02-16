/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.ufca.aluno.cicerovictor.projeto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cicer
 */
public class Teste {
    public static void main(String[] args) {
        Clube clube1 = new Clube("ClubeA");
        Clube clube2 = new Clube("ClubeB");
        Clube clube3 = new Clube("ClubeC");
        Clube clube4 = new Clube("ClubeD");
        Clube[] clubes = {clube1, clube2, clube3, clube4};
        Campeonato campeonato = new Campeonato(clubes);
        campeonato.jogarCampeonato();
        List<Clube> tabela = campeonato.getClassificacao();
        campeonato.getCampeao(tabela);
    }
}