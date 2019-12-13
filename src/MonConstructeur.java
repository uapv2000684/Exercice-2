
public class MonConstructeur implements ConstructeurConnectable {

	@Override
	public Connectable creer(String nomConnectable)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object o=Class.forName(nomConnectable).newInstance();
		if(o instanceof Connectable)
		{
			return (Connectable) o;
		}
		return null;
	}

}
