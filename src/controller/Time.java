package controller;

public class Time {
	int[] tempos = new int[14];
	private int t;
	private int threadId;
	
	
	public Time(int threadId, int t) {
		this.t = t;
		this.threadId = threadId;
	}
	
	public Time() {
		super();
	}
	
	
	public void salvar() {
		
		tempos[threadId] = t;
		
	}

}