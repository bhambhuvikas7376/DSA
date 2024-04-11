package basic;

//import java.lang.reflect.Array;
//import java.util.Arrays;

public class frequency {

	public static void main(String[] args) {
		String string="1213356321232123";
		
		int[] frequency=new int[string.length()];
		
		char[] str=string.toCharArray();
	   
		for(int i=0;i<string.length();i++)
		{
			frequency[i]=1;
			for(int j=i+1;j<string.length();j++)
			{
				if(str[i]==str[j])
				{
					frequency[i]++;
					str[j]=0;
				}
			}
		}
		
		
		for(int i=0;i<frequency.length;i++)
		{
			if(str[i]!=' ' && str[i]!=0)
			{
				
				System.out.println(str[i] + " " +frequency[i]);
			}
		}
	}

}
