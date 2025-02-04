class customException extends  Exception{
    public customException(String str){
        super("Reddy");
        System.out.println(str);
    }
}




public class Custom_Exception {
    public static void main(String[] args) {
        try{
            throw new customException("Avinash");
    
        }catch(customException e){
            System.out.println(e.getMessage());
        }
        
    }

    
    
}
