package Adapters;

import java.rmi.RemoteException;

import Abstract.IGamerCheckService;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements IGamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getFirstName(), gamer.getLastName(),
					gamer.getDateOfBirth());

		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
	}

}
