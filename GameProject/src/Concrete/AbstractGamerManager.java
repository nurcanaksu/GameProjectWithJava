package Concrete;

import Entity.Gamer;

public abstract class AbstractGamerManager implements GameService {

	@Override
	public void register(Gamer gamer) throws Exception {
		System.out.println("Sisteme kay�t oldunuz: " + gamer.getFirstName());

	}

	@Override
	public void update(Gamer gamer) throws Exception {
		System.out.println(gamer.getFirstName() + " Adl� kullan�c�n�n bilgileri g�ncellendi..");

	}

	@Override
	public void delete(Gamer gamer) throws Exception {
		System.out.println(gamer.getFirstName() + " Adl� kullan�c� sistemden silindi..");

	}

}
