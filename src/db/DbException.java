package db;

public class DbException extends RuntimeException{

	public static final long serialVersionUID = 1;
	
	public DbException(String msg) {
		super(msg);
	}
	
}
