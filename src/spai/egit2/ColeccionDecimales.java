package spai.egit2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDecimales {
	private List<Double> coleccion;

	public ColeccionDecimales(double[] coleccion) {
		this.coleccion = new ArrayList<Double>();
		for (double item : coleccion) {
			this.coleccion.add(item);
		}
	}

	public ColeccionDecimales() {
		this(new double[0]);
	}

	public Double suma() {
		double suma = 0;
		for (double item : this.coleccion) {
			suma += item;
		}
		return suma;
	}

	public double mayor() {
		double mayor = Double.NEGATIVE_INFINITY;
		for (double item : this.coleccion) {
			if (item > mayor)
				mayor = item;
		}
		return mayor;
	}

	public double menor() {
		double menor = Double.POSITIVE_INFINITY;
		for (double item : this.coleccion) {
			if (item < menor)
				menor = item;
		}
		return menor;
	}

	public double resta() {
		double resta = this.coleccion.get(0);
		for (int i = 1; i < this.coleccion.size(); i++) {
			resta -= this.coleccion.get(i);
		}
		return resta;
	}

	public double size() {
		return this.coleccion.size();
	}

	public double media() {
		return this.suma() / this.size();
	}

}
