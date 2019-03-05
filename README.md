# JavaCore_Lesson-20
Threads (class Thread, interface Runnable), Executor Services

* [Завдання 1](https://github.com/AlexeyDolgov/JavaCore_Lesson-20/tree/master/JavaCore_Lesson-20/src/ua/lviv/lgs/task20)<br>
Створити потік. Створити клас <i>MyThread</i>. Наслідувати його від класу [Thread](https://github.com/AlexeyDolgov/JavaCore_Lesson-20/blob/master/JavaCore_Lesson-20/src/ua/lviv/lgs/task20/MyThread.java).
Перевизначити метод run() так, щоб можна було вивести введену з консолі кількість чисел Фібоначчі. Для цього використовуємо в методі
run() клас Scanner. Тобто ми вводимо з консолі, скільки ми хочемо бачити чисел Фібоначчі і виводимо їх з затримкою в 1 секунду.<br><br>
Створити потік. Створити клас <i>RunnableThread</i>. Імплементувати його від інтерфейсу [Runnable](https://github.com/AlexeyDolgov/JavaCore_Lesson-20/blob/master/JavaCore_Lesson-20/src/ua/lviv/lgs/task20/RunnableThread.java).
Метод run() перевизначити таким чином, щоб числа Фібоначчі виводились в зворотному порядку. Тобто спершу ми вводимо через Scanner,
скільки ми хочемо бачити чисел Фібоначчі, а потім з затримкою в 1 секунду виводимо їх від останнього до першого значення.<br><br>
Перший і другий потоки повинні виводити в один рядок числа. Вигляд на консолі:<br>
Потік Thread: 0 1 1 2 3 5 . . .<br>
Потік Runnable: . . .5 3 2 1 1 0<br>

* Завдання 2<br>
Виконайте попереднє завдання використовуючи різні типи [Executor Services](https://github.com/AlexeyDolgov/JavaCore_Lesson-20/blob/master/JavaCore_Lesson-20/src/ua/lviv/lgs/task20/Main.java).
