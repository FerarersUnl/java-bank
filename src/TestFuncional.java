public class TestFuncional {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Diego");
        gerente.setClave("Oscar");
        gerente.setDocumento("DHB8123");
        gerente.setSalario(2000);
        gerente.getBonificacion();
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("Oscar"));
    }
}
