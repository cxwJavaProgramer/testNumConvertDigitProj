package numConvertDigit;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

//可对所有测试用例进行测试
public class testAll {
	
	public static Test suite() {
		//尽管只有一个
		TestSuite suite=new TestSuite("All tests from demo1");
		suite.addTestSuite(testDemo1.class);
		suite.addTest(new testDemo1("testNumConvertDigit"));
		return suite;
		
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

}
