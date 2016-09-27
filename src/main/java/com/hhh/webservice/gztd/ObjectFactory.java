//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.19 ʱ�� 03:02:38 PM CST 
//


package com.hhh.webservice.gztd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hhh.webservice.gztd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryDeptList_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryDeptList");
    private final static QName _QueryDeptListResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryDeptListResponse");
    private final static QName _QueryMonitorByDeptId_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryMonitorByDeptId");
    private final static QName _QueryMonitorByDeptIdResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryMonitorByDeptIdResponse");
    private final static QName _QueryMonitorList_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryMonitorList");
    private final static QName _QueryMonitorListResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryMonitorListResponse");
    private final static QName _QueryProjectForHNT_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryProjectForHNT");
    private final static QName _QueryProjectForHNTResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryProjectForHNTResponse");
    private final static QName _QueryProjectForPage_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryProjectForPage");
    private final static QName _QueryProjectForPageResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryProjectForPageResponse");
    private final static QName _QueryUnitList_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryUnitList");
    private final static QName _QueryUnitListResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "QueryUnitListResponse");
    private final static QName _CheckLogin_QNAME = new QName("http://webservice.system.platform.hhh.com/", "checkLogin");
    private final static QName _CheckLogin1_QNAME = new QName("http://webservice.system.platform.hhh.com/", "checkLogin1");
    private final static QName _CheckLogin1Response_QNAME = new QName("http://webservice.system.platform.hhh.com/", "checkLogin1Response");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "checkLoginResponse");
    private final static QName _GetUserID_QNAME = new QName("http://webservice.system.platform.hhh.com/", "getUserID");
    private final static QName _GetUserIDResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "getUserIDResponse");
    private final static QName _GiveLoginPower_QNAME = new QName("http://webservice.system.platform.hhh.com/", "giveLoginPower");
    private final static QName _GiveLoginPowerResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "giveLoginPowerResponse");
    private final static QName _QueryDogKeyByNO_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryDogKeyByNO");
    private final static QName _QueryDogKeyByNOResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryDogKeyByNOResponse");
    private final static QName _QueryDogKeyList_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryDogKeyList");
    private final static QName _QueryDogKeyListResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryDogKeyListResponse");
    private final static QName _QueryUnitUserList_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryUnitUserList");
    private final static QName _QueryUnitUserListByCondition_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryUnitUserListByCondition");
    private final static QName _QueryUnitUserListByConditionResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryUnitUserListByConditionResponse");
    private final static QName _QueryUnitUserListResponse_QNAME = new QName("http://webservice.system.platform.hhh.com/", "queryUnitUserListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hhh.webservice.gztd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryDeptList }
     * 
     */
    public QueryDeptList createQueryDeptList() {
        return new QueryDeptList();
    }

    /**
     * Create an instance of {@link QueryDeptListResponse }
     * 
     */
    public QueryDeptListResponse createQueryDeptListResponse() {
        return new QueryDeptListResponse();
    }

    /**
     * Create an instance of {@link QueryMonitorByDeptId }
     * 
     */
    public QueryMonitorByDeptId createQueryMonitorByDeptId() {
        return new QueryMonitorByDeptId();
    }

    /**
     * Create an instance of {@link QueryMonitorByDeptIdResponse }
     * 
     */
    public QueryMonitorByDeptIdResponse createQueryMonitorByDeptIdResponse() {
        return new QueryMonitorByDeptIdResponse();
    }

    /**
     * Create an instance of {@link QueryMonitorList }
     * 
     */
    public QueryMonitorList createQueryMonitorList() {
        return new QueryMonitorList();
    }

    /**
     * Create an instance of {@link QueryMonitorListResponse }
     * 
     */
    public QueryMonitorListResponse createQueryMonitorListResponse() {
        return new QueryMonitorListResponse();
    }

    /**
     * Create an instance of {@link QueryProjectForHNT }
     * 
     */
    public QueryProjectForHNT createQueryProjectForHNT() {
        return new QueryProjectForHNT();
    }

    /**
     * Create an instance of {@link QueryProjectForHNTResponse }
     * 
     */
    public QueryProjectForHNTResponse createQueryProjectForHNTResponse() {
        return new QueryProjectForHNTResponse();
    }

    /**
     * Create an instance of {@link QueryProjectForPage }
     * 
     */
    public QueryProjectForPage createQueryProjectForPage() {
        return new QueryProjectForPage();
    }

    /**
     * Create an instance of {@link QueryProjectForPageResponse }
     * 
     */
    public QueryProjectForPageResponse createQueryProjectForPageResponse() {
        return new QueryProjectForPageResponse();
    }

    /**
     * Create an instance of {@link QueryUnitList }
     * 
     */
    public QueryUnitList createQueryUnitList() {
        return new QueryUnitList();
    }

    /**
     * Create an instance of {@link QueryUnitListResponse }
     * 
     */
    public QueryUnitListResponse createQueryUnitListResponse() {
        return new QueryUnitListResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link CheckLogin1 }
     * 
     */
    public CheckLogin1 createCheckLogin1() {
        return new CheckLogin1();
    }

    /**
     * Create an instance of {@link CheckLogin1Response }
     * 
     */
    public CheckLogin1Response createCheckLogin1Response() {
        return new CheckLogin1Response();
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link GetUserID }
     * 
     */
    public GetUserID createGetUserID() {
        return new GetUserID();
    }

    /**
     * Create an instance of {@link GetUserIDResponse }
     * 
     */
    public GetUserIDResponse createGetUserIDResponse() {
        return new GetUserIDResponse();
    }

    /**
     * Create an instance of {@link GiveLoginPower }
     * 
     */
    public GiveLoginPower createGiveLoginPower() {
        return new GiveLoginPower();
    }

    /**
     * Create an instance of {@link GiveLoginPowerResponse }
     * 
     */
    public GiveLoginPowerResponse createGiveLoginPowerResponse() {
        return new GiveLoginPowerResponse();
    }

    /**
     * Create an instance of {@link QueryDogKeyByNO }
     * 
     */
    public QueryDogKeyByNO createQueryDogKeyByNO() {
        return new QueryDogKeyByNO();
    }

    /**
     * Create an instance of {@link QueryDogKeyByNOResponse }
     * 
     */
    public QueryDogKeyByNOResponse createQueryDogKeyByNOResponse() {
        return new QueryDogKeyByNOResponse();
    }

    /**
     * Create an instance of {@link QueryDogKeyList }
     * 
     */
    public QueryDogKeyList createQueryDogKeyList() {
        return new QueryDogKeyList();
    }

    /**
     * Create an instance of {@link QueryDogKeyListResponse }
     * 
     */
    public QueryDogKeyListResponse createQueryDogKeyListResponse() {
        return new QueryDogKeyListResponse();
    }

    /**
     * Create an instance of {@link QueryUnitUserList }
     * 
     */
    public QueryUnitUserList createQueryUnitUserList() {
        return new QueryUnitUserList();
    }

    /**
     * Create an instance of {@link QueryUnitUserListByCondition }
     * 
     */
    public QueryUnitUserListByCondition createQueryUnitUserListByCondition() {
        return new QueryUnitUserListByCondition();
    }

    /**
     * Create an instance of {@link QueryUnitUserListByConditionResponse }
     * 
     */
    public QueryUnitUserListByConditionResponse createQueryUnitUserListByConditionResponse() {
        return new QueryUnitUserListByConditionResponse();
    }

    /**
     * Create an instance of {@link QueryUnitUserListResponse }
     * 
     */
    public QueryUnitUserListResponse createQueryUnitUserListResponse() {
        return new QueryUnitUserListResponse();
    }

    /**
     * Create an instance of {@link ProjectBean }
     * 
     */
    public ProjectBean createProjectBean() {
        return new ProjectBean();
    }

    /**
     * Create an instance of {@link DeptBean }
     * 
     */
    public DeptBean createDeptBean() {
        return new DeptBean();
    }

    /**
     * Create an instance of {@link MonitorBean }
     * 
     */
    public MonitorBean createMonitorBean() {
        return new MonitorBean();
    }

    /**
     * Create an instance of {@link UnitUserBean }
     * 
     */
    public UnitUserBean createUnitUserBean() {
        return new UnitUserBean();
    }

    /**
     * Create an instance of {@link DogKeyBean }
     * 
     */
    public DogKeyBean createDogKeyBean() {
        return new DogKeyBean();
    }

    /**
     * Create an instance of {@link ProjectForPage }
     * 
     */
    public ProjectForPage createProjectForPage() {
        return new ProjectForPage();
    }

    /**
     * Create an instance of {@link UnitBean }
     * 
     */
    public UnitBean createUnitBean() {
        return new UnitBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryDeptList")
    public JAXBElement<QueryDeptList> createQueryDeptList(QueryDeptList value) {
        return new JAXBElement<QueryDeptList>(_QueryDeptList_QNAME, QueryDeptList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDeptListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryDeptListResponse")
    public JAXBElement<QueryDeptListResponse> createQueryDeptListResponse(QueryDeptListResponse value) {
        return new JAXBElement<QueryDeptListResponse>(_QueryDeptListResponse_QNAME, QueryDeptListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitorByDeptId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryMonitorByDeptId")
    public JAXBElement<QueryMonitorByDeptId> createQueryMonitorByDeptId(QueryMonitorByDeptId value) {
        return new JAXBElement<QueryMonitorByDeptId>(_QueryMonitorByDeptId_QNAME, QueryMonitorByDeptId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitorByDeptIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryMonitorByDeptIdResponse")
    public JAXBElement<QueryMonitorByDeptIdResponse> createQueryMonitorByDeptIdResponse(QueryMonitorByDeptIdResponse value) {
        return new JAXBElement<QueryMonitorByDeptIdResponse>(_QueryMonitorByDeptIdResponse_QNAME, QueryMonitorByDeptIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitorList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryMonitorList")
    public JAXBElement<QueryMonitorList> createQueryMonitorList(QueryMonitorList value) {
        return new JAXBElement<QueryMonitorList>(_QueryMonitorList_QNAME, QueryMonitorList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMonitorListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryMonitorListResponse")
    public JAXBElement<QueryMonitorListResponse> createQueryMonitorListResponse(QueryMonitorListResponse value) {
        return new JAXBElement<QueryMonitorListResponse>(_QueryMonitorListResponse_QNAME, QueryMonitorListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProjectForHNT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryProjectForHNT")
    public JAXBElement<QueryProjectForHNT> createQueryProjectForHNT(QueryProjectForHNT value) {
        return new JAXBElement<QueryProjectForHNT>(_QueryProjectForHNT_QNAME, QueryProjectForHNT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProjectForHNTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryProjectForHNTResponse")
    public JAXBElement<QueryProjectForHNTResponse> createQueryProjectForHNTResponse(QueryProjectForHNTResponse value) {
        return new JAXBElement<QueryProjectForHNTResponse>(_QueryProjectForHNTResponse_QNAME, QueryProjectForHNTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProjectForPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryProjectForPage")
    public JAXBElement<QueryProjectForPage> createQueryProjectForPage(QueryProjectForPage value) {
        return new JAXBElement<QueryProjectForPage>(_QueryProjectForPage_QNAME, QueryProjectForPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryProjectForPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryProjectForPageResponse")
    public JAXBElement<QueryProjectForPageResponse> createQueryProjectForPageResponse(QueryProjectForPageResponse value) {
        return new JAXBElement<QueryProjectForPageResponse>(_QueryProjectForPageResponse_QNAME, QueryProjectForPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUnitList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryUnitList")
    public JAXBElement<QueryUnitList> createQueryUnitList(QueryUnitList value) {
        return new JAXBElement<QueryUnitList>(_QueryUnitList_QNAME, QueryUnitList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUnitListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "QueryUnitListResponse")
    public JAXBElement<QueryUnitListResponse> createQueryUnitListResponse(QueryUnitListResponse value) {
        return new JAXBElement<QueryUnitListResponse>(_QueryUnitListResponse_QNAME, QueryUnitListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "checkLogin1")
    public JAXBElement<CheckLogin1> createCheckLogin1(CheckLogin1 value) {
        return new JAXBElement<CheckLogin1>(_CheckLogin1_QNAME, CheckLogin1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "checkLogin1Response")
    public JAXBElement<CheckLogin1Response> createCheckLogin1Response(CheckLogin1Response value) {
        return new JAXBElement<CheckLogin1Response>(_CheckLogin1Response_QNAME, CheckLogin1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "getUserID")
    public JAXBElement<GetUserID> createGetUserID(GetUserID value) {
        return new JAXBElement<GetUserID>(_GetUserID_QNAME, GetUserID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "getUserIDResponse")
    public JAXBElement<GetUserIDResponse> createGetUserIDResponse(GetUserIDResponse value) {
        return new JAXBElement<GetUserIDResponse>(_GetUserIDResponse_QNAME, GetUserIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiveLoginPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "giveLoginPower")
    public JAXBElement<GiveLoginPower> createGiveLoginPower(GiveLoginPower value) {
        return new JAXBElement<GiveLoginPower>(_GiveLoginPower_QNAME, GiveLoginPower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GiveLoginPowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "giveLoginPowerResponse")
    public JAXBElement<GiveLoginPowerResponse> createGiveLoginPowerResponse(GiveLoginPowerResponse value) {
        return new JAXBElement<GiveLoginPowerResponse>(_GiveLoginPowerResponse_QNAME, GiveLoginPowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDogKeyByNO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryDogKeyByNO")
    public JAXBElement<QueryDogKeyByNO> createQueryDogKeyByNO(QueryDogKeyByNO value) {
        return new JAXBElement<QueryDogKeyByNO>(_QueryDogKeyByNO_QNAME, QueryDogKeyByNO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDogKeyByNOResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryDogKeyByNOResponse")
    public JAXBElement<QueryDogKeyByNOResponse> createQueryDogKeyByNOResponse(QueryDogKeyByNOResponse value) {
        return new JAXBElement<QueryDogKeyByNOResponse>(_QueryDogKeyByNOResponse_QNAME, QueryDogKeyByNOResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDogKeyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryDogKeyList")
    public JAXBElement<QueryDogKeyList> createQueryDogKeyList(QueryDogKeyList value) {
        return new JAXBElement<QueryDogKeyList>(_QueryDogKeyList_QNAME, QueryDogKeyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryDogKeyListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryDogKeyListResponse")
    public JAXBElement<QueryDogKeyListResponse> createQueryDogKeyListResponse(QueryDogKeyListResponse value) {
        return new JAXBElement<QueryDogKeyListResponse>(_QueryDogKeyListResponse_QNAME, QueryDogKeyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUnitUserList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryUnitUserList")
    public JAXBElement<QueryUnitUserList> createQueryUnitUserList(QueryUnitUserList value) {
        return new JAXBElement<QueryUnitUserList>(_QueryUnitUserList_QNAME, QueryUnitUserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUnitUserListByCondition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryUnitUserListByCondition")
    public JAXBElement<QueryUnitUserListByCondition> createQueryUnitUserListByCondition(QueryUnitUserListByCondition value) {
        return new JAXBElement<QueryUnitUserListByCondition>(_QueryUnitUserListByCondition_QNAME, QueryUnitUserListByCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUnitUserListByConditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryUnitUserListByConditionResponse")
    public JAXBElement<QueryUnitUserListByConditionResponse> createQueryUnitUserListByConditionResponse(QueryUnitUserListByConditionResponse value) {
        return new JAXBElement<QueryUnitUserListByConditionResponse>(_QueryUnitUserListByConditionResponse_QNAME, QueryUnitUserListByConditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryUnitUserListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.system.platform.hhh.com/", name = "queryUnitUserListResponse")
    public JAXBElement<QueryUnitUserListResponse> createQueryUnitUserListResponse(QueryUnitUserListResponse value) {
        return new JAXBElement<QueryUnitUserListResponse>(_QueryUnitUserListResponse_QNAME, QueryUnitUserListResponse.class, null, value);
    }

}
