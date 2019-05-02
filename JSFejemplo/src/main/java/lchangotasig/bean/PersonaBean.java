package lchangotasig.bean;

import lchangotasig.entidad.Persona;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped

public class PersonaBean {
    private Persona persona = new Persona();
    private List<Persona> personas = new ArrayList<>();

    public void adicionar(){
        getPersonas().add(getPersona());
        setPersona(new Persona());
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
