package pt.ipp.estg.fpo.helloworldapp;





public class ex3 
{
    public static void main(String [] atgs)
    {
        boolean canITakeHisMoney;
        int hisBalance = 5;
        long myBalance = 4;
        hisBalance += 8;
        canITakeHisMoney = hisBalance > myBalance;
        canITakeHisMoney = canITakeHisMoney & (hisBalance >= 3);
        System.out.println(canITakeHisMoney);
        
    }
    
}
