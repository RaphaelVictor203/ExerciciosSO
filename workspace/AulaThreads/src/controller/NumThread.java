package controller;

public class NumThread extends Thread{
	private int num;
	
	public NumThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		System.out.println(getNum());
	}
	
	private int getNum() {
		return this.num;
	}
}
