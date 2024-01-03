import java.util.ArrayList;
import java.util.List;

public class SistemaAtencionMedico {

    static final double DESCUENTO_ADULTOS_MAYORES = 0.25;
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }

    public void agendarConsulta(Paciente paciente, Consulta consulta){
        double costoConsulta = consulta.getServicioMedico().getCosto();
        int edadPaciente = paciente.getEdad();
        costoConsulta = calcularValorFinalConsulta(costoConsulta,edadPaciente);
        System.out.println("Se han cobrado "+ costoConsulta+ " dolares de su tarjeta de credito");
        paciente.getHistorialMedico.addConsulta(consulta); //Hacer esto es incorrecto
    }

    
    public double calcularValorFinalConsulta(ServicioMedico servicioMedico, Paciente paciente){
        double valorARestar = 0;
        if(paciente.getEdad()>= Paciente.ES_ADULTO_MAYOR){
            valorARestar = servicioMedico.getCosto().get*DESCUENTO_ADULTOS_MAYORES; //0.25 es el descuento para adultos mayores
        }
        return costoConsulta-valorARestar;
    }
    
    public T obtenerElementoPorNombre(String nombre, List<T> listaParametro){
        for(T elemento : listaParametro){
            if(elemento instanceof ServicioMedico){
                if(((ServicioMedico) elemento).getNombre().equals(nombre)){
                    return elemento;
                }
            }else{
                if(((Persona) elemento).getNombre().equals(nombre)){
                    return elemento:
                }
            }
        }
        return null;
    }

   
}
