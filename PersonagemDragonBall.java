public abstract class PersonagemDragonBall {
    protected String nome, sexo, poderEspecial;
    protected double idade, temporada, ki, poderTotal;

    public PersonagemDragonBall(String nome, double idade, String sexo, String poderEspecial, double temporada, double ki) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.temporada = temporada;
        this.ki = ki;
        this.poderEspecial = poderEspecial;
        this.poderTotal = 0;
    }

    public abstract void calcularPoder();

    @Override
    public String toString() {
        return String.format("Nome:%s Idade:%.1f Sexo:%s poderEspecial:%s temporada:%.1f ki:%.2f poderTotal:%.2f",
                nome, idade, sexo, poderEspecial, temporada, ki, poderTotal);
    }
}
