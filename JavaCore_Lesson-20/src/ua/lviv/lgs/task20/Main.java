package ua.lviv.lgs.task20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

		int number = getNumberFibonacci();
		
		MyThread myThread = new MyThread(number);
		myThread.start();

		RunnableThread myRunnable = new RunnableThread(number);
		
		System.out.println();
		
		int number2 = getNumberFibonacci();
		ExecutorService executorFTP = Executors.newFixedThreadPool(50);
		ExecutorService executorSTP = Executors.newScheduledThreadPool(50);
		
		executorFTP.execute(new Runnable() {
			@Override
			public void run() {
				FibonacciSequence.getFibonacciSequence(number2, true);
			}
		});
		
		executorSTP.execute(new Runnable() {
			@Override
			public void run() {
				FibonacciSequence.getFibonacciSequence(number2, false);
			}
		});
		
		executorFTP.shutdown();
		executorSTP.shutdown();
	}

	public static int getNumberFibonacci() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество чисел ряда Фибоначчи:");
		int number = scanner.nextInt();
		return number;
	}

}
