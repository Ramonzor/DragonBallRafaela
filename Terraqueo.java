public class Terraqueo extends PersonagemDragonBall {
    String pais, cidade;

    public Terraqueo(String nome, double idade, String sexo, String poderEspecial, double temporada, double ki, String pais, String cidade) {
        super(nome, idade, sexo, poderEspecial, temporada, ki);
        this.pais = pais;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return super.toString() + " " + pais + " " + cidade;
    }

    @Override
    public void calcularPoder() {
        poderTotal = ki;
    }
}
