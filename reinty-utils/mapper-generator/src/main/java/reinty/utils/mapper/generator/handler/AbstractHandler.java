package reinty.utils.mapper.generator.handler;

/**
 * Created by panyingting on 2018/12/1.
 */
public abstract class AbstractHandler {

    protected static final int CASE_DIFF = 32;

    public static String getColName(String filedName){
        StringBuilder sb = new StringBuilder(filedName.length());
        for(int i=0; i<filedName.length(); i++){
            char ch = filedName.charAt(i);
            if( ch >= 'A' && ch <= 'Z' ){
                ch = (char)(ch + CASE_DIFF);
                sb.append('_');
            }
            sb.append(ch);
        }
        return sb.toString();
    }

}
