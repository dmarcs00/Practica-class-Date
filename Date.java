package prg1.Practica-clase-Date.src
public class Date{	
	
	
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)throws DateException{
		
		if(day < 1 || day >31){
		throw new DateException("Dia "+ day + "	no valido. Solo valores entre 1 y 31");
	}else{
		this.day = day;	
	}		
		
		if (month < 1 || month >12){
			throw new DateException("Mes "+ month + "	no valido. Solo valores entre 1 y 12");			//es mejor asi porque muchos if anidados puede llegar a dar error, primero se hacen todas las comprobaciones se hace que pasa si todo va mal y al final se hace un else para ver que pasaria si todo va bien
		}else{
			this.month = month;
		}
		
		this.year = year;
	}
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	
	public boolean isSameYear(int year){	//te compara la fecha que tienes con la que has metido si es igual te devulve un true y si no no se pone ningun else porque el booleano se ha declarado como false
		boolean equals = false;
		if(this.year == year){
			equals = true;
		}
	return equals;
	}
	public boolean isSameMonth(int month){
		
		boolean equals = false;
		if(this.getMonth == month){
			boolean equals = false;
		}
		return equals;
	}
	public boolean isSameDay(int day){
			boolean equals = false;
			if(this.getDay == day){
				equals = true;
			}
		return equals;
	}
	public boolean isSame (Date date){ // el this (es el tuyo propio y cuando trabajas con el lo estas haciendo con el tuyo propio) es un objeto que tu tienes ya y el objeto date es otro externo que tu ya tienes metido
		boolean equals = false
		if(this.getYear() == date.getYear() && this.getMonth() == date.getMonth() && this.getDay() == date.GetDay()){
		boolean equals = true;	
		}
		return equals; // se devuelve un true o false para despues trabajar con ello en tu programa, como un comparador de fechas, si dos fechas coinciden en una base de datos entonces igual es que esta mal y hay que corregir
	}
	
	public int getDay(){	//Coge el valor que guardas en esa variable y previamente has introducido
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}
	
	
	
	
	
	public String toString(){
		
	}
}