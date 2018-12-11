package reinty.utils.mapper.generator.handler;

import reinty.utils.mapper.generator.common.FieldTypeEnum;
import reinty.utils.mapper.generator.common.FieldUtils;
import reinty.utils.mapper.generator.index.PrimaryKey;
import reinty.utils.mapper.generator.index.UniqueKey;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 创建Create Table 语句
 * Created by panyingting on 2018/12/1.
 */
public class CreateTableHandler extends AbstractHandler{


    public static String getCreateStatement(Class cla, String comments){
        List<Field> fieldList = FieldUtils.getReadableFields(cla);
        StringBuilder buff = new StringBuilder(256);

        buff.append("CREATE TABLE `").append(getTableName(cla)).append("` (\n");
        buff.append(getCreateLine(fieldList, comments));
        buff.append(");");
        return buff.toString();
    }

    private static String getCreateLine(List<Field> fieldList, String comments){

        Map<String, String> commentMap = getCommentMap(comments);

        StringBuilder buff = new StringBuilder(fieldList.size() * 30);
        for(Field field: fieldList){
            Class type = field.getType();
            FieldTypeEnum typeEnum = FieldTypeEnum.getInstance(type);

            String colName = AbstractHandler.getColName(field.getName());
            buff.append('\t').append(colName).append("  ")
                    .append(typeEnum.jdbcType).append("  ")
                    .append("comment \"").append(commentMap.get(field.getName())).append("\",\n");
        }
        buff.delete(buff.length()-2, buff.length()-1);
        return buff.toString();
    }

    private static String getTableName(Class cla){
        String name = cla.getSimpleName();
        StringBuilder buff = new StringBuilder(name.length());
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(ch >= 'a' && ch <='z'){
                ch = (char)(ch - CASE_DIFF);
            }
            else if(ch >= 'A' && ch <= 'Z'){
                buff.append('_');
            }
            buff.append(ch);
        }
        if(buff.charAt(0) == '_'){
            buff.deleteCharAt(0);
        }
        return  buff.toString();
    }

    /**
     * 获取注释
     * @param commentStr 字段注释字符串
     * @return  返回map集合
     */
    private static Map<String, String> getCommentMap(String commentStr){
        Map<String, String> map = new HashMap<>();
        Pattern pattern = Pattern.compile("^\\s*private\\s+(\\w+||\\w+\\.\\S+)\\s+(\\w+||\\w+.\\S+)\\s*;\\s*//.*$");
        String[] comments = commentStr.split("\n");
        for(int i=0; i< comments.length; i++){
            String line = comments[i];
            if(line.contains("private") && line.contains("//")){
                int slashIndex = line.indexOf("//");
                String comment = line.substring(slashIndex+2);
                comment = comment.trim();
                Matcher matcher = pattern.matcher(line);
                if(matcher.find()){
                    String fileName = matcher.group(2);
                    map.put(fileName, comment);
                }

            }
        }
        return map;
    }

    private String getIndex(List<Field> fieldList){
        Map<String, String> compositeIndexMap = new HashMap<String, String>();
        for(Field field: fieldList){
            PrimaryKey primaryKey = field.getAnnotation(PrimaryKey.class);
            if(primaryKey != null){
            }
        }

        return null;
    }

}
