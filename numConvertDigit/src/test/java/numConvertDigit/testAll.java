package numConvertDigit;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

//�ɶ����в����������в���
public class testAll {
	
	public static Test suite() {
		//����ֻ��һ��
		TestSuite suite=new TestSuite("All tests from demo1");
		suite.addTestSuite(testDemo1.class);
		suite.addTest(new testDemo1("testNumConvertDigit"));
		return suite;
		
	}
	
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

}
