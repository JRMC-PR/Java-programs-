/*Jesus R. Mendez Cruz 
*S01105428
*CPEN 358
*/
import java.util.Scanner;

/**
 * 
 */
public class MobileServiceProviderDraft
{
    /**
     * Calculate the monthly bill of the services
     * @return Returns the total bill cost for the month
     */
    public static double monBill()
    { 
        final double tax = 0.12;
        final double fcc = 7.54;

        return 0;
    }

    /**
     * Calculate the extra Gb costs
     * @param gbIn
     * @param m
     */
    public static double gbCal(int gbIn, int m )
    { 
        double aditGb = 0;
          switch (m)
        { 
            case 1: 
                    double planGb = 5;
                    aditGb = ((gbIn - planGb)*15); 
                    break;
                    
            case 2:
                   planGb = 10;
                   aditGb = ((gbIn - planGb)*10);
                   break;
        }//end switch 
         
        return aditGb;
    }

    public static void main(String[] args)
    { 
        double totalGb;
        String p = "";
        Scanner t = new Scanner(System.in);
        do//this do will make the program able do go backk to the begining
        {   /*The following prints will shor the user
            *the menu options for the plans available  */
            System.out.println("**********WELCOME TO UAGM MOBILE**********"+"\n");
            System.out.println("We have the following offer packs"+"\n");
            System.out.println("Pack A: $50/month, 5GB data provided"+"\n"+
                               "Additional $15 per extra GB."+"\n"+"\n"+
                               "Pack B: $65/month, 10GB data provided"+"\n"+
                               "Additional $10 per extra GB."+"\n"+"\n"+
                               "Pack C: $75/month, unlimited data."+"\n"+"\n"+
                               "***EVERY PACK INCLUDES UNLIMITED CALLS AND TEXT'S***");
            System.out.println("Witch one would you like?: 1 for A , 2 for B , 3 for C ? ");

            int m = t.nextInt();//thin variable will manage the menu selection
            while(m < 1 || m >4)//This if statement will verify that the option ientered is alid 
            { 
                    //will prompt the user to enter an option again 
                System.out.println("**INVALID OPTION**"+"\n"+"\n"+
                                    " Enter 1 for A , 2 for B , 3 for C ");
                                    m = t.nextInt();
                                    
            }
            t.nextLine();//ignoring ultil the end of the line 

            switch(m)
            {
                case 1: 
                int gbIn = 0 ;
                double extraChrages = 0 ;

                /**
                    * The following section will ask the user a series of questions 
                    * regarding what he/she would like to add to their plan 
                    * 1) the total GB they would like to include 
                    * 2) if they would like roing 
                    * 3) if they would like long distance calls 
                    * and store the added equivalent to the pice in a variable
                    * called extraCharges
                    */ 
                    //1
                    System.out.println("This plan is: $50/month with 5GB "+"\n"+
                                        "would you lime to add more GB's?"+"\n"+
                                        "yes(y)/no(n)?");
                           
                            p = t.nextLine();
                            if(p.toLowerCase().charAt(0) == 'y')
                            {
                                System.out.println("How Gb in total would you like to have in the plan?");
                                gbIn = t.nextInt();
                                t.nextLine();
                            }
                        //2
                        System.out.println("Would you like to add roming servies "+"\n"+
                                            " for an extra $10? yes(y)/no(n)");
                            
                            p = t.nextLine();
                            if(p.toLowerCase().charAt(0) == 'y')
                            {
                                extraChrages += 10 ; 
                            }  
                        //3              
                        System.out.println("Would you like to add long distance servies "+"\n"+
                            " for an extra $5? yes(y)/no(n)");
                            p = t.nextLine();
                            if(p.toLowerCase().charAt(0) == 'y')
                            {
                                extraChrages += 5; 
                            } 
                        /*
                        *
                        */
                    totalGb = gbCal(gbIn, m);
                    System.out.println(totalGb);
                    break;





            }//end swith 

              
               

            System.out.println("Witch one would you like?: A , B , C ? ");



            //will ask he user is he/she wants to try again 
            System.out.println("would you like to try again yes(y)/no(n) ?");
            p = t.nextLine();
        } while (p.toLowerCase().charAt(0) == 'y');//end do


        t.close();//Closes the scanner 
    }//end main   
}//end class
