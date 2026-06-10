package service;

import model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Service
public class UsuarioService {

    //Simulacion de bd
    private final Map<String, Usuario> usuarios = new ConcurrentHashMap<>();

    public UsuarioService(){

    }

    /**
     * Registra nuevo usuario en la lista de memoria
     * @param usuario
     */
    public void registrar(Usuario usuario){
        //Almacenamos la contrasenia en un texto plano para simplificar practica
        usuarios.put(usuario.getCorreo(),usuario);
    }

    /**
     * Verifica si un correo ya esta registrado.
     * @param correo
     * @return true si existe ese correo, false en caso contrario.
     */
    public boolean existeCorreo(String correo){
        return usuarios.containsKey(correo);
    }

    /**
     * Realiza una autenticacion basica en memoria comparando contrasenias en txt plano.
     * @param correo
     * @param contrasenia
     * @return true si las credenciales coinciden, de lo contrario false.
     */
    public boolean autenticar(String correo, String contrasenia){
        Usuario usuario = usuarios.get(correo);
        return usuario != null && usuario.getContrasenia().equals(contrasenia);
    }





}
