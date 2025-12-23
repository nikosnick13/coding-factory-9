package gr.aueb.cf.cf9.cha4;

public class ForEverAppWithBreak {

    public static void main(String[] args) {

        int count = 0 ;
        final int MAX = 50;

        for(;;){
            System.out.println("Forever");
            count++;

            if(count % 10 == 0) System.out.println();
            if (count == MAX) break;
        }
    }
}
