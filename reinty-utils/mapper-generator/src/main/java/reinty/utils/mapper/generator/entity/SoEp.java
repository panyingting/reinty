package reinty.utils.mapper.generator.entity;


/**
 *
 * @version 1.0
 * @since 1.0
 * */
public class SoEp  implements java.io.Serializable{
    private static final long serialVersionUID = 1L;

    //可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
    //columns START
    /**
     * 主键       db_column: id
     */
    private Long id;
    /**
     * 订单号(订单号和包裹号保持一致)       db_column: so_no
     */
    private String soNo;
    /**
     * 包裹号       db_column: package_no
     */
    private String packageNo;
    /**
     * 订单来源：1-快速下单；2-批量下单；3-ISV下单       db_column: so_source
     */
    private String soSource;
    /**
     * 订单状态       db_column: so_status
     */
    private String soStatus;
    /**
     * seller表主键       db_column: seller_id
     */
    private Long sellerId;
    /**
     * JD商家ID       db_column: jd_seller_id
     */
    private Long jdSellerId;
    /**
     * 销售主站订单号       db_column: sales_platform_so_no
     */
    private String salesPlatformSoNo;
    /**
     * 销售主站       db_column: sales_site
     */
    private String salesSite;
    /**
     * 发货站订单号       db_column: ship_site_so_no
     */
    private String shipSiteSoNo;
    /**
     * 发货主站       db_column: ship_site
     */
    private String shipSite;
    /**
     * 订单类型：1-自营；2-ECLP；3-POP       db_column: so_type
     */
    private Byte soType;
    /**
     * 是否取消：1-是；0-否       db_column: is_cancelled
     */
    private Byte isCancelled;
    /**
     * 拒收原因       db_column: refuse_reason
     */
    private String refuseReason;
    /**
     * 物流网关用户       db_column: logistics_gateway_user
     */
    private String logisticsGatewayUser;
    /**
     * 取消原因       db_column: cancel_reason
     */
    private String cancelReason;
    /**
     * 收件人国家       db_column: ship_to_country
     */
    private String shipToCountry;
    /**
     * 京东渠道编码       db_column: jd_channel_code
     */
    private String jdChannelCode;
    /**
     * 是否货到付款：1-是；0-否       db_column: is_cod
     */
    private Byte isCod;
    /**
     * 京东运单号       db_column: jd_waybill_no
     */
    private String jdWaybillNo;
    /**
     * JD店铺ID       db_column: jd_store_id
     */
    private Long jdStoreId;
    /**
     * 店铺名称       db_column: jd_store_name
     */
    private String jdStoreName;
    /**
     * 外部运单号       db_column: out_waybill_no
     */
    private String outWaybillNo;
    /**
     * 备注       db_column: remark
     */
    private String remark;
    /**
     * 创建时间       db_column: create_time
     */

    private java.util.Date createTime;
    /**
     * 修改时间       db_column: update_time
     */

    private java.util.Date updateTime;
    /**
     * 创建人       db_column: create_user
     */
    private String createUser;
    /**
     * 修改人       db_column: update_user
     */
    private String updateUser;
    /**
     * 删除标志：1-否；0-是       db_column: yn
     */
    private Byte yn;
    /**
     * 时间戳       db_column: ts
     */
    private java.util.Date ts;
    /**
     * 版本号       db_column: version
     */
    private Byte version;
    /**
     * 预留字段1       db_column: reserve1
     */
    private String reserve1;
    /**
     * 预留字段2       db_column: reserve2
     */
    private String reserve2;
    /**
     * 是否为测试数据：0-否；1-是       db_column: test
     */
    private Byte test;
    /**
     * 处理标志：0-待处理；1-已处理       db_column: ep_handle
     */
    private Byte epHandle;
    //columns END

    public SoEp(){
    }

