package gr.aueb.cf.cf9.cha2;




public class IntApp {

    public static void main(String[] args) {

        System.out.printf("Type Int:   Bits: %2d, Bytes: %d, Max value: %,d, Min value: %,d \n",Integer.BYTES * 8,Integer.BYTES , Integer.MAX_VALUE, Integer.MIN_VALUE);
        System.out.printf("Type Byte:  Bits: %2d, Bytes: %d, Max value: %,d, Min value: %,d \n",Byte.BYTES * 8,Byte.BYTES, Byte.MAX_VALUE, Byte.MIN_VALUE);
        System.out.printf("Type Long:  Bits: %2d, Bytes: %d, Max value: %,d, Min value: %,d \n",Long.BYTES *8, Long.BYTES,Long.MAX_VALUE,Long.MIN_VALUE);
        System.out.printf("Type Short: Bits: %2d, Bytes: %d, Max value: %,d, Min value: %,d \n",Short.BYTES *8, Short.BYTES,Short.MAX_VALUE,Short.MIN_VALUE);
    }
}
