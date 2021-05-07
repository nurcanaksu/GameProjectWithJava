package Concrete;

import Abstract.IKampanyaService;
import Entity.Kampanya;

public class KampanyaManager implements IKampanyaService {

	@Override
	public void Add(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaadi() + " Adlý kampanya uygulandý");

	}

	@Override
	public void Update(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaadi() + " Adlý kampanya güncellendi");

	}

	@Override
	public void Delete(Kampanya kampanya) {
		System.out.println(kampanya.getKampanyaadi() + " Adlý kampanya sistemden silindi.");

	}

}
