/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.aluno.cicerovictor.projeto;

/**
 *
 * @author cicer
 */
import java.util.Random;
import java.util.*;
import java.util.List;

public class Campeonato {
    private Clube[] clubes;

    public Campeonato(Clube[] clubes) {
        this.clubes = clubes;
    }

    public Clube[] getClubes() {
        return clubes;
    }
 
    private void jogarPartida(Clube clube1, Clube clube2) {
        Random random = new Random();
        int golsTime1 = random.nextInt(6);
        int golsTime2 = random.nextInt(6);
        int sdg;
        
        if (golsTime1 > golsTime2) {
            sdg = golsTime1 - golsTime2;
            clube1.ganhar(sdg);
            clube2.perder(sdg);
        } else if (golsTime1 < golsTime2){
            sdg = golsTime2 - golsTime1;
            clube1.perder(sdg);
            clube2.ganhar(sdg);   
        } else {
            clube1.empatar();
            clube2.empatar();
        }
        System.out.printf(clube1.getNome()+ " "+golsTime1+"x"+golsTime2+" "+clube2.getNome()+"\n" );

}
    public void jogarCampeonato(){
        List<Clube> tabela = new ArrayList<>();
        System.out.println("____CONFRONTOS___");
        for (int i = 0; i < clubes.length - 1; i++) {
            for (int j = i + 1; j < clubes.length; j++) {
                Clube clubeA = clubes[i];
                Clube clubeB = clubes[j];
                jogarPartida(clubeA, clubeB);
                jogarPartida(clubeB, clubeA);
            }       
        } 
        System.out.println("-----------------");
        tabela.addAll(Arrays.asList(clubes));
        
        Collections.sort(tabela,(c1,c2) -> {
            if(c1.getPontos() != c2.getPontos()){
                return c2.getPontos() - c1.getPontos();
            }else{
                return c2.getSaldo() - c1.getSaldo();
}
});
    }      
    public List getClassificacao(){   
        List<Clube> tabela = new ArrayList<>();
        tabela.addAll(Arrays.asList(clubes));
        Collections.sort(tabela,(c1,c2) -> {
            if(c1.getPontos() != c2.getPontos()){
                return c2.getPontos() - c1.getPontos();
            }else{
                return c2.getSaldo() - c1.getSaldo();
            }
        });
        System.out.println("             \n            Tabela");
        System.out.println("Posição|Clube |Pontos|Saldo de Gols");
         for (int i = 0; i < tabela.size(); i++) {
            Clube clube = (Clube) tabela.get(i);
            System.out.printf("%-8d%-8s%-8d%d\n", i + 1, clube.getNome(), clube.getPontos(), clube.getSaldo());
        }
         return tabela;
    }
    public void getCampeao(List tabela){
        Clube clube = (Clube) tabela.get(0);
        System.out.printf("\n    O campeão foi o " +clube.getNome());
}
}