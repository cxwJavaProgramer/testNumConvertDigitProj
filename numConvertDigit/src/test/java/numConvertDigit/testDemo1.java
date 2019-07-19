package numConvertDigit;

import junit.framework.TestCase;

public class testDemo1 extends TestCase{
	
	//加上该方法即可使用testAll的addTest()方法
	public testDemo1(String arg){
	     super(arg);
	}

	
	public void testNumConvertDigit() {
		demo1 d=new demo1();
		d.numConvertDigit();
		
	}

}
