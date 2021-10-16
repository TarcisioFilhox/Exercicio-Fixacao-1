package Quest3;

public class Quest3_lutador {

    int energia, forca; static int golpe; String nome;

    public Quest3_lutador(int energia, int forca, String nome) {

        this.energia = energia;
        this.forca = forca;
        this.nome = nome;
    }
    public void aplicarGolpe(Quest3_lutador num1){
        golpe = this.forca;
        num1.reduzirEnergia();
    }
    public void reduzirEnergia(){
       this.energia -= golpe;
    }
}
