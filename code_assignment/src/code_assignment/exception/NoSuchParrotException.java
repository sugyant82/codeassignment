package code_assignment.exception;

public class NoSuchParrotException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "There is no such parrot in our zoo. "
				+ "If you would like to train a new parrot, please contact our administrator. Thanks";
		
	}
	
}
