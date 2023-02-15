public class TestReferencias {
    public static void main(String[] args) {
        // El elemento más genérico puede ser adaptado
        // al elemento más específico
        Funcionario funcionario = new Contador();
        funcionario.setNombre("Oscar");

        Gerente gerente = new Gerente();
        gerente.setNombre("Ivan");

        funcionario.setSalario(2000);
        gerente.setSalario(5000);
    }
}
