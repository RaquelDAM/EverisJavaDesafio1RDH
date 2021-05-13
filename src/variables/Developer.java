package variables;

/**
 * 
 * @author rdiahern
 * Primer desafío Java
 *
 */

public class Developer {

	/** Variables */
	private String name;
	private static byte contEmployee = 0;
	private long num;
	private long dayshol = 21;
	public static final String BUSINESS = "EVERIS";

	/** Constructor con parámetro nombre */

	public Developer(String name) {

		this.name = name;
		contEmployee++;
		this.num = contEmployee;
	}

	/** Método para controlar días de vacaciones */

	public long controlholidays(long dd) {
		if (dd < this.dayshol) {
			this.dayshol -= dd;
		} else {
			System.out.println("Error, solo le quedan " + dayshol + " dias de vaciones");
		}
		return this.dayshol;
	}

	/** GETTER & SETTER */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public byte getContEmployee() {
		return contEmployee;
	}

	public void setContEmployee(byte contEmployee) {
		this.contEmployee = contEmployee;
	}

	public long getDayshol() {
		return dayshol;
	}

	public void setDayshol(long dayshol) {
		this.dayshol = dayshol;
	}

}
