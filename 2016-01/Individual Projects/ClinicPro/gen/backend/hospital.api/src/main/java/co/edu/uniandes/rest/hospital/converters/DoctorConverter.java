package co.edu.uniandes.rest.hospital.converters;

import co.edu.uniandes.rest.hospital.dtos.DoctorDTO;
import co.edu.uniandes.hospital.entities.DoctorEntity;
import java.util.ArrayList;
import java.util.List;

public abstract class DoctorConverter {

    /**
     * Constructor privado para evitar la creación del constructor implícito de Java
     * @generated
     */
    private DoctorConverter() {
    }

    /**
     * Realiza la conversión de DoctorEntity a DoctorDTO.
     * Se invoca cuando otra entidad tiene una referencia a DoctorEntity.
     * Entrega únicamente los atributos proprios de la entidad.
     *
     * @param entity instancia de DoctorEntity a convertir
     * @return instancia de DoctorDTO con los datos recibidos por parámetro
     * @generated
     */
    public static DoctorDTO refEntity2DTO(DoctorEntity entity) {
        if (entity != null) {
            DoctorDTO dto = new DoctorDTO();
            dto.setId(entity.getId());
            dto.setCedula(entity.getCedula());
            dto.setDoctor(entity.getDoctor());
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Realiza la conversión de DoctorDTO a DoctorEntity Se invoca cuando otro DTO
     * tiene una referencia a DoctorDTO Convierte únicamente el ID ya que es el
     * único atributo necesario para guardar la relación en la base de datos
     *
     * @param dto instancia de DoctorDTO a convertir
     * @return instancia de DoctorEntity con los datos recibidos por parámetro
     * @generated
     */
    public static DoctorEntity refDTO2Entity(DoctorDTO dto) {
        if (dto != null) {
            DoctorEntity entity = new DoctorEntity();
            entity.setId(dto.getId());

            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de DoctorEntity a DoctorDTO Se invoca cuando se desea
     * consultar la entidad y sus relaciones muchos a uno o uno a uno
     *
     * @param entity instancia de DoctorEntity a convertir
     * @return Instancia de DoctorDTO con los datos recibidos por parámetro
     * @generated
     */
    private static DoctorDTO basicEntity2DTO(DoctorEntity entity) {
        if (entity != null) {
            DoctorDTO dto = new DoctorDTO();
            dto.setId(entity.getId());
            dto.setCedula(entity.getCedula());
            dto.setDoctor(entity.getDoctor());
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de DoctorDTO a DoctorEntity Se invoca cuando se
     * necesita convertir una instancia de DoctorDTO con los atributos propios de
     * la entidad y con las relaciones uno a uno o muchos a uno
     *
     * @param dto instancia de DoctorDTO a convertir
     * @return Instancia de DoctorEntity creada a partir de los datos de dto
     * @generated
     */
    private static DoctorEntity basicDTO2Entity(DoctorDTO dto) {
        if (dto != null) {
            DoctorEntity entity = new DoctorEntity();
           // entity.setId(dto.getId());
            entity.setCedula(dto.getCedula());
            entity.setDoctor(dto.getDoctor());
    
            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte instancias de DoctorEntity a DoctorDTO incluyendo sus relaciones
     * Uno a muchos y Muchos a muchos
     *
     * @param entity Instancia de DoctorEntity a convertir
     * @return Instancia de DoctorDTO con los datos recibidos por parámetro
     * @generated
     */
    public static DoctorDTO fullEntity2DTO(DoctorEntity entity) {
        if (entity != null) {
            DoctorDTO dto = basicEntity2DTO(entity);
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de DoctorDTO a DoctorEntity.
     * Incluye todos los atributos de DoctorEntity.
     *
     * @param dto Instancia de DoctorDTO a convertir
     * @return Instancia de DoctorEntity con los datos recibidos por parámetro
     * @generated
     */
    public static DoctorEntity fullDTO2Entity(DoctorDTO dto) {
        if (dto != null) {
            DoctorEntity entity = basicDTO2Entity(dto);
            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte una colección de instancias de DoctorEntity a DoctorDTO. Para cada
     * instancia de DoctorEntity en la lista, invoca basicEntity2DTO y añade el
     * nuevo DoctorDTO a una nueva lista
     *
     * @param entities Colección de entidades a convertir
     * @return Collección de instancias de DoctorDTO
     * @generated
     */
    public static List<DoctorDTO> listEntity2DTO(List<DoctorEntity> entities) {
        List<DoctorDTO> dtos = new ArrayList<DoctorDTO>();
        if (entities != null) {
            for (DoctorEntity entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    /**
     * Convierte una colección de instancias de DoctorDTO a instancias de
     * DoctorEntity Para cada instancia se invoca el método basicDTO2Entity
     *
     * @param dtos entities Colección de DoctorDTO a convertir
     * @return Collección de instancias de DoctorEntity
     * @generated
     */
    public static List<DoctorEntity> listDTO2Entity(List<DoctorDTO> dtos) {
        List<DoctorEntity> entities = new ArrayList<DoctorEntity>();
        if (dtos != null) {
            for (DoctorDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }
}
