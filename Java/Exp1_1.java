import java.util.Scanner;
public class Exp1_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); System.out.println("Enter Employee Eid: "); 
        int eid=sc.nextInt();
        String empname[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String joindate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
        char desigcode[]={'e','c','k','f','m','e', 'c'};
        String dept[]={"R&D","PM","ACC","FRONTDESK","ENGG","MANUFACTURER", "PM"};
        int basic[]={20000,30000,10000,12000,50000,23000, 29000};
        int hra[]={8000,12000,8000,6000,2000,9000, 12000};
        int it[]={3000,9000,1000,2000,20000,4400,10000};
        String[] desig=new String[7];
        int[] da=new int[7];
        for (int i=0;i<7;i++)
        {
            if(desigcode[i]=='e')
            { da[i]=20000;
              desig[i]="Engineer";
            }
            else if(desigcode[i]=='c')
            { 
                da[i]=32000;
                desig[i]="Consultant";
            }
            else if(desigcode[i]=='k')
            { 
                da[i]=12000;
                desig[i]="Clerk";
            }else if(desigcode[i]=='r')
            { 
                da[i]=15000;
                desig[i]="Receptionist";
            }
            else if(desigcode[i]=='m')
            { 
                da[i]=40000;
                desig[i]="Manager";
            }
        }
        int i=eid-1001;
        int[] salary=new int[7]; 
        for (i=0;i<7;i++)
        {
            salary[i]=basic[i]+hra[i]+da[i]-it[i];
        }
        switch(eid)
        {
            case 1001:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+"\t"+empname[0]+" "+dept[0]+" "+desig[0]+" "+salary[0]);
                break; 
            case 1002:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+" "+empname[1]+" "+dept[1]+" "+desig[1]+" "+salary[1]);
                break; 
            case 1003:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+"\t"+empname[2]+"\t"+" "+dept[2]+"\t"+"\t"+desig[2]+"\t"+"\t"+salary[2]);
                break; 
            case 1004:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+" "+empname[3]+" "+dept[3]+" "+desig[3]+" "+salary[3]);
                break; 
            case 1005:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+" "+empname[4]+" "+dept[4]+" "+desig[4]+" "+salary[4]);
                break; 
            case 1006:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+" "+empname[5]+" "+dept[5]+" "+desig[5]+" "+salary[5]);
                break;
            case 1007:
                System.out.println("EmpNo."+"\t"+"EmpName"+"\t"+" "+"Department"+"\t"+"Designation"+"\t"+"Salary");
                System.out.println(eid+" "+empname[6]+" "+dept[6]+" "+desig[6]+" "+salary[6]);
                break;
            default:
                System.out.println("There is no employee with empid :" +eid);
        }
    }
}

