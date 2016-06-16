package co.edu.uniandes.hospital.api;

import co.edu.uniandes.hospital.entities.ServicioEntity;
import co.edu.uniandes.hospital.exceptions.BusinessLogicException;
import java.util.List;

public interface IServicioLogic {

    public List<ServicioEntity> getServicios();

    public ServicioEntity getServicio(Long id) ;
   
    public ServicioEntity getServicioByPK(String codigo) ;
 
    public ServicioEntity createServicio(ServicioEntity entity);

    public ServicioEntity updateServicio(ServicioEntity entity);

    public void deleteServicio(Long id);
}
