
package calculater;

import java.util.Scanner;


public class Calculater<T>{

   private T fst_num;
   private T sec_num;
   private T result;
   
   public Calculater(T num1,T num2)
   {
       fst_num=num1;
       sec_num=num2;
       
   }
   
   public boolean select_Operation()
   {
       Scanner cin=new Scanner(System.in);
      int input_val;
       //char ch='y';
       T res;
       do
       {
           System.out.println("Enter 1 for addition :");
           System.out.println("Enter 2 for subtraction :");
           System.out.println("Enter 3 for multiplication :");
           System.out.println("Enter 4 for division :");
           System.out.println("Enter 5 for EXIT");
             input_val=cin.nextInt();
      switch(input_val)
   {
        case 1: 
                System.out.println("\nEnter the first and second number");
                 res=addition();
                display(res);
                   break;
        
        case 2:
                System.out.println("\nEnter the first and second number");
               res= subtraction();
                display(res);
                break;
        
        case 3:
                System.out.println("\nEnter the first and second number");
               res=multiplication();
                display(res);
                break;
        
        case 4:
                System.out.println("\nEnter the first and second number");
               res= division();
                display(res);
                break;
        
        case 5: 
                return false;
        default :
        System.out.println("\nInvalid input");
    }
           
           System.out.println("Do you wanna perform more operation : Y|N");
           String ch=cin.next();
           if(ch.equals("Y"))
               return true;
           else
               return false;
           
       }while(true);
      
   }
   
   public void display(T ans)
   {
       System.out.println("The result is " +ans);
   }

//    private void Switch(int input_val) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//   
//           int op=input_val;
//           
//        switch(op)
//   {
//        case 1: 
//                System.out.println("\nEnter the first and second number");
//                System.out.println("\nAddition of two number is"+ addition());
//                   break;
//        
//        case 2:
//                System.out.println("\nEnter the first and second number");
//                System.out.println("\nAddition of two number is"+ subtraction());
//                break;
//        
//        case 3:
//                System.out.println("\nEnter the first and second number");
//                System.out.println("\nAddition of two number is"+ multiplication());
//                break;
//        
//        case 4:
//                System.out.println("\nEnter the first and second number");
//                System.out.println("\nAddition of two number is"+ division());
//                break;
//        
//        default :
//        System.out.println("\nInvalid input");
//    }
//    }
   
    public T addition()
    {
        result=fst_num+sec_num;
        return result;
    }
    
    public T subtraction()
    {
        result=fst_num-sec_num;
        return result;
    }
    
    public T multiplication()
    {
        result=fst_num*sec_num;
        return result;
    }
    public T division()
    {
        if(fst_num>sec_num)
        result=fst_num/sec_num;
        else
            result=sec_num/fst_num;
        return result;
    }
    
    
}
