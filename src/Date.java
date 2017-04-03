package 
public class Date{	
	
	
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)throws DateException{
		this.day = day;										//esto hay que meterlo en el fichero date
		
		if (month < 1 && month >12){
			throw new DateException("Mes "+ mes + "	no valido. Solo valores entre 1 y 12");			//es mejor asi porque muchos if anidados puede llegar a dar error, primero se hacen todas las comprobaciones se hace que pasa si todo va mal y al final se hace un else para ver que pasaria si todo va bien
		}else{
			this.month = month;
		}																//hay que crear una carpeta para los test (Junit Test case)
		this.year = year;
	}
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
}