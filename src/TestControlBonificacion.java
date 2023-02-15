public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario oscar = new Contador();
        oscar.setSalario(2000);

        Funcionario lucila = new Gerente();
        lucila.setSalario(10000);

        Funcionario daniel = new Contador();
        daniel.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(oscar);
        controlBonificacion.registrarSalario(lucila);
        controlBonificacion.registrarSalario(daniel);
    }
}
