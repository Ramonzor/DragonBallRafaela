public class Sayajin extends PersonagemDragonBall implements Transformavel {
    private int nivelMaximoSSJ;
    private boolean temRabo;

    public Sayajin(String nome, double idade, String sexo, String poderEspecial, double temporada, double ki, int nivelMaximoSSJ, boolean temRabo) {
        super(nome, idade, sexo, poderEspecial, temporada, ki);
        this.nivelMaximoSSJ = nivelMaximoSSJ;
        this.temRabo = temRabo;
    }

    @Override
    public void calcularPoder() {
        poderTotal = ki * (1 + nivelMaximoSSJ * 0.1);
    }

    @Override
    public String transformar(int nivel) {
        if ((nivel <= 3) || ((nivel == 4 || nivel == 5) && (nome.equals("Goku") || nome.equals("Vegeta")))) {
            return String.format("%s transformou para super sayajin nível %d", nome, nivel);
        } else {
            return "Não foi possível transformar esse sayajin";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " nivelMaximoSSJ:" + nivelMaximoSSJ + " temRabo:" + temRabo;
    }
}