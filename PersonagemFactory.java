public class PersonagemFactory {
    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 33, "Masculino", "Destructo Disk", 1, 2000, "Terra", "Cidade do Oeste");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 37, "Masculino", "Kamehameha", 1, 10000, 5, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 23, "Masculino", "Masenko", 1, 8000, 3, false);
    }

    public static Namekuseijin criarDende() {
        return new Namekuseijin("Dendê", 25, "Masculino", "Cura", 1, 3000, 7, true);
    }
}