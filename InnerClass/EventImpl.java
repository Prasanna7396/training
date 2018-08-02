
public class EventImpl implements Event {

	public void doSomething() {
		System.out.println("first event implementation");
	}

	public static class InnerEventImpl implements Event {

		public void doSomething() {
			System.out.println("Second event implementation");
		}
	}

	public void doingSomething() {
		class InnerMostImpl implements Event {
			public void doSomething() {
				System.out.println("Third Event");
			}
		};
		new InnerMostImpl().doSomething();
	}

	public void doingSomethingAgain() {
		new Event() {
			public void doSomething() {
				System.out.println("Fourth Event");
			}
		}.doSomething();
	}

	public void doingSomethingOneLastTime() {
		Event e =()-> System.out.println("Fifth Event");
		e.doSomething();
		
	}
	public static void main(String[] args) {
		EventImpl impl = new EventImpl();
		impl.doSomething();
		// InnerEventImpl innerImp = impl.new InnerEventImpl();
		InnerEventImpl innerImp = new EventImpl.InnerEventImpl();
		innerImp.doSomething();

		impl.doingSomething();
		impl.doingSomethingAgain();
		impl.doingSomethingOneLastTime();

	}
}
