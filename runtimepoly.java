
public class runtimepoly {
public static void main(String[] args) {
    java_student js;
    js=new Deepak();
    System.out.println("quality of Deepak " +js.quality());
}    
}
class java_student{
    String quality(){
        return null;
    }
}
class Deepak extends java_student{
    String quality(){
    return "Lazy";
    }
}
