package Package;

public class Calculadora {
	
	public static int sumar(String stringOfNumbers){
		int lenghtOfString,pos,posComa=0,posComa1,result=0, subSNumber;
		String subS,subS1,subS2;
		lenghtOfString=stringOfNumbers.length();
		System.out.println("longitud del string: "+lenghtOfString);
		
		/////TODO ESTO CORRE
		/*
		posComa=stringOfNumbers.indexOf(',');
		System.out.println("posicion primera coma: "+posComa);
		
		posComa1=stringOfNumbers.indexOf(',',posComa+1);
		System.out.println("posicion segunda coma: "+posComa1);
		
				
		subS1=stringOfNumbers.substring(0,posComa);
		System.out.println("Valor hasta la primera coma: "+subS1);
		
		subS=stringOfNumbers.substring(posComa+1,posComa1);
		System.out.println("Segundo valor separado por coma: "+subS);
		
		subSNumber=Integer.parseInt(subS);
		
		return subSNumber;
		*/
		//TODO ESTO CORRE
		
		/*
		//TODO ESTO TAMBIÉN CORRE
		int inicio=0;
		while(stringOfNumbers.indexOf(',',posComa+1)!=-1) {
			
			posComa=stringOfNumbers.indexOf(',',posComa+1);//encuentra la coma
			System.out.println("posicion coma: "+posComa);
			subS2=stringOfNumbers.substring(inicio,posComa);//corta desde el inicio hasta la coma
			System.out.println("numero: "+subS2);
			subSNumber=Integer.parseInt(subS2);//convierte el string en número
			result=result+subSNumber;//suma el número a la suma acumulada
			System.out.println("suma: "+result);
			inicio=posComa+1;
						
		}
		return posComa;
		//TODO ESTO TAMBIÉN CORRE
		*/
		
		//TODO ESTO CORRE
		/*
		int inicio=0;
		do {
			
			posComa=stringOfNumbers.indexOf(',',posComa+1);//encuentra la coma
			System.out.println("posicion coma: "+posComa);
			subS2=stringOfNumbers.substring(inicio,posComa);//corta desde el inicio hasta la coma
			System.out.println("numero: "+subS2);
			subSNumber=Integer.parseInt(subS2);//convierte el string en número
			result=result+subSNumber;//suma el número a la suma acumulada
			System.out.println("suma: "+result);
			inicio=posComa+1;
			if(stringOfNumbers.indexOf(',',posComa+1)==-1) {
				System.out.println("no se encontró , ");
				subS2=stringOfNumbers.substring(inicio,lenghtOfString);
				System.out.println("numero: "+subS2);
				subSNumber=Integer.parseInt(subS2);
				result=result+subSNumber;
				System.out.println("suma: "+result);
			}
				
						
		}while(stringOfNumbers.indexOf(',',posComa+1)!=-1);
		return result;
		//TODO ESTO CORRE
		*/
		
		int inicio=0;
		do {
			
			posComa=stringOfNumbers.indexOf(',',posComa+1);//encuentra la coma
			System.out.println("posicion coma: "+posComa);
			subS2=stringOfNumbers.substring(inicio,posComa);//corta desde el inicio hasta la coma
			System.out.println("numero: "+subS2);
			subSNumber=Integer.parseInt(subS2);//convierte el string en número
			result=result+subSNumber;//suma el número a la suma acumulada
			System.out.println("suma: "+result);
			inicio=posComa+1;
			if(stringOfNumbers.indexOf(',',posComa+1)==-1) {
				System.out.println("no se encontró , ");
				subS2=stringOfNumbers.substring(inicio,lenghtOfString);
				System.out.println("numero: "+subS2);
				subSNumber=Integer.parseInt(subS2);
				result=result+subSNumber;
				System.out.println("suma: "+result);
			}
				
						
		}while(stringOfNumbers.indexOf(',',posComa+1)!=-1);
		return result;
		
	}
	
	

}
