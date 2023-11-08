public class main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produzir(1, "A").produzir();
        builder.produzir(1, "B").produzir();
        builder.produzir(1, "C").produzir();
        builder.produzir(1, "D").produzir();
        builder.produzir(2, "A").produzir();
        builder.produzir(2, "B").produzir();
        builder.produzir(2, "C").produzir();
        builder.produzir(2, "D").produzir();
    }
}
