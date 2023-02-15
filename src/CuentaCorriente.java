public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia) {
        super(agencia);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public boolean retirar(double valor) {
        double comision = 0.2;
        return super.retirar(valor + comision);
    }
}
