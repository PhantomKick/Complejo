package ar.edu.unlam.complejo;

public class Complejo {

	private Integer real;
	private Integer imaginario;

	public Complejo(int real, int imaginario) { 
		this.real = real; 
		this.imaginario = imaginario;
	}

	public Integer getReal() {
		return real;
	}

	public void setReal(Integer real) {
		this.real = real;
	}

	public Integer getImaginario() {
		return imaginario;
	}

	public void setImaginario(Integer imaginario) {
		this.imaginario = imaginario;
	}

	/**
	 * Suma dos complejos. <br>
	 * 
	 * @param obj
	 */
	public void suma(Complejo obj) {
		this.real += obj.real;
		this.imaginario += obj.imaginario;
	}

	/**
	 * Suma un número real al complejo. <br>
	 * 
	 * @param numero
	 */
	public void suma(int numero) {
		this.real += numero;
	}

	/**
	 * Resta dos complejos. <br>
	 * 
	 * @param obj
	 */
	public void resta(Complejo obj) {
		this.real -= obj.real;
		this.imaginario -= obj.imaginario;
	}

	/**
	 * Resta un número real al complejo. <br>
	 * 
	 * @param numero
	 */
	public void resta(int numero) {
		this.real -= numero;
	}

	/**
	 * Multiplicación entre dos complejos. <br>
	 * 
	 * @param obj
	 */
	public void multiplicacion(Complejo obj) {
		this.real = (this.real * obj.real) - (this.imaginario * obj.imaginario);
		this.imaginario = (this.real * obj.imaginario) + (this.imaginario * obj.real);
	}

	/**
	 * Multiplica un número real al complejo. <br>
	 * 
	 * @param numero
	 */
	public void multiplicacion(int numero) {
		this.real *= numero;
	}

	/**
	 * Calcula el módulo de un complejo. <br>
	 * 
	 * @return Modulo de un complejo. <br>
	 */
	public double modulo() {
		return Math.sqrt((Math.pow(this.real, 2) + Math.pow(this.imaginario, 2)));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (imaginario == null) {
			if (other.imaginario != null)
				return false;
		} else if (!imaginario.equals(other.imaginario))
			return false;
		if (real == null) {
			if (other.real != null)
				return false;
		} else if (!real.equals(other.real))
			return false;
		return true;
	}

	public String toString() {
		return "(" + this.real + " + " + this.imaginario + "i)";
	}

	public Complejo clone() {
		Complejo complejo = new Complejo(this.real, this.imaginario);
		return complejo;
	}
}
