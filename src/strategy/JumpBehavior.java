package strategy;

public interface JumpBehavior {
	public void jump();
}

class LongJump implements JumpBehavior
{
	public void jump()
	{
		System.out.println("Long Jump");
	}
}

class ShortJump implements JumpBehavior
{
	public void jump()
	{
		System.out.println("Short Jump");
	}
}
