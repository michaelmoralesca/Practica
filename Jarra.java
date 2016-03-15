 public class Jarra {
//variables de instancia
	private int cantidad;
	private int capacidad;
//constructor
	public Jarra(int capacidadInicial){
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras con capacidad menor" +
					"o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}
//  metodos

    

	// programador 1: Fran
	// primer método
	public int capacidad(){
    return this.capacidad;
     	}
     //segundo método
	public int cantidad(){
		return this.cantidad;
	}





    //Programador 2: Michael Morales
    //Metodo para llenar las jarras
    public void llena(){
		this.cantidad=this.capacidad;
	}
    //Metodo para vaciar las jarras
    public void vacia(){
		this.cantidad=0;
	}


              
              
	// Programador 3: Omar Serrano
              public void llenaDesde(Jarra j){
          		while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
          			this.cantidad++;
          			j.cantidad--;
          		} 
          		public String toString(){
          			return ("("+this.capacidad+","+this.cantidad+")");
          		}

   public void metodoComunitario(){
// Comentario incluido para pruebas
           System.out.println("Aqui escribimos todos");
         }
}