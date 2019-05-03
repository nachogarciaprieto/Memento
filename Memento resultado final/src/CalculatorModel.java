//El modelo realiza todos los cálculos necesarios
public class CalculatorModel {

	//Contiene el valor de la suma de los números
	//introducidos en View
	private int calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber){
		
		calculationValue = firstNumber + secondNumber;
	}
	
	public int getCalculationValue(){
		
		return calculationValue;
	}
}
