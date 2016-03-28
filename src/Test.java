
public class Test {
	static int i=12;
	/**
	 * @param args
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		try {
//			Class s=Class.forName("Test");
			Class s=ClassLoader.getSystemClassLoader().loadClass("Test");
			Test t=(Test)s.newInstance();
			System.out.println(t.i);
			String path=t.getClass().getClassLoader().getClass().getName().toString();
			System.out.println(path);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
