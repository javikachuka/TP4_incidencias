public Vehiculo (){
	private int cantidadRuedas ;
	private String color ;

	public Vehiculo(){
		this.cantidadRuedas = 4;
	}

	public Vehiculo(int cantRuedas, String color){
		this.cantidadRuedas = cantRuedas ;
		this.color = color ;
	}

	public int getCantRuedas(){
		return this.cantidadRuedas ;
	}

	public String getColor(){
		return this.color;
	}

	public void setCantRuedas(int cantRuedas){
		this.cantidadRuedas=cantRuedas ;
	}

	public void setColor(String color){
		this.color = color ;
	}

}
