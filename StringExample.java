class n{  
	public static void main(String args[]){  
		String s1="say no to Java";
		String s2="yo yo";
		String s4="Yo yO";
		String s6=new String("yo yo");
		System.out.println("-------------------------------------------------");
		System.out.println(s1.charAt(3));
		System.out.println("-------------------------------------------------");
		System.out.println(s1.compareTo(s2));
		System.out.println("-------------------------------------------------");
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println("-------------------------------------------------");
		System.out.println(s1.contains("yo"));
		System.out.println("-------------------------------------------------");
		System.out.println(s1.endsWith("ava"));
		System.out.println("-------------------------------------------------");
		System.out.println(s1.equals(s2));	
		System.out.println("-------------------------------------------------");
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println("-------------------------------------------------");
		String s5=String.format("name of s1 %s",s1);
		System.out.println(s5);
		System.out.println("-------------------------------------------------");
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++){  
			System.out.println(barr[i]);  
		}  
		System.out.println("-------------------------------------------------");
		char[] ch = new char[10];  
		try{  
			s1.getChars(4, 10, ch, 0);  
			System.out.println(ch);  
		}
		catch(Exception ex){System.out.println(ex);} 
		System.out.println("-------------------------------------------------");
		int index1=s1.indexOf("is");
		System.out.println(index1);	
		System.out.println("-------------------------------------------------");
		String s13=s2.intern();
		System.out.println(s13==s2);
		System.out.println("-------------------------------------------------");
		System.out.println(s1.isEmpty());
		System.out.println("-------------------------------------------------");
		String s7=String.join("-","welcome","to","java");  
		System.out.println(s7);
		System.out.println("-------------------------------------------------");
		System.out.println(s1.lastIndexOf('o'));
		System.out.println("-------------------------------------------------");
		System.out.println("string length s1 is: "+s1.length());
		System.out.println("-------------------------------------------------");
		String s8=s1.replace('a','e');
		System.out.println(s8);
		System.out.println("-------------------------------------------------");
		String s11="My name is Khan. My name is Bob. My name is Sonoo.";  
		String s10=s11.replaceAll("is","was");
		System.out.println(s10);  
		System.out.println("-------------------------------------------------");
		String[] s9=s1.split("\\s");
		for(String w:s9){  
			System.out.println(w);  
		}  
		System.out.println("-------------------------------------------------");
		System.out.println(s1.startsWith("sa"));
		System.out.println("-------------------------------------------------");
		System.out.println(s1.substring(2,4));
		System.out.println("-------------------------------------------------");
		char[] ch1=s1.toCharArray();  
		for(int i=0;i<ch1.length;i++){  
			System.out.print(ch1[i]);  
		}
		System.out.println("-------------------------------------------------");
		System.out.println(s1.toLowerCase());
		System.out.println("-------------------------------------------------");
		System.out.println(s1.toUpperCase());
		System.out.println("-------------------------------------------------");
		System.out.println(s1.trim()+"PAgal");
		System.out.println("-------------------------------------------------");
		String s12=String.valueOf(s1.length());
		System.out.println("-------------------------------------------------");
		System.out.println(s12+50);
		System.out.println("-------------------------------------------------");
		System.out.println(s3);
		System.out.println("-------------------------------------------------");
	}
}
