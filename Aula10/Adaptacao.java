/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc;

import java.util.*;
/**
 *
 * @author junio
 */
public class Adaptacao {
    public static void main(String[] args) {
		ArrayList<IDados> arrdados = new ArrayList();
                
                adptEstagio estagio = new adptEstagio("UMC", "Monitor");
                adptVisitaTecnica visita = new adptVisitaTecnica("Aviário", "12/08", "Botanicos");
                adptPalestra palestra = new adptPalestra("Desafios do Tempo", "Joano", "14/09");
                adptCursoExtraCurricular curso = new adptCursoExtraCurricular("Comunicação", "Sala CF");
               
                arrdados.add(estagio);
                arrdados.add(visita);
                arrdados.add(palestra);
                arrdados.add(curso);
                
                for(IDados dados : arrdados){
                    System.out.println("Evento:" + dados.getDados());
                }
	}
}
