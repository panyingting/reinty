package reinty.utils.mapper.generator.common;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by panyingting on 2018/12/1.
 */
public enum FieldTypeEnum {

    INTEGER(Integer.class, "INT"),
    STRING(String.class, "VARCHAR(200)"),
    BYTE(Byte.class, "TINYINT"),
    LONG(Long.class, "BIGINT"),
    FLOAT(Float.class, "FLOAT"),
    DOUBLE(Double.class, "DOUBLE"),
    BIGDECIMAL(BigDecimal.class, "DECIMAL"),
    DATE(Date.class, "DATE"),
    OBJECT(Object.class, "BIGINT");


    public final Class type;
    public final String jdbcType;

    FieldTypeEnum(Class type, String jdbcType){
        this.type = type;
        this.jdbcType = jdbcType;
    }

    public static FieldTypeEnum getInstance(Class cla){
        FieldTypeEnum[] ena = FieldTypeEnum.values();
        for(FieldTypeEnum fieldTypeEnum: ena){
            if(cla == fieldTypeEnum.type){
                return fieldTypeEnum;
            }
        }
        return OBJECT;
    }

}
