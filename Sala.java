public class Sala{
	private Cliente[] cadeiras;
	public Sala(int tam, Cliente sub, Cliente[] cadeiras){
		this.cadeiras = cadeiras;
		for(int i = 0; i < tam; i++){
			this.cadeiras[i] = sub;
		}
	}
	public 	boolean reservar(Cliente sub, int indice){
		if(this.cadeiras[indice].getId().equals("")){
			this.cadeiras[indice] = sub;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean cancelar(String id, Cliente sub){
		for(int i = 0; i < this.cadeiras.length; i++){
			if(this.cadeiras[i].getId().equals(id)){
				this.cadeiras[i] = sub;
				return true;
			}
		}
		return false;
	}
	public String toString(){
		String str = "";
		for(int i = 0; i < this.cadeiras.length; i++){
			if(this.cadeiras[i].getId().equals("")){
				str += "-";
			}
			else{
				str += this.cadeiras[i].getId() + " " + this.cadeiras[i].getFone() + " ";
			}
		}
		return str;
	}
}