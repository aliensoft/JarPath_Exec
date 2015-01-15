package Tests;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.text.SimpleDateFormat;
import java.util.Date;

import agents.Agent2;

public class run {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
		


		// TODO Auto-generated method stub
		run r = new run();
		r.setP("abc");
		boolean b = true;
		int i =0;
		while(i<100) {
			i++;
			run.b b1 = r.new b();
			b1.setStr("afds");
			Thread.sleep(5000);
			System.out.println(r.p);
		}
	}
	private String p = "";
	public String getP() {

		return p;
	}
	public void setP(String p) {
		
		//System.out.println(this.getClass().getClassLoader().getResource(this.getClass().getCanonicalName().replace(".", "/") + ".class"));
		this.p = p;
	}
	public class b {
		private String str = "";

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}
	}
}
