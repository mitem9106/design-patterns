package strategy;

public class StreetFighter {

	public static void main(String[] args) {
		
		// make behaviors first
		JumpBehavior shortJump = new ShortJump();
		JumpBehavior longJump = new LongJump();
		KickBehavior tornadoKick = new TornadoKick();
		
		// make a fighter with desired behavior
		Fighter ken = new Ken(tornadoKick, shortJump);
		ken.display();
		
		//Test Behaviors
		ken.punch();
		ken.kick();
		ken.jump();
		
		// Change behavior dynamically
		ken.SetJumpBehavior(longJump);
		ken.jump();
	}

}
