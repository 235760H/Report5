public class exception {
    public static void main(String[] args){
        try{
        String str = null;
        System.out.println(str.length());
        } catch (NullPointerException str){
        System.out.println("NullPointerExceptionが発生しました。");
        System.out.println(str.getMessage());
        }        
    }
}
