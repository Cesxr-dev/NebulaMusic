package model;

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String txtPseudonimo;
    private String radGenero;
    private String selSuscripcion;
    private String fechaNacimiento;
    private String chkTerminos;
    private String comentarios;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario(String nombre, String correo, String contrasenia, String txtPseudonimo, String radGenero, String selSuscripcion, String fechaNacimiento, String chkTerminos, String comentarios) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.txtPseudonimo = txtPseudonimo;
        this.radGenero = radGenero;
        this.selSuscripcion = selSuscripcion;
        this.fechaNacimiento = fechaNacimiento;
        this.chkTerminos = chkTerminos;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getTxtPseudonimo() {
        return txtPseudonimo;
    }

    public void setTxtPseudonimo(String txtPseudonimo) {
        this.txtPseudonimo = txtPseudonimo;
    }

    public String getRadGenero() {
        return radGenero;
    }

    public void setRadGenero(String radGenero) {
        this.radGenero = radGenero;
    }

    public String getSelSuscripcion() {
        return selSuscripcion;
    }

    public void setSelSuscripcion(String selSuscripcion) {
        this.selSuscripcion = selSuscripcion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getChkTerminos() {
        return chkTerminos;
    }

    public void setChkTerminos(String chkTerminos) {
        this.chkTerminos = chkTerminos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
