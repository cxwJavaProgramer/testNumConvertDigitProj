package numConvertDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class demo1 {
	
	public  void numConvertDigit() {
		
		//����0-9�İ������Ͷ�Ӧ����ĸ
		List<String> btnList=new ArrayList<String>();
		btnList.add("");//0�İ�ť����
		btnList.add("");//1�İ�ť����
		btnList.add("A,B,C");//2�İ�ť��A,B,C��
		btnList.add("D,E,F");//3�İ�ť��D,E,F��
		btnList.add("G,H,I");//4�İ�ť��G,H,I��
		btnList.add("J,K,L");//5�İ�ť��J,K,L��
		btnList.add("M,N,O");//6�İ�ť��M,N,O��
		btnList.add("P,Q,R,S");//7�İ�ť��P,Q,R,S��
		btnList.add("T,U,V");//8�İ�ť��T,U,V��
		btnList.add("W,X,Y,Z");//9�İ�ť��W,X,Y,Z��
				
		
		System.out.println("����������0-9��������ϣ�(����ĸ�ʽΪ��0,1,2,...9�������)");
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input=sc.nextLine();
			String[] inputList = input.split(",");
			
			//�ж������ʽ�Ƿ��������û���������
			try {
			    for(String s:inputList) {
					int num = Integer.parseInt(s);
					if(num>9||num<0) {
						throw new Exception();
					}
				}
			}catch(Exception ex) {
				System.out.println("��ʽ����(�밴�������ʽ��0,1,2,..n[0<=n<=9]��������)");
				sc=new Scanner(System.in);
				continue;
			}
			
			
			String[] firstList=null;

            for(String s:inputList) {
            	
            	//ͨ���û��������������õ�������btnList����ͨ�������õ����ְ�ť��Ӧ���ַ�����ϣ�����9�İ�ť��W,X,Y,Z�����
            	String[] secondList = btnList.get(Integer.parseInt(s)).split(",");
            	
            	//ͨ���ݹ麯���õ����յĽ����
            	firstList=combination(firstList,secondList);
            	
            }
            
            
            String result="";
            for(String s:firstList) {
            	result+=s+" ";          	
            }
            
            System.out.println("�����"+result);
		}

	}
	
	
	//�ݹ麯����secondList���ַ����ϻ����κ�firstListÿ��Ԫ�ؽ��кϲ��������µ�secondList
	public  String[] combination(String[] firstList ,String[] secondList) {
		if(firstList==null) {
			return secondList;
		}		
		//����������ϵ�����ȷ���µ��ַ�������ĳ���
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
