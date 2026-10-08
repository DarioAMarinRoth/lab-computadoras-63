import teoria1.Contacto;
import teoria2.Persona;

void main() {

    // Clases
    // - Atributos: información que iban a contener los objetos.
    // - Métodos: acciones que pueden ejecutar los objetos.
    // ! Las clases a partir de las cuales creo objetos, no tienen método main. No se ejecuta


    // Empezar a usar objetos:

    // <NombreTuClase> <nombreVariable> = new <NombreTuClase>();

    Contacto miVariable = new Contacto();


    miVariable.telefono = "29915511111";
    miVariable.nombre = "Fulano";

    Contacto otroContacto = new Contacto();
    otroContacto.nombre = "Mengano";
    otroContacto.telefono = "29915511112";

    // Crear una clase que se llame "Persona" con los atributos:
    // - String: Nombre
    // - int: edad
    // - double: altura

    // En otro archivo con el método main crear dos objetos del tipo persona
    // y darle valores a sus atributos.




}