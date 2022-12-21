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


    public String calcularIMC(){
        float IMC = (pesoKg/(alturaM*alturaM)) ;

        return "";
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


}
