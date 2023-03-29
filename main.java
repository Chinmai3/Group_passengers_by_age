import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int agegroup[]=new int[6];                     //stores the cnt of passengers with respect to their age group.
        int passengerAges[]={13,45,76,56,54,34,56,78};
        
        for(int age: passengerAges)
        {
            if(age<=10)
            {
                agegroup[0]++;
            }
            else if(age>10 && age<=20)
            {
                agegroup[1]++;
            }
            else if(age>20 && age<=30)
            {
                agegroup[2]++;
            }
            else if(age>30 && age<=40)
            {
                agegroup[3]++;
            }
            else if(age>40 && age<=50)
            {
                agegroup[4]++;
            }
            else agegroup[5]++;
        }
        
       //output the age group and their cnt
       
        System.out.println("Agegroup : cnt");
        System.out.println("0-10\t"+agegroup[0]);
        System.out.println("11-20\t"+agegroup[1]);
        System.out.println("21-30\t"+agegroup[2]);
        System.out.println("31-40\t"+agegroup[3]);
        System.out.println("41-50\t"+agegroup[4]);
        System.out.println("50 + \t"+agegroup[5]);
    }
}