    public SoEp(Long id){
        this.id = id;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public Long getId() {
        return this.id;
    }

    public void setSoNo(String value) {
        this.soNo = value;
    }

    public String getSoNo() {
        return this.soNo;
    }

    public void setPackageNo(String value) {
        this.packageNo = value;
    }

    public String getPackageNo() {
        return this.packageNo;
    }

    public void setSoSource(String value) {
        this.soSource = value;
    }

    public String getSoSource() {
        return this.soSource;
    }

    public void setSoStatus(String value) {
        this.soStatus = value;
    }

    public String getSoStatus() {
        return this.soStatus;
    }

    public void setSellerId(Long value) {
        this.sellerId = value;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public void setJdSellerId(Long value) {
        this.jdSellerId = value;
    }

    public Long getJdSellerId() {
        return this.jdSellerId;
    }

    public void setSalesPlatformSoNo(String value) {
        this.salesPlatformSoNo = value;
    }

    public String getSalesPlatformSoNo() {
        return this.salesPlatformSoNo;
    }

    public void setSalesSite(String value) {
        this.salesSite = value;
    }

    public String getSalesSite() {
        return this.salesSite;
    }

    public void setShipSiteSoNo(String value) {
        this.shipSiteSoNo = value;
    }

    public String getShipSiteSoNo() {
        return this.shipSiteSoNo;
    }

    public void setShipSite(String value) {
        this.shipSite = value;
    }

    public String getShipSite() {
        return this.shipSite;
    }

    public void setSoType(Byte value) {
        this.soType = value;
    }

    public Byte getSoType() {
        return this.soType;
    }

    public void setIsCancelled(Byte value) {
        this.isCancelled = value;
    }

    public Byte getIsCancelled() {
        return this.isCancelled;
    }

    public void setRefuseReason(String value) {
        this.refuseReason = value;
    }

    public String getRefuseReason() {
        return this.refuseReason;
    }

    public void setLogisticsGatewayUser(String value) {
        this.logisticsGatewayUser = value;
    }

    public String getLogisticsGatewayUser() {
        return this.logisticsGatewayUser;
    }

    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    public String getCancelReason() {
        return this.cancelReason;
    }

    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    public String getShipToCountry() {
        return this.shipToCountry;
    }

    public void setJdChannelCode(String value) {
        this.jdChannelCode = value;
    }

    public String getJdChannelCode() {
        return this.jdChannelCode;
    }

    public void setIsCod(Byte value) {
        this.isCod = value;
    }

    public Byte getIsCod() {
        return this.isCod;
    }

    public void setJdWaybillNo(String value) {
        this.jdWaybillNo = value;
    }

    public String getJdWaybillNo() {
        return this.jdWaybillNo;
    }

    public void setJdStoreId(Long value) {
        this.jdStoreId = value;
    }

    public Long getJdStoreId() {
        return this.jdStoreId;
    }

    public void setJdStoreName(String value) {
        this.jdStoreName = value;
    }

    public String getJdStoreName() {
        return this.jdStoreName;
    }

    public void setOutWaybillNo(String value) {
        this.outWaybillNo = value;
    }

    public String getOutWaybillNo() {
        return this.outWaybillNo;
    }

    public void setRemark(String value) {
        this.remark = value;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setCreateTime(java.util.Date value) {
        this.createTime = value;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setUpdateTime(java.util.Date value) {
        this.updateTime = value;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setCreateUser(String value) {
        this.createUser = value;
    }

    public String getCreateUser() {
        return this.createUser;
    }

    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    public String getUpdateUser() {
        return this.updateUser;
    }

    public void setYn(Byte value) {
        this.yn = value;
    }

    public Byte getYn() {
        return this.yn;
    }

    public void setTs(java.util.Date value) {
        this.ts = value;
    }

    public java.util.Date getTs() {
        return this.ts;
    }

    public void setVersion(Byte value) {
        this.version = value;
    }

    public Byte getVersion() {
        return this.version;
    }

    public void setReserve1(String value) {
        this.reserve1 = value;
    }

    public String getReserve1() {
        return this.reserve1;
    }

    public void setReserve2(String value) {
        this.reserve2 = value;
    }

    public String getReserve2() {
        return this.reserve2;
    }

    public void setTest(Byte value) {
        this.test = value;
    }

    public Byte getTest() {
        return this.test;
    }

    public void setEpHandle(Byte value) {
        this.epHandle = value;
    }

    public Byte getEpHandle() {
        return this.epHandle;
    }

}
