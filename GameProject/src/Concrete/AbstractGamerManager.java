package Concrete;

import Entity.Gamer;

public abstract class AbstractGamerManager implements GameService {

	@Override
	public void register(Gamer gamer) throws Exception {
		System.out.println("Sisteme kayýt oldunuz: " + gamer.getFirstName());

	}

	@Override
	public void update(Gamer gamer) throws Exception {
		System.out.println(gamer.getFirstName() + " Adlý kullanýcýnýn bilgileri güncellendi..");

	}

	@Override
	public void delete(Gamer gamer) throws Exception {
		System.out.println(gamer.getFirstName() + " Adlý kullanýcý sistemden silindi..");

	}

}
