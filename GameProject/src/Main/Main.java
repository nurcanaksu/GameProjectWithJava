package Main;

import Adapters.MernisServiceAdapters;
import Concrete.AbstractGamerManager;
import Concrete.GamerManager;
import Concrete.GamesManager;
import Concrete.KampanyaManager;
import Entity.Gamer;
import Entity.Games;
import Entity.Kampanya;

public class Main {

	public static void main(String[] args) throws Exception {

		
		AbstractGamerManager mernis = new GamerManager(new MernisServiceAdapters());
		System.out.println("Oyuncunun sisteme kayýt olmasý..");
		mernis.register(new Gamer(1, "Nurcan ", "Aksu", 2001, 19777905432L));

		GamesManager games = new GamesManager(new KampanyaManager());
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Nurcan");
		gamer1.setLastName("Aksu");
		gamer1.setNationalityId(19777905432L);
		gamer1.setDateOfBirth(2001);

		Kampanya kampanya1 = new Kampanya();
		kampanya1.setKampanyaadi("%50 indirim");

		Games games1 = new Games();
		games1.setId(1);
		games1.setOyunadi("Sims");

		games.satis(gamer1, games1, kampanya1);
		
		System.out.println("\n");
		
		System.out.println("Oyuncu bilgilerinin güncellenmesi");
		mernis.update(new Gamer(1, "Nurcan ", "Aksu", 2001, 19777905432L));
		
		System.out.println("\n");
		
		System.out.println("Oyuncu'nun sistemden silinmesi..");
		mernis.delete(new Gamer(1, "Nurcan ", "Aksu", 2001, 19777905432L));
		

	}

}
