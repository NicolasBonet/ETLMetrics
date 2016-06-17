namespace ApiMultiplataforma.Models
{
    public class CiudadDTO
    {
        public int Id { get; set; }
        public string Nombre { get; set; }
    }
}
using System.ComponentModel.DataAnnotations;
using ApiMultiplataforma.Filters;

namespace ApiMultiplataforma.Models
{
    public class EstudianteDTO
    {
        public enum SexoEnum { Mujer, Hombre }

        [Hide]
        public int Id { get; set; }

        public string Nombre { get; set; }

        [Textbox(Required = false)]
        public string Apellido { get; set; }

        // Si nos alcanza el tiempo implementamos controles de tipo fecha
        //public Datetime FechaNacimiento { get; set; }
        
        public SexoEnum Sexo { get; set; }

        [Combobox(Clase = "CiudadesController", Metodo = "ObtenerTodos")]
        public CiudadDTO Ciudad { get; set; }

        [Textbox(Type = "Email", Required = false)]
        public string Correo { get; set; }

        [Textbox(Placeholder = "No debe contener espacios")]
        public string Usuario { get; set; }

        [Textbox(Type = "Password")]
        public string Contrasenia { get; set; }

        [Textarea]
        [Display(Name = "Acerca de mi")]
        public string AcercaDeMi { get; set; }

        [Textarea(Rows = "10", Required = false)]
        [Display(Name = "¿Por qué estudiar en los Andes?")]
        public string Razon { get; set; }

        [Display(Name = "¿Desea recibir correo elecrónico?")]
        public bool RecibirCorreo { get; set; }
    }
}
using System.Collections.Generic;
using System.Web.Http;
using ApiMultiplataforma.Core;
using ApiMultiplataforma.Filters;
using ApiMultiplataforma.Models;

namespace ApiMultiplataforma.Controllers
{
    [Domain("http://192.168.0.6:51792/")]
    [RoutePrefix("api/Ciudades")]
    public class CiudadesController : ApiController
    {
        private readonly CiudadesCore _ciudadesCore;

        public CiudadesController()
        {
            _ciudadesCore = new CiudadesCore();
        }

        [HttpGet]
        [Route("ObtenerTodos")]
        public IEnumerable<CiudadDTO> ObtenerTodos()
        {
            return _ciudadesCore.ObtenerTodos();
        }
    }
}
using System;
using System.Web.Http;
using ApiMultiplataforma.Core;
using ApiMultiplataforma.Filters;
using ApiMultiplataforma.Models;

namespace ApiMultiplataforma.Controllers
{
    [Domain("http://192.168.0.6:51792/")]
    [RoutePrefix("api/Estudiantes")]
    [Main]
    public class EstudiantesController : ApiController
    {
        private readonly EstudiantesCore _estudiantesCore;

        public EstudiantesController()
        {
            _estudiantesCore = new EstudiantesCore();
        }

        [HttpGet]
        [Route("ObtenerPorId")]
        public EstudianteDTO ObtenerPorId(int id)
        {
            return _estudiantesCore.ObtenerPorId(id);
        }

        [HttpPost]
        [Route("Crear")]
        [ViewType("Create")]
        [Title("Crear estudiante")]
        public IHttpActionResult Crear([FromBody] EstudianteDTO estudianteDTO)
        {
            try
            {
                _estudiantesCore.Crear(estudianteDTO);
                return Ok();
            }
            
            catch (Exception e)
            {
                return BadRequest(e.Message);
            }
        }

        [HttpPut]
        [Route("Actualizar")]
        [ViewType("Update")]
        [GetId("ObtenerPorId")]
        [Title("Actualizar estudiante")]
        public IHttpActionResult Actualizar([FromBody] EstudianteDTO estudianteDTO)
        {
            try
            {
                _estudiantesCore.Actualizar(estudianteDTO);
                return Ok();
            }
            catch (Exception e)
            {
                return BadRequest(e.Message);
            }
        }
    }
}
