package Data;

import java.util.List;

public interface IOperatoerDAO {
	OperatoerDTO getOperatoer(int oprId) throws DALException;
	List<OperatoerDTO> getOperatoerList() throws DALException;
	void createOperatoer(int oprId) throws DALException;
	void updateOperatoer(OperatoerDTO opr) throws DALException;
	void deleteOperatoer(OperatoerDTO opr)throws DALException;
	
	public class DALException extends Exception {
		public DALException() {
			super("Data Access Error");
		}
	}
}
