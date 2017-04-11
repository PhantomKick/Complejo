package ar.edu.unlam.complejo;

public class ListaDeComplejos {

	public static void main(String[] args) {

		OrdenadoraDeComplejos listaComplejos = new OrdenadoraDeComplejos();
		listaComplejos = new OrdenadoraDeComplejos();
		listaComplejos.agregarALista(new Complejo(3, -4));
		listaComplejos.agregarALista(new Complejo(2, 5));
		listaComplejos.agregarALista(new Complejo(1, 3));

		listaComplejos.mostrarListaComplejos();
		listaComplejos.mostrarListaPorReal();
		listaComplejos.mostrarListaPorImaginario();
		listaComplejos.mostrarListaPorModulo();
	}
}