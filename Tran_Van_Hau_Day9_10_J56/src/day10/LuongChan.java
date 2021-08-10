package day10;

import java.util.concurrent.ThreadLocalRandom;

public class LuongChan extends Thread {
	int[]a;
	public LuongChan(int[] a) {
		this.a=a;
	}
	@Override
	public void run() {
		
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				boolean test = false;
				
				do {
					a[i] = ThreadLocalRandom.current().nextInt(0,1001);
					if(a[i]%4==0) {
						test=true;
					}
			}while(test==false);
		}
	
	}
}
}
	
