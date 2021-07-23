package db;

public class DbIntegrityExceptiom extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DbIntegrityExceptiom(String msg) {
		super(msg);
	}
}
