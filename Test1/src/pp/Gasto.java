package pp;

public class Gasto {

	String nombre;
	double importe;
	String clave;

	public Gasto() {
		// TODO Auto-generated constructor stub
	}

	public Gasto(String nombre, double importe, String clave) {
		super();
		this.nombre = nombre;
		this.importe = importe;
		this.clave = clave;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

}
