import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//El controlador coordina las interacciones
//entre la View y Model
public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		  // Cuando hacemos clic en el boton de calcular
		//Se ejecuta el metodo actionPerformed
		//     en la clase interna CalculateListener
		
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
			//  Rodea las interacciones con la View con
			// Un bloque try en caso de que los números no
			// Se introduzcan  correctamente
			
			try{
			
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
}