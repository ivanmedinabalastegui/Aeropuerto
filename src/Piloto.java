public class Piloto {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private int edad;

    public Piloto(String nombre, String apellido1, String apellido2, String dni, int edad){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return "\nNombre: " + getNombre() + " " + getApellido1() + " " + getApellido2()
                + "\nDNI: " + getDni() + "\nEdad: " + getEdad();
    }
}
