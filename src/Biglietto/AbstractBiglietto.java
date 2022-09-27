package Biglietto;

public abstract class AbstractBiglietto implements IBiglietto{
	
	private int IDfilm;
	private int Number = 0;
	private double ManPrice;
	private double WomanPrice;
	private double ChildPrice;
	
	public AbstractBiglietto(int IDfilm, double ManPrice, double WomanPrice, double ChildPrice) {
		super();
		this.Number++;
		this.IDfilm = IDfilm;
		this.ManPrice = ManPrice;
		this.WomanPrice = WomanPrice;
		this.ChildPrice = ChildPrice;
	}

	@Override
	public int getIDfilm() {
		return IDfilm;
	}

	@Override
	public int getNumber() {
		return this.Number;
	}

	@Override
	public double getManPrice() {
		return this.ManPrice;
	}

	@Override
	public double getWomanPrice() {
		return this.WomanPrice;
	}

	@Override
	public double getChildPrice() {
		return this.ChildPrice;
	}

	@Override
	public void setIDfilm(int iD) {
		IDfilm = iD;
	}
	
	@Override
	public void setManPrice(double ManPrice) {
		this.ManPrice = ManPrice;
	}

	@Override
	public void setWomanPrice(double WomanPrice) {
		this.WomanPrice = WomanPrice;
	}

	@Override
	public void setChildPrice(double ChildPrice) {
		this.ChildPrice = ChildPrice;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractBiglietto other = (AbstractBiglietto) obj;
		return this.Number == other.Number;
	}

	@Override
	public String toString() {
		return "Biglietto [Film: " +this.IDfilm +", Matricola:" + this.Number + ", prezzoUomo:" + this.ManPrice + ", prezzoDonna:"
				+ this.WomanPrice + ", prezzoBambino:" + this.ChildPrice + "]";
	}
}
