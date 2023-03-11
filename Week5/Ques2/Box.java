package Week5.Ques2;

public class Box<T> {

	Object container;

	public Box(Object container) {
		super();
		this.container = container;
	}

	public Object getContainer() {
		return container;
	}

	public void setContainer(Object container) {
		this.container = container;
	}

	public void performTask() {
		if (container instanceof String) {
			System.out.println("String Type " + container);
		} else if (container instanceof Integer) {
			System.out.println("Integer Type " + container);
		} else if (container instanceof Double) {
			System.out.println("Double Type " + container);
		} else if (container instanceof Object) {
			System.out.println("Object Type " + container.getClass());
		} else if (container instanceof Boolean) {
			System.out.println("Boolean Type " + container);
		}
	}

}
