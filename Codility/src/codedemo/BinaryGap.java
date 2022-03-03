package codedemo;

public class BinaryGap {
	 public int solution(int n) {
	       
	        int finalGap=0;
	        if (n==1){
	            return 0;
	        }
	        char binaryRep []=Integer.toBinaryString(n).toCharArray();
	        int tempgap=0;

	        for(int i=0;i< binaryRep.length;i++)
	        {
	            if(binaryRep[i]=='0'){
	                tempgap++;
	                continue;
	            }else if(binaryRep[i]=='1')
	            {
	                if(tempgap>finalGap)
	                finalGap=tempgap;
	                tempgap=0;
	            }

	            }
	               return finalGap;
	    }
	              public static void main(String[] args) {
					
				}

}
