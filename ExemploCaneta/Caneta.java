public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampado;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampado);
    }

    public void rabiscar(){
        if(this.tampado == true){
            System.out.println("Erro! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar(){
        this.tampado = true;
    }

    protected void destampar(){
        this.tampado = false;
    }

}