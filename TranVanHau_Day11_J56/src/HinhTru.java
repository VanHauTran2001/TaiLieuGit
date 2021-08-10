
public class HinhTru {
	private  float bk;
	private	 float cc;

	public HinhTru(float bk, float cc) {
		this.bk = bk;
		this.cc = cc;
		
	}

	public float getBk() {
		return bk;
	}

	public void setBk(float bk) {
		this.bk = bk;
	}

	public float getCc() {
		return cc;
	}

	public void setCc(float cc) {
		this.cc = cc;
	}
	
	public float dt() {
		return (float) (2*Math.PI*bk/1000*(bk/1000+cc/1000));
	}
	public float tt() {
	
		return (float) (Math.PI*bk/1000*bk/1000*cc/1000);
	}
	public float kl() {
		return (float) (tt()*19301);
	}
	public void show() {
		System.out.println("Bk =" + bk/1000 + ";Cc =" + cc/1000 + ";DT =" + dt() +";TT =" + tt() + ";Kl =" + kl());
	}
}	
