package gr.aueb.cf.cf9.cha7;

public class StrEtc {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for( char ch : s.toCharArray()){
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        //Replace

        String firstName = "Maria-Eleni";
        String nickName  =firstName.replace("-", " ");

        System.out.println(nickName);


        // Concat
        String lastname = "Smith";
        String fullName1 = firstName + " " + lastname;

        String fullName2 = firstName.concat(" ").concat(lastname);
        System.out.println(fullName2);
        System.out.println(fullName1);
    }




}
