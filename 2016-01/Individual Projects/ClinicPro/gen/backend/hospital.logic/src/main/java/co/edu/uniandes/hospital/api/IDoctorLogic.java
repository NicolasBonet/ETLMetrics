package co.edu.uniandes.hospital.api;

import co.edu.uniandes.hospital.entities.DoctorEntity;
import co.edu.uniandes.hospital.exceptions.BusinessLogicException;
import java.util.List;

public interface IDoctorLogic {

    public List<DoctorEntity> getDoctors();

    public DoctorEntity getDoctor(Long id) ;
   
    public DoctorEntity getDoctorByPK(Long cedula) ;
 
    public DoctorEntity createDoctor(DoctorEntity entity);

    public DoctorEntity updateDoctor(DoctorEntity entity);

    public void deleteDoctor(Long id);
}
