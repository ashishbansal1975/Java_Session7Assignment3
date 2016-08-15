public class Session7Assignment3
{
    public static void main(String [] args) 
    {
       		
          try
          {
		String str = null;
		System.out.println(str.length());
	  }

        catch(NullPointerException e)
         {
		System.out.println("NullPointerException : "+ e);
	 }
    }
}