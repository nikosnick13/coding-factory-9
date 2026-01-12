package gr.aueb.cf.cf9.cha16.theads;

public class WorkerThread implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <= 1_00_000_000; i++){

            if (i == 1_00_000_000){
                System.out.println("Done!");
            }
        }

    }
}
