package EX;

import java.util.ArrayList;
import java.util.List;

public class ex_3 {

	public static void main(String[] args) {
		interface Graphic {
		    void draw();
		}

		class Dot implements Graphic {
		    // ...
		    public void draw() {
		        // Desenhar um ponto
		    }
		}

		class CompositeGraphic implements Graphic {
		    private List<Graphic> children = new ArrayList<>();

		    public void add(Graphic graphic) {
		        children.add(graphic);
		    }

		    public void draw() {
		        for (Graphic child : children) {
		            child.draw();
		        }
		    }
		}

	}

}
