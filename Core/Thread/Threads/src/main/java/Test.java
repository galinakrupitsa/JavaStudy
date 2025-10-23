public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyTask myTask = new MyTask();
        Thread thread0 = new Thread(() -> {
            System.out.println("Поток через лямбду: " + Thread.currentThread().getName());
        });
        thread0.start();
        Thread.sleep(1500);
        myTask.stop();
        thread0.join(); // ждём, пока поток завершится
        System.out.println("✅ Поток остановлен!");
        Thread thread1 = new Thread(() -> {
            System.out.println("Поток через лямбду: " + Thread.currentThread().getName());
        });

        thread1.start();
        Thread.sleep(500);

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Поток 2: шаг " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread2.start();
    }
}
