//http://www.codechef.com/problems/COOLING


import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main (String[] args) throws IOException
	{
		int t, n, i, j, k, temp, count;
		ArrayList<Integer> pieWeight = new ArrayList<Integer>();
		ArrayList<Integer> rackWeight =  new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		
		t=s.nextInt();
		
		for(i=0; i<t; i++){
			
			n=s.nextInt();
			
			for(j=0; j<n; j++)
				pieWeight.add(j, s.nextInt());
			
			for(j=0; j<n; j++)
			    rackWeight.add(j, s.nextInt());
		
		        
			for (j=0; j<n-1; j++) {
                 for (k=0; k<n-j-1; k++) {
                    if (pieWeight.get(k) < pieWeight.get(k+1))
                    {
                        temp = pieWeight.get(k);
                        pieWeight.set(k, pieWeight.get(k+1));
                        pieWeight.set(k+1, temp);
                        
                    }
                }
            }
			
			for (j=0; j<n-1; j++) {
                 for (k=0; k<n-j-1; k++) {
                    if (rackWeight.get(k) < rackWeight.get(k+1))
                    {
                        temp = rackWeight.get(k);
                        rackWeight.set(k, rackWeight.get(k+1));
                        rackWeight.set(k+1, temp);
                        
                    }
                }
            }
            
           
		        
            j=0;
            k=0;
            count=0;
            
            while(!pieWeight.isEmpty()){
                
            	if(pieWeight.get(j)<=rackWeight.get(k)){
            	    
            	    rackWeight.remove(k);
            		count++;
            		
            	}
            	
            	pieWeight.remove(j);
            	
            }
            
            System.out.println(count);
            
		}
	}
}
