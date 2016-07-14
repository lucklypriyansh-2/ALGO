

public class StringTONumber {

	
	
	public static void main(String... args)
	{
		
		convert_String_To_Number("-123");
		
	}
	
	public static int convert_String_To_Number(String  Stringnumber){
        
        char ch[] = Stringnumber.toCharArray();
        int sum = 0;
        
        int zeroAscii = (int)'0';
        for(int i=1;i<ch.length;i++){
            int tmpAscii = (int)ch[i];
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        
        if(ch[0]=='-')
        	sum=-sum;
      
        return sum;
    }

}
