package Arraylist;

import java.util.*;
import java.awt.SystemColor;
import java.io.*;


public class Practice {

	public static void main(String[] args) {
		 String s="12:01:45AM";
	      char[] arr=s.toCharArray();
	    if(arr[arr.length-2]=='A' && arr[0]=='1' && arr[1]=='2')
	    {
	        arr[0]='0';
	        arr[1]='0';
	        char[] arr1=Arrays.copyOfRange(arr, 0, arr.length-2);
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<arr1.length;i++)
	        {
	            sb.append(arr1[i]);
	        }
	        
	        System.out.println(sb.toString());
	    }

	}

}
