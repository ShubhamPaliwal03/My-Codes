class Box<T>
{
	private T t;

	public void add(T t)
	{
		this.t = t;
	}

	public T get()
	{
		return t;
	}
}

class DefiningAGenericClass
{
	public static void main(String[] args)
	{
		Box<Integer> integerBox = new Box<Integer>();

		Box<String> stringBox = new Box<String>();

		integerBox.add(new Integer(10));

		stringBox.add(new String("Hello World"));

		System.out.printf("\nInteger Value : %d\n\n", integerBox.get());

		System.out.printf("\nString Value : %s\n\n", stringBox.get());
	}
}