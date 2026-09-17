class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class ExceptionHandlingDemo{
    public static void  validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Access denied:You must be at least 18 years old.");
        }else{
            System.out.println("Access granted:Age verified.");
        }
    }
    public static void main(String[]args){
        int[] userAges={21,15};
        for(int age:userAges){
            System.out.println("\nChecking age:"+age);
        
        try{
            validateAge(age);
            if(age==21){
                int result=10/0;
            }
        }
        catch(InvalidAgeException e){
            System.out.println("Custom exception caught:"+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Runtime exception caught:cannot divide by zero.");
        }
        catch(Exception e){
            System.out.println("General Exception caught:"+e.getMessage());
        }
        finally{
            System.out.println("cleanup:Age check processing completed");
        }
      }
    }
}