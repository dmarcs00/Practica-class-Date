package prg1.Practica-clase-Date.src
public class MainDate{
	
	public static void main(String[] args){
		
		Date today;
		
		try{
				today = new Date(99,13,2017);
				System.out.println(today);
			}catch (DataException e) {
				System.out.println(e.getMessage());
			}
		
		}
}
	/*public int getDay (){
	return day;
	}
	public int getMonth(){
	return month;
	}
	public int getYear(){
		return year;
	}*/
	public void isSame{
		
	}
	//para cambiar los numeros de los años meses y dias.
	void yearNum(int num){
		year = num;
	}
	void monthNum(int num){
		month = num;
	}
	void dayNum(int num){
		day = num;
	}

	public void	printMonth(){
		String mes1 = new String();
		mes1 = "Enero";
	String mes2 = new String();
		mes2 = "Febrero";
	String mes3 = new String();
		mes3 = "Marzo";
	String mes4 = new String();
		mes4 = "Abril";
	String mes5 = new String();
		mes5 = "Mayo";
	String mes6 = new String();
		mes6 = "Junio";
	String mes7 = new String();
		mes7 = "Julio";
	String mes8 = new String();
		mes8 = "Agosto";
	String mes9 = new String();
		mes9 = "Septiembre";
	String mes10 = new String();
		mes10 = "Octubre";
	String mes11 = new String();
		mes11 = "Noviembre";
	String mes12 = new String();
		mes12 = "Diciembre";
	
	}
	public void checkMonth(){
		
	}
	public void seasonMonth(){
		if(month == 12,1,2,3) System.out.prinln();
		if(month == 4,5) System.out.println();
		if(month == 6,7,8,9) System.out.println();
		if(month == 10,11) System.out.println();
	}
	public void leftMonths(){
		Date numeroMes = new Date();
		for(i=numeroMes;i<=12;i++) //...
			
	}
	public void dayLeft(){
		Date numeroDias = new Date();
		if(numeroDias==31)
		for(i=numeroDias;i<=31;i++)
		
		else/...
			for(i=numeroDias;i<=30;i++)
	}

	public void sameMonth(){
		
		if((month % 2 == 0) && (month ==9,11))
			
		else if(month % 2 != 0) && (month == 8,10,12))
	}
	
	public void countDays(){
		for(i=day;i<=365;i++) //ver si el año es bisiesto o no.
	}
	
	
	
	
	
	
}