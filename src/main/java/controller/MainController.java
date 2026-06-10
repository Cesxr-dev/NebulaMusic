package controller;

import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UsuarioService;

@Controller
public class MainController {
    @Autowired
    private UsuarioService usuarioService;

    public MainController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping({"/index", "/index.html"})
    public String index(){
        return "index";
    }

    @GetMapping({"/", "/iniciar-sesion", "/iniciar-sesion.html"})
    public String iniciarSesion(){
        return "iniciar-sesion";
    }

    @GetMapping({"/registro", "/registro.html"})
    public String registro(){
        return "registro";
    }

    @PostMapping("/crear-cuenta")
    public String crearCuenta(@ModelAttribute Usuario usuario){
        usuarioService.registrar(usuario);
        return "redirect:/iniciar-sesion";
    }

    @PostMapping("/autenticacion")
    public String autenticacaion(@RequestParam("correo") String correo,
                                 @RequestParam("contrasenia") String contrasenia){
        if(usuarioService.autenticar(correo,contrasenia)){
            return "redirect:/index";
        }
        return "redirect:/error.html";
    }

    @GetMapping("/cerrar-sesion")
    public String cerrarSesion(){
        return "redirect:/inciar-seion?logout";
    }
}
