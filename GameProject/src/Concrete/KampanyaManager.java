package Concrete;

import Abstract.IKampanyaService;
import Entity.Kampanya;

public class KampanyaManager implements IKampanyaService {

	@Override
	public void Add(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaadi() + " Adl� kampanya uyguland�");

	}

	@Override
	public void Update(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaadi() + " Adl� kampanya g�ncellendi");

	}

	@Override
	public void Delete(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaadi() + " Adl� kampanya sistemden silindi.");

	}

}
