//El modelo realiza todos los c�lculos necesarios
public class CalculatorModel {

	//Contiene el valor de la suma de los n�meros
	//introducidos en View
	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber){
		
		calculationValue = firstNumber + secondNumber;
	}
	
	public int getCalculationValue(){
		
		return calculationValue;
	}
}
