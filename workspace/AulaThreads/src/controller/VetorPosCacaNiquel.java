package controller;

public class VetorPosCacaNiquel {
	private int[] vetPos;
	private int pos = 0;
	
	public VetorPosCacaNiquel(int max) {
		this.vetPos = new int[max];
	}
	
	public void insert(int num) {
		if(pos < vetPos.length) {
			vetPos[pos] = num;
			pos++;
		}else {
			System.err.println("Não há espaço");
		}
	}
	
	public boolean checaTermino() {
		int count = 0;
		for(int i=0; i<vetPos.length; i++) {
			if(vetPos[i] != 0) {
				count++;
			}
		}
		if(count == vetPos.length) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean ganhou() {
		boolean ganha = false;
		for(int i=0; i<(vetPos.length-1); i++) {
			if(vetPos[i] == vetPos[i+1]) {
				ganha = true;
			}else {
				ganha = false;
				break;
			}
		}
		return ganha;
	}
}
