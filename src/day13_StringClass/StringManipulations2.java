package day13_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = "Cybertek School is the best";
        //            012345678
        String schoolName = str.substring(0,8);

        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
        //                 0123456789..

        String firstName = fullName.substring(0, 6 );
        String lastName = fullName.substring(7, 11+1);

        System.out.println(firstName);
        System.out.println(lastName);

        // full name  =firstname  lastname
        // gmail: lastName_firstname@gmail.com

        String Murtaza = "Murtaza Nazeeri";
        //                0123456789 ....

        String firstname = Murtaza.substring(0, 6+1 );
        String lastname = Murtaza.substring(8, 14+1);
        System.out.println(firstname);
        System.out.println(lastname);

       // String gmail = lastname.concat("_").concat(firstname).concat("@gmail.com");
        String gmail = lastname + "_" + firstname + "@gmail.com";
     //   String gmail = Murtaza.substring(8, 14+1) +"_"+Murtaza.substring(0, 6+1 ) + "@gmail.com";

        System.out.println(gmail);



    }


}
