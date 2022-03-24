package view;

import java.util.concurrent.Semaphore;
import controller.CorridaF1;
public class Principal {

	public static void main(String[] args) {
		Semaphore smf_1 = new Semaphore(5);
		Semaphore smf_2 = new Semaphore(1);
		Semaphore smf_3 = new Semaphore(1);
		Semaphore smf_4 = new Semaphore(1);
		Semaphore smf_5 = new Semaphore(1);
		Semaphore smf_6 = new Semaphore(1);
		Semaphore smf_7 = new Semaphore(1);
		Semaphore smf_8 = new Semaphore(1);
		
		System.out.println("Carro #1 - time: 1\n"
				+ "Carro #2 - time: 1\n"
				+ "Carro #3 - time: 2\n"
				+ "Carro #4 - time: 2\n"
				+ "Carro #5 - time: 3\n"
				+ "Carro #6 - time: 3\n"
				+ "Carro #7 - time: 4\n"
				+ "Carro #8 - time: 4\n"
				+ "Carro #9 - time: 5\n"
				+ "Carro #10 - time: 5\n"
				+ "Carro #11 - time: 6\n"
				+ "Carro #12 - time: 6\n"
				+ "Carro #13 - time: 7\n"
				+ "Carro #14 - time: 7\n");
		
		for (int threadId = 1; threadId < 15; threadId ++) {
			Thread thread = new CorridaF1 (threadId, smf_1, smf_2, smf_3, smf_4, smf_5, smf_6, smf_7, smf_8);
			thread.start();
		}
	}

}