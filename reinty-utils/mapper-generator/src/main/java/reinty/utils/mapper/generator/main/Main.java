package reinty.utils.mapper.generator.main;

import reinty.utils.mapper.generator.entity.taiwanLanshou.FreightRule;
import reinty.utils.mapper.generator.entity.taiwanLanshou.PostHouse;
import reinty.utils.mapper.generator.handler.CreateTableHandler;
import reinty.utils.mapper.generator.handler.MapperGenerator;

/**
 * Created by panyingting on 2018/11/29.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Generator Mapper...........");

//        System.out.println(PostHouse.class.getClassLoader().getResource("./").getPath());

        MapperGenerator.generatorMapperByFields(PostHouse.class);

        System.out.println("\n");
        System.out.println("-------------------生成 Create 语句--------------------");
        String createStatement = CreateTableHandler.getCreateStatement(FreightRule.class, FreightRule.getComments());
        System.out.println(createStatement);


    }

    private static boolean equalClass(Class cla){
        return cla == int.class;
    }
}
