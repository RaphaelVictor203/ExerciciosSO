/*
 * 	Fazer uma aplicação que insira números
	aleatórios em uma matriz 3 x 5 e tenha 3
	Threads, onde cada Thread calcula a soma dos
	valores de cada linha, imprimindo a identificação
 	da linha e o resultado da soma.
 * */

package view;

import controller.ThreadSomaLinha;

public class MainExc2 {
	
	static int[][] mat = new int[3][5];

	public static void main(String[] args) {
		Thread somaLinha;
		mat = returnMat(mat);
		for(int i=0; i<mat.length; i++) {
			somaLinha = new ThreadSomaLinha(returnVet(i));
			somaLinha.start();
			try {
				somaLinha.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static int[][] returnMat(int[][] mat){
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				mat[i][j] = (int)(Math.random()*101);
			}
		}
		return mat;
	}
	
	public static int[] returnVet(int linha) {
		int[] vet = new int[mat[0].length];
		for(int i=0; i<vet.length; i++) {
			vet[i] = mat[linha][i];
		}
		System.out.println();
		return vet;
	}

}
