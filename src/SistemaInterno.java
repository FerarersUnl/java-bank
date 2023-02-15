public class SistemaInterno {
    private String clave= "Hola";
    public boolean autenticar(Gerente gerente) {
        boolean puedeInicarSeson = gerente.iniciarSesion(clave);
        if (puedeInicarSeson) {
            System.out.println("Login exitoso");
            return true;
        }
        else {
            System.out.println("Error en login");
            return false;
        }
    }
}
