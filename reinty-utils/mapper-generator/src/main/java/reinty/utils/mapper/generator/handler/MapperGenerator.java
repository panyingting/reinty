package reinty.utils.mapper.generator.handler;

import reinty.utils.mapper.generator.common.FieldUtils;
import reinty.utils.mapper.generator.entity.taiwanLanshou.PostHouse;
import reinty.utils.mapper.generator.handler.AbstractHandler;
import reinty.utils.mapper.generator.handler.CreateTableHandler;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Created by panyingting on 2018/11/29.
 */
public class MapperGenerator extends AbstractHandler {

    private static final int CASE_DIFF = 32;
    public static void generatorMapperByFields(Class cla){

        System.out.println("------------------生成更新语句------------------------");
        List<Field> fields = FieldUtils.getReadableFields(PostHouse.class);
        List<String> filedNameList = fields.stream().map(Field::getName).collect(Collectors.toList());
        filedNameList.forEach(name->{
            System.out.println(getUpdateStatement(name));
        });

        System.out.println("\n");
        System.out.println("------------------生成MapResult-------------------------");
        filedNameList.forEach(name->{
            System.out.println(getresultMapLine(name));
        });



    }

    private static String getUpdateStatement(String fieldName){
        StringBuilder buffer = new StringBuilder(60);
        String colName = getColName(fieldName);
        buffer.append("<if test=\" ").append(fieldName).append(" != null \">\n");
        buffer.append("\t").append(colName).append(" = #{").append(fieldName).append("},\n");
        buffer.append("</if>");
        return buffer.toString();
    }

    private static String getresultMapLine(String fieldName){
        String colName = getColName(fieldName);
        return "<result property=\""+fieldName+"\" column=\""+colName+"\"/>";
    }







}
