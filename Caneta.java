public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampado;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampado);
    }

    void rabiscar(){
        if(this.tampado == true){
            System.out.println("Erro! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void tampar(){
        this.tampado = true;
    }

    void destampar(){
        this.tampado = false;
    }

}