public class Namekuseijin extends PersonagemDragonBall {
    private int quantidadeEsferas;
    private boolean podeCurar;

    public Namekuseijin(String nome, double idade, String sexo, String poderEspecial, double temporada, double ki, int quantidadeEsferas, boolean podeCurar) {
        super(nome, idade, sexo, poderEspecial, temporada, ki);
        this.quantidadeEsferas = quantidadeEsferas;
        this.podeCurar = podeCurar;
    }

    @Override
    public void calcularPoder() {
        poderTotal = ki * (1 + (podeCurar ? 0.2 : 0));
    }

    @Override
    public String toString() {
        return super.toString() + " quantidadeEsferas:" + quantidadeEsferas + " podeCurar:" + podeCurar;
    }

    public String fazerDesejo(String desejo) {
        if (quantidadeEsferas >= 7) {
            return "Desejo transformado em Namekusei: " + desejo.replace("a", "aa").replace("e", "ee").replace("i", "ii").replace("o", "oo").replace("u", "uu");
        } else {
            return "Não há esferas do dragão suficientes para fazer um desejo.";
        }
    }

    public void setQuantidadeEsferas(int quantidadeEsferas) {
        this.quantidadeEsferas = quantidadeEsferas;
    }
}