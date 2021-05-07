package Concrete;

import Abstract.IGamerCheckService;
import Entity.Gamer;

public class GamerManager extends AbstractGamerManager {

	private IGamerCheckService gamerCheckService;

	public GamerManager(IGamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void register(Gamer gamer) throws Exception {

		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			super.register(gamer);
		} else {
			throw new Exception("Not a valid person!");

		}

	}
	
	@Override
	public void update(Gamer gamer) throws Exception {
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			super.update(gamer);
		} else {
			throw new Exception("Not a valid person!");

		}
	}

	@Override
	public void delete(Gamer gamer) throws Exception {
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			super.delete(gamer);
		} else {
			throw new Exception("Not a valid person!");

		}
	}
	

}
