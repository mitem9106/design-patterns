package strategy;

public interface KickBehavior {
	public void kick();
}

class TornadoKick implements KickBehavior
{
	public void kick()
	{
		System.out.println("Tornado Kick");
	}
}

class LightningKick implements KickBehavior
{
	public void kick()
	{
		System.out.println("Lightning Kick");
	}
}
