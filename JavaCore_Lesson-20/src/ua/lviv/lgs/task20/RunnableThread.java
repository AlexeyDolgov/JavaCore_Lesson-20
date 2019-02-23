package ua.lviv.lgs.task20;

public class RunnableThread implements Runnable {

	int number;
	private Thread thread;

	public RunnableThread(int number) {
		this.number = number;
		this.thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		// int number = Main.getNumberFibonacci();

		int n0 = 0;
		int n1 = 1;
		int n2;

		if (number < 1) {
			System.out.println("Введенное число отрицательно или равно нулю!");
		} else if (number == 1) {
			System.out.println(n0);
		} else {
			Integer[] fibonacci = new Integer[number];
			fibonacci[0] = n0;
			fibonacci[1] = n1;

			System.out.print("Ряд чисел Фибоначчи по убыванию: ");
			for (int i = 2; i < fibonacci.length; i++) {
				n2 = n0 + n1;
				fibonacci[i] = n2;

				n0 = n1;
				n1 = n2;
			}

			for (int i = fibonacci.length - 1; i >= 2; i--) {
				System.out.print(fibonacci[i] + " ");
			}

			System.out.print(fibonacci[1] + " " + fibonacci[0]);
			System.out.println();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
