package Concrete;

import Abstract.IGamesService;
import Abstract.IKampanyaService;
import Entity.Gamer;
import Entity.Games;
import Entity.Kampanya;

public class GamesManager implements IGamesService {

	IKampanyaService kampanyaService;

	public GamesManager(IKampanyaService kampanyaService) {
		super();
		this.kampanyaService = kampanyaService;
	}

	@Override
	public void satis(Gamer gamer, Games games, Kampanya kampanya) {
		System.out.println(games.getOyunadi() + " Adl� oyun " + gamer.getFirstName() + " Adl� oyuncuya sat�ld�.. ");
		kampanyaService.Add(kampanya);
	}

}
