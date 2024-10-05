package EX;

public class ex_2 {

	public static void main(String[] args) {
		interface Renderizador {
		    void renderizar(Forma forma);
		}

		abstract class Forma {
		    protected Renderizador renderizador;

		    public Forma(Renderizador renderizador) {
		        this.renderizador = renderizador;
		    }

		    public abstract void desenhar();
		}

		class Circulo extends Forma {
		    // ...
		    @Override
		    public void desenhar() {
		        renderizador.renderizar(this);
		    }
		}

		class RenderizadorTela implements Renderizador {
		    // Lógica para renderizar em tela
		}

		class RenderizadorImpressora implements Renderizador {
		    // Lógica para renderizar em impressora
		}

	}

}
