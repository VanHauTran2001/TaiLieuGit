package day10;

import java.util.concurrent.ThreadLocalRandom;

public class LuongLe extends Thread {
	int[]a;
	
	public LuongLe(int[] a) {
		this.a = a;
		
	}
public void run() {
		
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				boolean test = false;
				
				do {
					a[i] = ThreadLocalRandom.current().nextInt(0,1001);
					if(a[i]%7==0) {
						test=true;
					}
			}while(test==false);
		}
	
	}
}
}
	
