/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.LinkedList;

abstract class AlgoritmoDeSubstituicao {
    protected int numeroDeFalhas;
    protected int numeroDeQuadros;
    LinkedList quadros;

 public AlgoritmoDeSubstituicao(int numeroDeQuadros) {
  if (numeroDeQuadros < 0)
   throw new IllegalArgumentException();
  this.numeroDeQuadros = numeroDeQuadros;
  numeroDeFalhas = 0;
 }

 public int getPageFaultCount() {
  return numeroDeFalhas;
 }

 public abstract void inserir(String pageNumber);

 public void imprimirQuadros() {
  System.out.print("Quadros:  ");
  for (int i = 0; i < quadros.size(); i++) {
   System.out.print(quadros.get(i) + " ");
  }
  System.out.println();
 }
}
