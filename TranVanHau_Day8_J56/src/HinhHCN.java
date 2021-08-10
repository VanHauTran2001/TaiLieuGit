import java.util.ArrayList;

public class HinhHCN {
		int chieuDai , chieuRong , chieuCao;

		public HinhHCN() {
			super();
		}

		public HinhHCN(int chieuDai, int chieuRong, int chieuCao) {
			this.chieuDai = chieuDai;
			this.chieuRong = chieuRong;
			this.chieuCao = chieuCao;
		}

		public int getChieuDai() {
			return chieuDai;
		}

		public void setChieuDai(int chieuDai) {
			this.chieuDai = chieuDai;
		}

		public int getChieuRong() {
			return chieuRong;
		}

		public void setChieuRong(int chieuRong) {
			this.chieuRong = chieuRong;
		}

		public int getChieuCao() {
			return chieuCao;
		}

		public void setChieuCao(int chieuCao) {
			this.chieuCao = chieuCao;
		}
		
		public int dienTich() {
			return (2*chieuCao*(chieuDai+chieuRong) + 2*chieuDai*chieuRong);
		}
		
		public int theTich() {
			return 2*chieuCao*chieuDai*chieuRong;
		}
		
		public void showInfo() {
			System.out.printf("%15d %15d %15d \n",chieuDai,chieuRong,chieuCao);
		}
		
		public void showFull() {
			System.out.printf("%15d %15d %15d %15d %15d \n",chieuDai,chieuRong,chieuCao,dienTich(),theTich());
		}
}
