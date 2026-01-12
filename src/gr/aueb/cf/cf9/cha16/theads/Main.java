package gr.aueb.cf.cf9.cha16.theads;

public class Main {

    public static void main(String[] args) {


        WorkerThread worker = new WorkerThread();
        WorkerThread worker1 = new WorkerThread();
        WorkerThread worker2 = new WorkerThread();
        Thread thread = new Thread(worker);

        new Thread(worker1).start();
        new Thread(worker2).start();

        thread.start();



    }
}
