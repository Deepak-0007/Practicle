class invaildException extends Exception{
    public invaildException( String str){
    super(str);
    }
}
public class custom_exception {
    static void checkage(int age) throws invaildException{
        if(age<18){
            throw new invaildException("you are not eligible for java");
        }
        else
        System.out.println("you are eligible for java");
    }
    public static void main(String[] args) {
        try{
            checkage(17);
        }
        catch(invaildException e){
            System.out.println(e);
        }
    }
    
}
