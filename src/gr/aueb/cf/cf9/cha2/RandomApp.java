package gr.aueb.cf.cf9.cha2;

/*
  * Demo class που μας δίνει έναν τυχαιο ακέραιο αριθμό απο το 0 εως το 6
*/
public class RandomApp {

    public static void main(String[] args) {

        int die = 0;

        die = (int) (Math.random() * 6) +1 ;

        System.out.printf("The random number is: "+ die);
    }
}
