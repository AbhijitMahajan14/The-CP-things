class HighestOccur{
    public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
        int flag=1;
        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<str.length();j++){//aaa
                char a=str.charAt(i);
                char b=str.charAt(j);
                if(a==b)
                {
                   flag++;
                }
                break;

            }
           

        }
        return flag;
       
	}
	
	public static void main(String args[]){
	    String str = "avm";
	    System.out.println(findHighestOccurrence(str));
	}
}