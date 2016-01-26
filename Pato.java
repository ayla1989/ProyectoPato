package principal;

public class Pato {

//ATRIBUTOS
	
	private int posicion;
	
	
//CONSTRUCTORES
	


	public Pato(int posicion)
	{
		this.posicion=posicion;
	}
	
//METODOS 
	
	public int andaHaciaDelante(int pasos)
	{
		this.posicion+=pasos;
		return this.posicion;
	}
	
	public int andaHaciaAtras(int pasos)
	{
		this.posicion-=pasos;
		return this.posicion;
	}
	
	public int dimePosicion()
	{
		return this.posicion;
	}
	

}
