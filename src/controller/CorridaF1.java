package controller;

import java.util.concurrent.Semaphore;

public class CorridaF1 extends Thread {
	private int threadId;
	Semaphore smf_1;
	Semaphore smf_2;
	Semaphore smf_3;
	Semaphore smf_4;
	Semaphore smf_5;
	Semaphore smf_6;
	Semaphore smf_7;
	Semaphore smf_8;
	int volta = 1;
	int t = 1000000000;
	Time tem = new Time(threadId, t);
	
	public CorridaF1(int threadId, Semaphore smf_1, Semaphore smf_2, Semaphore smf_3, Semaphore smf_4, Semaphore smf_5, Semaphore smf_6, Semaphore smf_7, Semaphore smf_8) {
		this.threadId = threadId;
		this.smf_1 = smf_1;
		this.smf_2 = smf_2;
		this.smf_3 = smf_3;
		this.smf_4 = smf_4;
		this.smf_5 = smf_5;
		this.smf_6 = smf_6;
		this.smf_7 = smf_7;
		this.smf_8 = smf_8;
	}
	
	public void run() {
		
		if (threadId == 1) {
			time_1();
		}
		if (threadId == 2) {
			time_1();
		}
		if (threadId == 3) {
			time_2();
		}
		if (threadId == 4) {
			time_2();
		}
		if (threadId == 5) {
			time_3();
		}
		if (threadId == 6) {
			time_3();
		}
		if (threadId == 7) {
			time_4();
		}
		if (threadId == 8) {
			time_4();
		}
		if (threadId == 9) {
			time_5();
		}
		if (threadId == 10) {
			time_5();
		}
		if (threadId == 11) {
			time_6();
		}
		if (threadId == 12) {
			time_6();
		}
		if (threadId == 13) {
			time_7();
		}
		if (threadId == 14) {
			time_7();
		}
		
		tem.salvar();
	}

	private void time_1() {
		
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_2.acquire();
				pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_2.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time_2() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_3.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_3.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time_3() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_4.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_4.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time_4() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_5.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_5.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time_5() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_6.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_6.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time_6() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_7.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_7.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private void time_7() {
		for(int volta = 1; volta < 4; volta++) {
			
			try {
				smf_8.acquire();
				t = pista();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				smf_8.release();
			}
		}
		System.out.println("O menor tempo do carro #"+threadId+" foi de: "+ (t/1000)+ " segundos!!");
	}

	private int pista() {
		try {
			smf_1.acquire();
			
			System.out.println("O carro #" + threadId +" está dando a " + volta + " volta!");
			int tempo = (int) (Math.random()* 17001) + 1000;
			sleep(tempo);
			System.out.println("O carro #" + threadId +" completou a " + volta + " volta em "+(tempo/1000)+" segundos");
			volta++;
			if (tempo < t) {
				t = tempo;
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			smf_1.release();
		}
		return(t);
	}
}