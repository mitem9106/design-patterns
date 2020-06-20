package strategy;

abstract class Fighter {
	KickBehavior kickBehavior;
	JumpBehavior jumpBehavior;
	
	public Fighter(KickBehavior kickBehavior,
					JumpBehavior jumpBehavior)
	{
		this.kickBehavior = kickBehavior;
		this.jumpBehavior = jumpBehavior;
	}
	public void punch()
	{
		System.out.println("Default punch");
	}
	
	public void kick()
	{
		kickBehavior.kick();
	}
	
	public void jump()
	{
		jumpBehavior.jump();
	}
	
	public void roll()
	{
		System.out.println("Default roll");
	}
	
	public void SetJumpBehavior(JumpBehavior jumpBehavior)
	{
		this.jumpBehavior = jumpBehavior;
	}
	
	public void SetKickBehavior(KickBehavior kickBehavior)
	{
		this.kickBehavior = kickBehavior;
	}
	
	public abstract void display();
}
