package ejercicioPersona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String DNI;
    private Sexo sexo;
    private float pesoKg;
    private float alturaM;


    // SEXO SERÁ NO POR DEFECTO
    public Persona(String nombre,String apellidos,int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = Sexo.NO;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, String apellidos, int edad, String DNI, Sexo sexo, float pesoKg, float alturaM) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.pesoKg = pesoKg;
        this.alturaM = alturaM;
    }


    public int calcularIMC(){
        float IMC = (pesoKg/(alturaM*alturaM)) ;
        int bajoPeso= -1, rangoNormal=0,sobrepeso=1,obeso=2;


        if (IMC<18.5) return bajoPeso;
        else if (IMC<25) return rangoNormal;
        else if (IMC<30) return sobrepeso;
        else return obeso;
    }

    public boolean esMayorDeEdad(){
        return (18>=edad);
    }

    protected String generaDNI(){
        String numeros = randomizarNumerosDNI();
        char letra = getLetraDNI(numeros);

        return numeros+letra;
    }

    private String randomizarNumerosDNI(){
        String numeros="";
        for (int i = 1; i <=8 ; i++) {
            numeros += (int) (Math.random()* 9);
        }
        return numeros;
    }
    protected static char getLetraDNI(String dni) {
        char[] letters = new char[23];
        int intDNI = Integer.parseInt(dni);

        letters[0]='T';letters[1]='R';letters[2]='W';letters[3]='A';letters[4]='G';
        letters[5]='M';letters[6]='Y';letters[7]='F';letters[8]='P';letters[9]='D';
        letters[10]='X';letters[11]='B';letters[12]='N';letters[13]='J';letters[14]='Z';
        letters[15]='S';letters[16]='Q';letters[17]='V';letters[18]='H';letters[19]='L';
        letters[20]='C';letters[21]='K';letters[22]='E';

        int position = intDNI % 23;

        return letters[position];

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDNI() {
        return DNI;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public float getAlturaM() {
        return alturaM;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' + ", apellidos='" + apellidos + '\'' + ", edad=" + edad +
                ", DNI='" + DNI + '\'' + ", sexo=" + sexo + ", pesoKg=" + pesoKg +
                ", alturaM=" + alturaM;
    }
}
