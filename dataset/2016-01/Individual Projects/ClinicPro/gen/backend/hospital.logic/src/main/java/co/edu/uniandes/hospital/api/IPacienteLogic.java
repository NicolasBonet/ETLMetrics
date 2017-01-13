package co.edu.uniandes.hospital.api;

import co.edu.uniandes.hospital.entities.PacienteEntity;
import co.edu.uniandes.hospital.exceptions.BusinessLogicException;
import java.util.List;

public interface IPacienteLogic {

    public List<PacienteEntity> getPacientes();

    public PacienteEntity getPaciente(Long id) ;
   
    public PacienteEntity getPacienteByPK(Long documento) ;
 
    public PacienteEntity createPaciente(PacienteEntity entity);

    public PacienteEntity updatePaciente(PacienteEntity entity);

    public void deletePaciente(Long id);
}
