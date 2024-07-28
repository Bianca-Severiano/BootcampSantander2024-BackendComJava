package singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstancia();
		System.out.println(singleton);
		singleton = Singleton.getInstancia();
		System.out.println(singleton);
	

		SingletonEager singletonE = SingletonEager.getInstancia();
		System.out.println(singletonE);
		singletonE = SingletonEager.getInstancia();
		System.out.println(singletonE);
		
		SingletonLazyHolder singletonH = SingletonLazyHolder.getInstancia();
		System.out.println(singletonH);
		singletonH = SingletonLazyHolder.getInstancia();
		System.out.println(singletonH);
	}

}
