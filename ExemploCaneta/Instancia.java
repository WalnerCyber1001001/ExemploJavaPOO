public class Instancia {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.tampado = false;
        c1.destampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
}
