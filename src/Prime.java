
public class Prime {
//  declaring input variable
int input;

// creating prime constructor
 public Prime(){
	
}

 //constructor with input as a parameter
public Prime(int input) {
		this.input = input;
}

// method to find prime number
public void isPrime(int input){
	int i;
    int temp=0;
    // loop that performs input times of iterations 
    for(i=1;i<=input;i++)
    {
    	 // condition to divide input by each iterator value
    	if(input%i==0)
    	{
    		// for each iteration where if condition is satisfied temp value is added by 1 
    		temp=temp+1;
    	}
    }
        // if temp value is equals to 2 i.,e (input is divided successfully by 
    // iterator value and produces zero as remainder)
    	if(temp==2)
    	{
    		// prints that given input is prime
    		System.out.println(input+" "+"is prime");
    	}
    	// otherwise if condition fails
    		else
    		{
    			// prints that input is not prime 
    			System.out.println(input+" "+"is not prime");
    		}
                
	             
     }
}