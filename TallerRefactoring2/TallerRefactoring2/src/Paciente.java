public class Paciente extends Persona {

    static final int ES_ADULTO_MAYOR = 65;
    private HistorialMedico historialMedico;
    public Paciente(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
    }

    public boolean esAdultoMayor(){
        return getEdad()>= ES_ADULTO_MAYOR;
    }

    public HistorialMedico getHistorialMedico(){
        return this.historialMedico;
    }
}
