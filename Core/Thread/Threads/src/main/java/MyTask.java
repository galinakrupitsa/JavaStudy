public class MyTask implements Runnable {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Поток работает...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // восстанавливаем статус прерывания
            }
        }
        System.out.println("Поток завершён.");
    }

    // Метод для остановки
    public void stop() {
        running = false;
    }
}






