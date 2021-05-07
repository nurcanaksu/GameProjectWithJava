package Entity;

public class Kampanya implements Entity {

	private String kampanyaadi;

	public Kampanya() {
		super();
	}

	public Kampanya(String kampanyaadi) {
		super();
		this.kampanyaadi = kampanyaadi;
	}

	public String getKampanyaadi() {
		return kampanyaadi;
	}

	public void setKampanyaadi(String kampanyaadi) {
		this.kampanyaadi = kampanyaadi;
	}

}
