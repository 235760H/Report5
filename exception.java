public class exception {
    public static void main(String[] args){
        try{
        String str = "壱百満";
        int s = Integer.parseInt(str);
        System.out.println(s);
        } catch (NumberFormatException str){
        System.out.println("NumberFormatExceptionが発生しました。");
        }
    }
}
