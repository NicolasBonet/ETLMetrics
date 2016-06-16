package co.edu.uniandes.rest.hospital.converters;

import co.edu.uniandes.rest.hospital.dtos.PacienteDTO;
import co.edu.uniandes.hospital.entities.PacienteEntity;
import java.util.ArrayList;
import java.util.List;

public abstract class PacienteConverter {

    /**
     * Constructor privado para evitar la creación del constructor implícito de Java
     * @generated
     */
    private PacienteConverter() {
    }

    /**
     * Realiza la conversión de PacienteEntity a PacienteDTO.
     * Se invoca cuando otra entidad tiene una referencia a PacienteEntity.
     * Entrega únicamente los atributos proprios de la entidad.
     *
     * @param entity instancia de PacienteEntity a convertir
     * @return instancia de PacienteDTO con los datos recibidos por parámetro
     * @generated
     */
    public static PacienteDTO refEntity2DTO(PacienteEntity entity) {
        if (entity != null) {
            PacienteDTO dto = new PacienteDTO();
            dto.setId(entity.getId());
            dto.setDocumento(entity.getDocumento());
            dto.setNombres(entity.getNombres());
            dto.setApellidos(entity.getApellidos());
            dto.setDireccion(entity.getDireccion());
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Realiza la conversión de PacienteDTO a PacienteEntity Se invoca cuando otro DTO
     * tiene una referencia a PacienteDTO Convierte únicamente el ID ya que es el
     * único atributo necesario para guardar la relación en la base de datos
     *
     * @param dto instancia de PacienteDTO a convertir
     * @return instancia de PacienteEntity con los datos recibidos por parámetro
     * @generated
     */
    public static PacienteEntity refDTO2Entity(PacienteDTO dto) {
        if (dto != null) {
            PacienteEntity entity = new PacienteEntity();
            entity.setId(dto.getId());

            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de PacienteEntity a PacienteDTO Se invoca cuando se desea
     * consultar la entidad y sus relaciones muchos a uno o uno a uno
     *
     * @param entity instancia de PacienteEntity a convertir
     * @return Instancia de PacienteDTO con los datos recibidos por parámetro
     * @generated
     */
    private static PacienteDTO basicEntity2DTO(PacienteEntity entity) {
        if (entity != null) {
            PacienteDTO dto = new PacienteDTO();
            dto.setId(entity.getId());
            dto.setDocumento(entity.getDocumento());
            dto.setNombres(entity.getNombres());
            dto.setApellidos(entity.getApellidos());
            dto.setDireccion(entity.getDireccion());
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de PacienteDTO a PacienteEntity Se invoca cuando se
     * necesita convertir una instancia de PacienteDTO con los atributos propios de
     * la entidad y con las relaciones uno a uno o muchos a uno
     *
     * @param dto instancia de PacienteDTO a convertir
     * @return Instancia de PacienteEntity creada a partir de los datos de dto
     * @generated
     */
    private static PacienteEntity basicDTO2Entity(PacienteDTO dto) {
        if (dto != null) {
            PacienteEntity entity = new PacienteEntity();
           // entity.setId(dto.getId());
            entity.setDocumento(dto.getDocumento());
            entity.setNombres(dto.getNombres());
            entity.setApellidos(dto.getApellidos());
            entity.setDireccion(dto.getDireccion());
    
            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte instancias de PacienteEntity a PacienteDTO incluyendo sus relaciones
     * Uno a muchos y Muchos a muchos
     *
     * @param entity Instancia de PacienteEntity a convertir
     * @return Instancia de PacienteDTO con los datos recibidos por parámetro
     * @generated
     */
    public static PacienteDTO fullEntity2DTO(PacienteEntity entity) {
        if (entity != null) {
            PacienteDTO dto = basicEntity2DTO(entity);
            return dto;
        } else {
            return null;
        }
    }

    /**
     * Convierte una instancia de PacienteDTO a PacienteEntity.
     * Incluye todos los atributos de PacienteEntity.
     *
     * @param dto Instancia de PacienteDTO a convertir
     * @return Instancia de PacienteEntity con los datos recibidos por parámetro
     * @generated
     */
    public static PacienteEntity fullDTO2Entity(PacienteDTO dto) {
        if (dto != null) {
            PacienteEntity entity = basicDTO2Entity(dto);
            return entity;
        } else {
            return null;
        }
    }

    /**
     * Convierte una colección de instancias de PacienteEntity a PacienteDTO. Para cada
     * instancia de PacienteEntity en la lista, invoca basicEntity2DTO y añade el
     * nuevo PacienteDTO a una nueva lista
     *
     * @param entities Colección de entidades a convertir
     * @return Collección de instancias de PacienteDTO
     * @generated
     */
    public static List<PacienteDTO> listEntity2DTO(List<PacienteEntity> entities) {
        List<PacienteDTO> dtos = new ArrayList<PacienteDTO>();
        if (entities != null) {
            for (PacienteEntity entity : entities) {
                dtos.add(basicEntity2DTO(entity));
            }
        }
        return dtos;
    }

    /**
     * Convierte una colección de instancias de PacienteDTO a instancias de
     * PacienteEntity Para cada instancia se invoca el método basicDTO2Entity
     *
     * @param dtos entities Colección de PacienteDTO a convertir
     * @return Collección de instancias de PacienteEntity
     * @generated
     */
    public static List<PacienteEntity> listDTO2Entity(List<PacienteDTO> dtos) {
        List<PacienteEntity> entities = new ArrayList<PacienteEntity>();
        if (dtos != null) {
            for (PacienteDTO dto : dtos) {
                entities.add(basicDTO2Entity(dto));
            }
        }
        return entities;
    }
}
