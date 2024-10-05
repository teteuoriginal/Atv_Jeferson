package EX;

public class ex_1 {

	public static void main(String[] args) {
		interface Forma3D {
		    double calcularVolume();
		}

		class FormaGeometrica {
		    double calcularArea() {
				return 0;
			}
		    double calcularPerimetro() {
				return 0;
			}
		}

		class AdapterForma3D implements Forma3D {
		    private FormaGeometrica formaGeometrica;

		    public AdapterForma3D(FormaGeometrica formaGeometrica) {
		        this.formaGeometrica = formaGeometrica;
		    }

		    @Override
		    public double calcularVolume() {
		        // Lógica para calcular o volume baseado na área da forma 2D
		        // (simplificado para fins de exemplo)
		        return formaGeometrica.calcularArea() * 10; // Assumindo uma altura padrão
		    }
		}

	}

}
