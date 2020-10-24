
/**
 *
 * @author Alumno
 */
public class ClassHijo extends ClassPadre {
    private String CodClassHijo;
    public ClassHijo(){
        super();
        this.CodClassHijo= "nn";
    }
    public ClassHijo (String nombre, String apellido, int edad, String CodClassHijo){
        super(nombre, apellido, edad);
        this.CodClassHijo= CodClassHijo;
    }
            
}

