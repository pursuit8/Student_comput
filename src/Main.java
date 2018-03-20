import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 实现接口
 * @author LiuL
 *
 */
public class Main {

	public static void main(String[] args) throws ScriptException, IOException {
		
		ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
		File file = new File("result.txt");  //生成保存结果的文件
		FileOutputStream fop = new FileOutputStream(file);
		
		//如果没有文件，自己创建
		if (!file.exists()) {
		   file.createNewFile();
		}

		String s = "";
		int x=-1; //题目数量		
		System.out.println("请输入题目的数量：");
		Scanner scan2 = new Scanner(System.in);
		while(x < 1 || x > 1000)
		{
		          try{
		        	  x = scan2.nextInt();
		          }catch(Exception e){
		              System.out.println("输入不符合要求，请重新输入");
		              scan2.next();
		              x=-1;
		        }
		        if((x < 1 || x > 1000) && x != -1)
		             System.out.println("输入不符合要求，请重新输入");
		}        
 		String serialNo = "201571030119";
		fop.write(serialNo.getBytes());    //将学号写入文件
        fop.write("\r\n".getBytes());   //换行
		
		int a = 0;//运算式的第一个随机数
		int b = 0;//运算式的第二个随机数
		int c = 0;//运算式的第三个随机数
		int d = 0;//运算式的第四个随机数
		int e = 0;//运算式的第五个随机数
		
		int num = 0;//结果
		String q="";      //保存运算式
		Random random = new Random();	
		int i=0;
		while(i<x){
			a = (int) (Math.random()*100+1);
			b = (int) (Math.random()*100+1);
			c = (int) (Math.random()*100+1);
			d = (int) (Math.random()*100+1);
			e = (int) (Math.random()*100+1);
			
			int z = random.nextInt(5)%(5-3+1) + 3;//产生一个3-5之间的随机数，用来设定运算式的数值个数		
			if(z == 3){
				//3个数，则产生两个运算符
				int A = random.nextInt(4)%(4-1+1) + 1;
				switch(A){
					case 1: num = a + b;
					q = a + "+" + b;  
					break;
					case 2: num = a - b;
					q = a + "-" + b;
					break;
					case 3: num = a * b;
					q = a + "*" + b;
					break;
					default : 
					num = a / b; q = a + "/" + b;
					break;
				}
				int B = random.nextInt(4)%(4-1+1) + 1;
				switch(B){
					case 1: num = num + c; q = q + "+" + c;
					break;
					case 2: num = num - c; q = q + "-" + c;
					break;
					case 3: num = num * c; q = q + "*" + c;
					break;
					default : 
						num = num / c; q = q + "/" + c;
					break;
				}
			}
			
			if(z == 4){
				//4个数，则产生三个运算符
				int A = random.nextInt(4)%(4-1+1) + 1;
				switch(A){
					case 1: num = a + b;  q = a + "+" + b; 
					break;
					case 2: num = a - b;  q = a + "-" + b; 
					break;
					case 3: num = a * b; q = a + "*" + b; 
					break;
					default : 
						num = a / b; q = a + "/" + b; 
					break;
				}
				int B = random.nextInt(4)%(4-1+1) + 1;
				switch(B){
					case 1: num = num + c;  q = q + "+" + c; 
					break;
					case 2: num = num - c;   q = q + "-" + c; 
					break;
					case 3: num = num * c;   q = q + "*" + c; 
					break;
					default :
						num = num / c;  q = q + "/" + c; 
					break;
				}
				
				int C = random.nextInt(4)%(4-1+1) + 1;
				switch(C){
					case 1: num = num + d;    q = q + "+" + d; 
					break;
					case 2: num = num - d;     q = q + "-" + d; 
					break;
					case 3: num = num * d;    q = q + "*" + d; 
					break;
					default :
						num = num / d;  q = q + "/" + d; 
					break;
				}
			}
			
			if(z == 5){
				//5个数，则产生4个运算符
				int A = random.nextInt(4)%(4-1+1) + 1;
				switch(A){
					case 1: num = a + b;   q = a + "+" + b; 
					break;
					case 2: num = a - b;   q = a + "-" + b;
					break;
					case 3: num = a * b;   q = a + "*" + b;
					break;
					default :
					num = a / b; q = a + "/" + b; 
					break;
				}
				int B = random.nextInt(4)%(4-1+1) + 1;
				switch(B){
					case 1: num = num + c;  q = q + "+" + c;
					break;
					case 2: num = num - c;  q = q + "-" + c;
					break;
					case 3: num = num * c; q = q + "*" + c;
					break;
					default : 
					num = num / c;  q = q + "/" + c; 
					break;
				}
				int C = random.nextInt(4)%(4-1+1) + 1;
				switch(C){
					case 1: num = num + d;    q = q + "+" + d; 
					break;
					case 2: num = num - d;      q = q + "-" + d; 
					break;
					case 3: num = num * d;      q= q + "*" + d; 
					break;
					default : 
					num = num / d;  q = q + "/" + d;  
					break;
				}
				int D = random.nextInt(4)%(4-1+1) + 1;
				switch(D){ 
					case 1:     q = q + "+" + e; 
					break; 
					case 2:     q = q + "-" + e; 
					break;
					case 3:     q = q + "*" + e; 
					break;
					default : 
								num = num / d;  q = q + "/" + e;  
					break;
				}
			}
			String hush=String.valueOf(jse.eval(q));
			Double result=Double.parseDouble(hush);
		
			if(result<0 || result%1!=0)  {   continue;  }   //结果不能为负数和非整数
			fop.write((q+"=" + jse.eval(q)).getBytes());    //写入表达式
	        fop.write("\r\n".getBytes());   //换行
	        System.out.println(q+"="+jse.eval(q));
			q="";    result=(double) 0;  i++; //重新置为空，重新开始
		}
		fop.close();  //关闭指针
	}

}
