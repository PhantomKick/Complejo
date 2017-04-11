package ar.edu.unlam.complejo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class OrdenadoraDeComplejos {

	private List<Complejo> listaComplejos = new ArrayList<Complejo>();
	private List<Complejo> ordenReal;
	private List<Complejo> ordenImaginario;
	private List<Complejo> ordenModulo;

	/**
	 * Agrega un complejo a una lista de complejos. <br>
	 * 
	 * @param complejo
	 */
	public void agregarALista(Complejo complejo) {
		listaComplejos.add(complejo);
	}

	/**
	 * Muestra la lista de complejos. <br>
	 */
	public void mostrarListaComplejos() {
		Integer posicion = 1;
		System.out.println("Lista de complejos:");
		for (ListIterator<Complejo> listIterator = this.listaComplejos.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			System.out.println("Complejo " + posicion + ":" + actual);
			posicion++;
		}
	}

	/**
	 * Muestra la lista ordenada por la parte real. <br>
	 */
	public void mostrarListaPorReal() {
		System.out.println("Lista de complejos ordenadas por el número real:");
		this.ordenReal = new LinkedList<Complejo>();
		for (ListIterator<Complejo> listIterator = this.listaComplejos.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			this.ordenReal.add(actual);
		}

		this.ordenReal.sort(new Comparator<Complejo>() {
			@Override
			public int compare(Complejo obj1, Complejo obj2) {
				if (obj1.getReal() > obj2.getReal()) {
					return 1;
				}
				if (obj1.getReal() < obj2.getReal()) {
					return -1;
				}
				return 0;
			}
		});

		Integer posicion = 1;
		for (ListIterator<Complejo> listIterator = this.ordenReal.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			System.out.println("Complejo " + posicion + ": " + actual);
			posicion++;
		}
	}

	/**
	 * Muestra la lista ordenada por la parte imaginaria. <br>
	 */
	public void mostrarListaPorImaginario() {
		System.out.println("Lista de complejos ordenadas por el número imaginario:");
		this.ordenImaginario = new LinkedList<Complejo>();
		for (ListIterator<Complejo> listIterator = this.listaComplejos.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			this.ordenImaginario.add(actual);
		}

		this.ordenImaginario.sort(new Comparator<Complejo>() {
			@Override
			public int compare(Complejo obj1, Complejo obj2) {
				if (obj1.getImaginario() > obj2.getImaginario()) {
					return 1;
				}
				if (obj1.getImaginario() < obj2.getImaginario()) {
					return -1;
				}
				return 0;
			}
		});

		Integer posicion = 1;
		for (ListIterator<Complejo> listIterator = this.ordenImaginario.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			System.out.println("Complejo " + posicion + ": " + actual);
			posicion++;
		}
	}

	/**
	 * Muestra la lista ordenada por el módulo. <br>
	 */
	public void mostrarListaPorModulo() {
		System.out.println("Lista de complejos ordenadas por módulo:");
		this.ordenModulo = new LinkedList<Complejo>();
		for (ListIterator<Complejo> listIterator = this.listaComplejos.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			this.ordenModulo.add(actual);
		}

		this.ordenModulo.sort(new Comparator<Complejo>() {
			@Override
			public int compare(Complejo obj1, Complejo obj2) {
				if (obj1.modulo() > obj2.modulo()) {
					return 1;
				}
				if (obj1.modulo() < obj2.modulo()) {
					return -1;
				}
				return 0;
			}
		});

		Integer posicion = 1;
		for (ListIterator<Complejo> listIterator = this.ordenModulo.listIterator(); listIterator.hasNext();) {
			Complejo actual = listIterator.next();
			System.out.println("Complejo " + posicion + ": " + actual + "\tMódulo: " + actual.modulo());
			posicion++;
		}
	}
}
