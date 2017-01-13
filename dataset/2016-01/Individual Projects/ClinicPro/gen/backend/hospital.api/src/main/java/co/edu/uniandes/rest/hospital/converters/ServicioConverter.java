package co.edu.uniandes.rest.hospital.converters;

import co.edu.uniandes.rest.hospital.dtos.ServicioDTO;
import co.edu.uniandes.hospital.entities.ServicioEntity;
import java.util.ArrayList;
import java.util.List;

public abstract class ServicioConverter {

    /**
     * Constructor privado para evitar la creación del constructor implícito de Java
     * @generated
     */
    private ServicioConverter() {
    }

    /**
     * Realiza la conversión de ServicioEntity a ServicioDTO.
     * Se invoca cuando otra entidad tiene una referencia a ServicioEntity.
     * Entrega únicamente los atributos proprios de la entidad.
     *
     * @param entity instancia de ServicioEntity a convertir
     * @return instancia de ServicioDTO con los datos recibidos por parámetro
     * @generated
     */
    public static ServicioDTO refEntity2DTO(ServicioEntity entity) {
        if (entity != null) {
            ServicioDTO dto = new ServicioDTO();
            dto.setId(entity.getId());
            dto.setCodigo(entity.getCodigo());
            dto.setNombre(entity.getNombre());
            dto.setPrecio(entity.getPrecio());
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Realiza la conversión de ServicioDTO a ServicioEntity Se invoca cuando otro DTO
     * tiene una referencia a ServicioDTO Convierte únicamente el ID ya que es el
     * único atributo necesario para guardar la relación en la base de datos
     *
     * @param dto instancia de ServicioDTO a convertir
     * @return instancia de ServicioEntity con los datos recibidos por parámetro
     * @generated
     */
    public static ServicioEntity refDTO2Entity(ServicioDTO dto) {
        if (dto != null) {
            ServicioEntity entity = new ServicioEntity();
            entity.setId(dto.getId());

            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de ServicioEntity a ServicioDTO Se invoca cuando se desea
     * consultar la entidad y sus relaciones muchos a uno o uno a uno
     *
     * @param entity instancia de ServicioEntity a convertir
     * @return Instancia de ServicioDTO con los datos recibidos por parámetro
     * @generated
     */
    private static ServicioDTO basicEntity2DTO(ServicioEntity entity) {
        if (entity != null) {
            ServicioDTO dto = new ServicioDTO();
            dto.setId(entity.getId());
            dto.setCodigo(entity.getCodigo());
            dto.setNombre(entity.getNombre());
            dto.setPrecio(entity.getPrecio());
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de ServicioDTO a ServicioEntity Se invoca cuando se
     * necesita convertir una instancia de ServicioDTO con los atributos propios de
     * la entidad y con las relaciones uno a uno o muchos a uno
     *
     * @param dto instancia de ServicioDTO a convertir
     * @return Instancia de ServicioEntity creada a partir de los datos de dto
     * @generated
     */
    private static ServicioEntity basicDTO2Entity(ServicioDTO dto) {
        if (dto != null) {
            ServicioEntity entity = new ServicioEntity();
           // entity.setId(dto.getId());
            entity.setCodigo(dto.getCodigo());
            entity.setNombre(dto.getNombre());
            entity.setPrecio(dto.getPrecio());
    
            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte instancias de ServicioEntity a ServicioDTO incluyendo sus relaciones
     * Uno a muchos y Muchos a muchos
     *
     * @param entity Instancia de ServicioEntity a convertir
     * @return Instancia de ServicioDTO con los datos recibidos por parámetro
     * @generated
     */
    public static ServicioDTO fullEntity2DTO(ServicioEntity entity) {
        if (entity != null) {
            ServicioDTO dto = basicEntity2DTO(entity);
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de ServicioDTO a ServicioEntity.
     * Incluye todos los atributos de ServicioEntity.
     *
     * @param dto Instancia de ServicioDTO a convertir
     * @return Instancia de ServicioEntity con los datos recibidos por parámetro
     * @generated
     */
    public static ServicioEntity fullDTO2Entity(ServicioDTO dto) {
        if (dto != null) {
            ServicioEntity entity = basicDTO2Entity(dto);
            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte una colección de instancias de ServicioEntity a ServicioDTO. Para cada
     * instancia de ServicioEntity en la lista, invoca basicEntity2DTO y añade el
     * nuevo ServicioDTO a una nueva lista
     *
     * @param entities Colección de entidades a convertir
     * @return Collección de instancias de ServicioDTO
     * @generated
     */
    public static List<ServicioDTO> listEntity2DTO(List<ServicioEntity> entities) {
        List<ServicioDTO> dtos = new ArrayList<ServicioDTO>();
        if (entities != null) {
            for (ServicioEntity entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    /**
     * Convierte una colección de instancias de ServicioDTO a instancias de
     * ServicioEntity Para cada instancia se invoca el método basicDTO2Entity
     *
     * @param dtos entities Colección de ServicioDTO a convertir
     * @return Collección de instancias de ServicioEntity
     * @generated
     */
    public static List<ServicioEntity> listDTO2Entity(List<ServicioDTO> dtos) {
        List<ServicioEntity> entities = new ArrayList<ServicioEntity>();
        if (dtos != null) {
            for (ServicioDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }
}
