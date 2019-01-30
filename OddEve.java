import java.util.*;
class OddEve
{
    Scanner y = new Scanner (System.in);
    char c1 ; 
    int cp = 0 ;
    int pp = 0 ;
    int tt = 0 ;
    boolean w = false ;
    char c2 ;
    int pt = 0 ;
    int ct = 0 ;
    
    OddEve()
    {
        
    }
    
    void main()
    {
        toss();
        match();
    }
    
    void toss()
    {
        System.out.println("ODD EVE ?!");
        System.out.println("Type 'O' for ODD or type 'E' for EVE");
        
        c1 = y.next().toUpperCase().charAt(0);
        
        cp = (int)(Math.rint(Math.random()*6));
        System.out.println("Enter a Number between 0 and 6 .");
        pp = y.nextInt();
        
        tt = cp+pp ;
        
        System.out.println("Player : " + pp);
        System.out.println("Computer : " + cp);
        System.out.println();
        System.out.println("Toss Total : " + tt);
        cp = (cp==pp)?((int)(Math.rint(Math.random()*6))):cp ;
        if((tt%2)==0 && c1=='E')
        w = true;
        else if((tt%2)!=0 && c1=='O')
        w = true;
        else
        w = false;
        
        if(w)
        {
            System.out.println("You won the toss!");
            System.out.println("Enter choice, type 'A' to 'BAT' first and type 'O' to 'BOWL' first.");
            c2 = y.next().toUpperCase().charAt(0);
        }
        else
        {
            System.out.println("Computer won the toss.");
            if(Math.random()>0.25)
            c2 = 'A';
            else
            c2 = 'B';
        }
        
    }
    
    void match()
    {
        if(w)
        {
            if(c2 == 'A')
            {
                System.out.println("You chose to Bat first.");
                System.out.println("Get Ready to Bat!");
                bat();
                cp = 0;
                pp = 1;
                System.out.println("Now get Ready to Bowl!");
                bowl();
            }
            else
            {
                System.out.println("You chose to Bowl first.");
                System.out.println("Get Ready to Bowl!");
                bowl();
                
                System.out.println();
                System.out.println("Computer : " + ct);
                System.out.println("Player : " + pt);
                System.out.println("You have to make at least " + (ct+1) + " runs to win.");
                
                cp = 0;
                pp = 1;
                System.out.println("Now get Ready to Bat!");
                bat();
            }
        }
        else
        {
            if(c2 == 'A')
            {
                System.out.println("Computer chose to Bowl first.");
                System.out.println("Get Ready to Bat!");
                bat();
                
                System.out.println();
                System.out.println("Computer : " + ct);
                System.out.println("Player : " + pt);
                System.out.println("Computer has to make at least " + (pt+1) + " runs to win.");
                
                cp = 0;
                pp = 1;
                System.out.println("Now get Ready to Bowl!");
                bowl();
            }
            else
            {
                System.out.println("Computer chose to Bat first.");
                System.out.println("Get Ready to Bowl!");
                bowl();
                cp = 0;
                pp = 1;
                System.out.println("Now get Ready to Bat!");
                bat();
            }
        }
        
        System.out.println();
        System.out.println("Computer : " + ct);
        System.out.println("Player : " + pt);
        System.out.println();
        
        if(ct > pt)
        System.out.println("Computer Wins!");
        else if(pt > ct)
        System.out.println("Player Wins!");
        else
        System.out.println("It's a Tie.");
    }
    
    void bat()
    {
        while(cp!=pp)
        {
            cp = (int)(Math.rint(Math.random()*6));
            System.out.println("Enter your choice between 0 and 6");
            pp = y.nextInt();
            System.out.println("Computer : " + cp);
            System.out.println("Player : " + pp);
            if(cp==pp)
            {System.out.println("Player OUT!");break;}
            pt += pp;
            if(c2 == 'O' && ct<=pt)
            break;
            System.out.println();
            System.out.println("Player runs : " + pt);
        }
    }
    
    void bowl()
    {
       while(cp!=pp)
        {
            cp = (int)(Math.rint(Math.random()*6));
            System.out.println("Enter your choice between 0 and 6");
            pp = y.nextInt();
            System.out.println("Computer : " + cp);
            System.out.println("Player : " + pp);
            if(cp==pp)
            {System.out.println("Computer OUT!");break;}
            ct += cp;
            if(c2 == 'A' && ct>=pt)
            break;
            System.out.println();
            System.out.println("Computer runs : " + ct);
        }
    }
}