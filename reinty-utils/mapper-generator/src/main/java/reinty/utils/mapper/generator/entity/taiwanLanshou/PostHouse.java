package reinty.utils.mapper.generator.entity.taiwanLanshou;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by panyingting on 2018/11/30.
 */
public class PostHouse {


    private Long id;                        //  主键
    private	String	postName	;           //	驿站名称
    private	String	postAdds	;           //	驿站地址
    private	Double	longitude	;           //	经度
    private	Double	 latitude	;           //	纬度
    private	String	postCity	;           //	驿站所在城市
    private	String	contact	;               //	驿站联系人
    private	String	phone	;               //	驿站联系方式
    private	Byte	region	;               //	驿站区域类型
    private BigDecimal limit1	;           //	单件限额
    private	BigDecimal	limit2	;           //	多件限额
    private	BigDecimal	insuranceRate	;   //	价保比率
    private	String	customsId	;   //	清关口岸
    private	String	customsMode	;   //	清关模式
    private	String	serviceProvider	;  //	服务商名称
    private	String	providersId	;   //	服务商编码
    private	String	customsAdr	;   //	口岸场站地址
    private	String	warehouseNo	;   //	EC仓号
    private	String	warehouseName	;  //	EC仓名称
    private String remark;              // 备注
    private String ext1;                // 预留字段
    private Byte yn;                    // 删除标志：1-否；0-是
    private java.util.Date createTime;  // 创建时间
    private java.util.Date updateTime;   // 修改时间
    private String createUser;          // 创建人
    private String updateUser;          // 修改人


    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostAdds() {
        return postAdds;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public void setPostAdds(String postAdds) {
        this.postAdds = postAdds;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getPostCity() {
        return postCity;
    }

    public void setPostCity(String postCity) {
        this.postCity = postCity;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Byte getRegion() {
        return region;
    }

    public void setRegion(Byte region) {
        this.region = region;
    }

    public BigDecimal getLimit1() {
        return limit1;
    }

    public void setLimit1(BigDecimal limit1) {
        this.limit1 = limit1;
    }

    public BigDecimal getLimit2() {
        return limit2;
    }

    public void setLimit2(BigDecimal limit2) {
        this.limit2 = limit2;
    }

    public BigDecimal getInsuranceRate() {
        return insuranceRate;
    }

    public void setInsuranceRate(BigDecimal insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    public String getCustomsId() {
        return customsId;
    }

    public void setCustomsId(String customsId) {
        this.customsId = customsId;
    }

    public String getCustomsMode() {
        return customsMode;
    }

    public void setCustomsMode(String customsMode) {
        this.customsMode = customsMode;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getProvidersId() {
        return providersId;
    }

    public void setProvidersId(String providersId) {
        this.providersId = providersId;
    }

    public String getCustomsAdr() {
        return customsAdr;
    }

    public void setCustomsAdr(String customsAdr) {
        this.customsAdr = customsAdr;
    }

    public String getWarehouseNo() {
        return warehouseNo;
    }

    public void setWarehouseNo(String warehouseNo) {
        this.warehouseNo = warehouseNo;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public static String getComments(){
        return " private Long id;                        //  主键\n" +
                "    private\tString\tpostName\t;           //\t驿站名称\n" +
                "    private\tString\tpostAdds\t;           //\t驿站地址\n" +
                "    private\tDouble\tlongitude\t;           //\t经度\n" +
                "    private\tDouble\t latitude\t;           //\t纬度\n" +
                "    private\tString\tpostCity\t;           //\t驿站所在城市\n" +
                "    private\tString\tcontact\t;               //\t驿站联系人\n" +
                "    private\tString\tphone\t;               //\t驿站联系方式\n" +
                "    private\tByte\tregion\t;               //\t驿站区域类型\n" +
                "    private BigDecimal limit1\t;           //\t单件限额\n" +
                "    private\tBigDecimal\tlimit2\t;           //\t多件限额\n" +
                "    private\tBigDecimal\tinsuranceRate\t;   //\t价保比率\n" +
                "    private\tString\tcustomsId\t;   //\t清关口岸\n" +
                "    private\tString\tcustomsMode\t;   //\t清关模式\n" +
                "    private\tString\tserviceProvider\t;  //\t服务商名称\n" +
                "    private\tString\tprovidersId\t;   //\t服务商编码\n" +
                "    private\tString\tcustomsAdr\t;   //\t口岸场站地址\n" +
                "    private\tString\twarehouseNo\t;   //\tEC仓号\n" +
                "    private\tString\twarehouseName\t;  //\tEC仓名称\n" +
                "    private String remark;              // 备注\n" +
                "    private String ext1;                // 预留字段\n" +
                "    private Byte yn;                    // 删除标志：1-否；0-是\n" +
                "    private java.util.Date createTime;  // 创建时间\n" +
                "    private java.util.Date updateTime;   // 修改时间\n" +
                "    private String createUser;          // 创建人\n" +
                "    private String updateUser;          // 修改人";
    }
}
