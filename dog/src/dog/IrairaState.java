package dog;

class IrairaState extends DogState {
	private static IrairaState s = new IrairaState();
	private IrairaState() {}
	public static DogState getInstance() {
	return s;
	}
	public void tukareta(Dog moto) {
		// なにもしない
		}
		public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getlnstance());
		}
		public String toString() {
		return "いらいら状態";
		}
		}


