package Entity;

public class Games {
	private int id;
	private String oyunadi;

	public Games() {
		super();
	}

	public Games(int id, String oyunadi) {
		super();
		this.id = id;
		this.oyunadi = oyunadi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOyunadi() {
		return oyunadi;
	}

	public void setOyunadi(String oyunadi) {
		this.oyunadi = oyunadi;
	}

}
