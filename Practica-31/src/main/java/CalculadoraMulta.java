public class CalculadoraMulta {
    // DIAGRAMA DE SECUENCIA
    public Multa calcularMulta(Prestamo prestamo){
        if(prestamo.estaRetrasado()){
            if(this.chequearMultaMasGrande(prestamo)){
                Multa multa = new Multa(prestamo.calcularDiasMulta());
                prestamo.getLector().serMultado(multa);
                return multa;
            }
        }
        return prestamo.getLector().getMultaActual();
    }

    public boolean chequearMultaMasGrande(Prestamo prestamo){
        return prestamo.getLector().getMultaActual().getDiasRestantes() < prestamo.calcularDiasMulta();
    }
    // DIAGRAMA DE SECUENCIA
}
