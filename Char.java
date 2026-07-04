public class Char{
    public static void main(String[] args){
        char val='A';
        if((val>= 'a' && val<='Z') || (val>='A' && val<='Z')){
            System.out.println("Alphabet");
        }else if(val>='0' && val<='9'){
            System.out.println("Digit");
        }else{
            System.out.println("Special Character");
        }
    }
}