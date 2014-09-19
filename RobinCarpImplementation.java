public class RobinCarpImplementation{
        public static void main(String[] args){
           String s = "I am implementing algo Robin Carp.";
           String sub = "algo";
           
           int result = robinCarpSearch(s,sub);
           System.out.println("Search result:"+result);
        }//main
        
        public static int robinCarpSearch(String s, String sub){
           int result = -1;
           int hSub = sub.hashCode();
           for(int i=0;i<s.length()-sub.length()-1;i++){
                String subString = s.substring(i,i + sub.length());
                if(hSub==subString.hashCode()){
                        result = i;
                        break;
                }//if
           }//for
           return result;
        }//robinCarpSearch
}
