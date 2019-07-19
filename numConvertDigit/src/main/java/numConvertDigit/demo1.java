package numConvertDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class demo1 {
	
	public  void numConvertDigit() {
		
		//声明0-9的按键，和对应的字母
		List<String> btnList=new ArrayList<String>();
		btnList.add("");//0的按钮“”
		btnList.add("");//1的按钮“”
		btnList.add("A,B,C");//2的按钮“A,B,C”
		btnList.add("D,E,F");//3的按钮“D,E,F”
		btnList.add("G,H,I");//4的按钮“G,H,I”
		btnList.add("J,K,L");//5的按钮“J,K,L”
		btnList.add("M,N,O");//6的按钮“M,N,O”
		btnList.add("P,Q,R,S");//7的按钮“P,Q,R,S”
		btnList.add("T,U,V");//8的按钮“T,U,V”
		btnList.add("W,X,Y,Z");//9的按钮“W,X,Y,Z”
				
		
		System.out.println("请输入数字0-9的随意组合：(输入的格式为：0,1,2,...9随意组合)");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input=sc.nextLine();
			String[] inputList = input.split(",");
			
			//判断输入格式是否有误，让用户重新输入
			try {
			    for(String s:inputList) {
					int num = Integer.parseInt(s);
					if(num>9||num<0) {
						throw new Exception();
					}
				}
			}catch(Exception ex) {
				System.out.println("格式有误！(请按照输入格式：0,1,2,..n[0<=n<=9]重新输入)");
				sc=new Scanner(System.in);
				continue;
			}
			
			
			String[] firstList=null;

            for(String s:inputList) {
            	
            	//通过用户输入的数字组合拿到索引，btnList可以通过索引拿到数字按钮对应的字符串组合，例如9的按钮“W,X,Y,Z”组合
            	String[] secondList = btnList.get(Integer.parseInt(s)).split(",");
            	
            	//通过递归函数拿到最终的结果集
            	firstList=combination(firstList,secondList);
            	
            }
            
            
            String result="";
            for(String s:firstList) {
            	result+=s+" ";          	
            }
            
            System.out.println("结果："+result);
		}

	}
	
	
	//递归函数，secondList的字符集合会依次和firstList每个元素进行合并，生成新的secondList
	public  String[] combination(String[] firstList ,String[] secondList) {
		if(firstList==null) {
			return secondList;
		}		
		//根据排列组合的运算确定新的字符串数组的长度
		String[] combinationList=new String[firstList.length*secondList.length];		
		int i=0;
		for(String a:firstList) {
			for(String b:secondList) {
				combinationList[i]=a+b;		
				i++;
			}
		}		
		return combinationList;
		
	}

}
