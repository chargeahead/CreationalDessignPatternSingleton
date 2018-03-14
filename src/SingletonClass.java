
public class SingletonClass {
	//private instance variable
	private static volatile SingletonClass instance = null;
	
	//private constructor
	private SingletonClass() {
		if(instance != null) {
			throw new RuntimeException("Not allowed to instantiate directly");
		}
	}
	
	//Method invoked by outside clients
	public static SingletonClass getInstance() {
		if(instance == null) {
			synchronized(SingletonClass.class) {
			  if(instance == null) {
				instance = new SingletonClass();
			  }
			}
		}
		return instance;
	}

}
