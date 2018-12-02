package reinty.utils.mapper.generator.common;

import reinty.utils.mapper.generator.entity.SoEp;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 通过反射获取字段属性
 * Created by panyingting on 2018/11/29.
 */
public class FieldUtils {

    public static List<Field> getReadableFields(Class cla){
        Field[] fields = cla.getDeclaredFields();
        List<Field> fieldList = Arrays.stream(fields).filter(field -> hasReadMethod(field, cla)).collect(Collectors.toList());
        return fieldList;
    }

    private static boolean hasReadMethod(Field field, Class cla){
        try {
            PropertyDescriptor descriptor = new PropertyDescriptor(field.getName(), cla);
            return true;
        } catch (IntrospectionException e) {
            return false;
        }
    }

}
