package Quest4;

public class Quest4_post1 {

	    String texto, link; int numeroCurtidas, numeroCompartilhamentos;

	    public Quest4_post1(String texto, String link){

	        this.texto = texto;
	        this.link = link;
	    }

	    public void curtir(){
	        this.numeroCurtidas-=-1;
	    }

	    public void compartilhar(){
	        this.numeroCompartilhamentos-=-1;
	    }
	}
