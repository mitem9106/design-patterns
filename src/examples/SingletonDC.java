package examples;

//Double Checked Locking Java implementation of singleton design pattern
class SingletonDC
{
	
	private volatile static SingletonDC obj;
	
	// private constructor to force use of
	// getInstance() to create Singleton object
	private SingletonDC() {}
	
	public static SingletonDC getInstance()
	{
		if (obj==null)
		{
			// to make thread safe
			synchronized (SingletonDC.class)
			{
				// check again as multiple threads
				//can reach above step
				if (obj==null)
					obj = new SingletonDC();
			}
		}
		return obj;
	}
}