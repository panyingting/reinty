package reinty.utils.mapper.generator.index;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by panyingting on 2018/12/1.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Index {
    String name() default "";
}
