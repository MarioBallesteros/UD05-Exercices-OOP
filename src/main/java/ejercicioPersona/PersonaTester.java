package ejercicioPersona;

import java.util.Scanner;

public class PersonaTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre,apellidos,DNI;
        int edad; Sexo sexo;
        float pesoKg,alturaM;

        askForData();
        nombre = sc.nextLine();
        apellidos = sc.nextLine();
        edad = sc.nextInt();
        DNI = sc.nextLine();


        if(checkDNI(DNI)){
            DNI += Persona.getLetraDNI(DNI);
            sexo = askForSex();
            pesoKg = askForWeight();
            alturaM = askForHeight();
        }else {

        }
    }

    private static boolean checkDNI(String dni) {
        String numbers ="1234567890";
        if (dni.length()!= 8) return false;
        for (int i = 0; i < dni.length() ; i++) {
            if (!numbers.contains(dni.charAt(i)+"")) return false;
        }
        return true;
    }

    private static void askForData() {
        System.out.println("Let's add a new Person! "+"\n"+
                "I'll need the following data: "+
                "Name,Surname,Age,DNI(only numbers)"+"\n"+
                "[ If DNI length is wrong (!=8), DNI will be generated randomly ]");

    }

    private static Sexo askForSex() {
        Scanner sc = new Scanner(System.in);
        char letter;
        do {
            System.out.println("Sex: Men[M] || Women [W] || Not Say [N]");
            letter = Character.toUpperCase(sc.nextLine().charAt(0));

        }while (letter!= 'M' && letter!='W' && letter!='N');

        if (letter == 'M') return Sexo.HOMBRE;
        else if (letter == 'W') return Sexo.MUJER;
        else return Sexo.NO;
    }

    private static float askForWeight() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Weigth: (in kilograms)");
        return sc.nextFloat();
    }

    private static float askForHeight() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Heigth: (in kilograms)");
        return sc.nextFloat();
    }
}
