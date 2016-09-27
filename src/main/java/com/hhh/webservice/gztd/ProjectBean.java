//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.11 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2016.09.19 ʱ�� 03:02:38 PM CST 
//


package com.hhh.webservice.gztd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>projectBean complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="projectBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="begindate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="btel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="builder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="constructioner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ctel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="deptid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="deptname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="designer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="dtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="gdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="monitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="monitorUnitCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="monitorid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="monitorunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectcost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectgpsx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectgpsy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectgpsz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectnum_zl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="projectstatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="researcher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="rtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="sgxkzh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="stel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="supervisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="updatedate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="versionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectBean", propOrder = {
    "address",
    "area",
    "areaCode",
    "begindate",
    "btel",
    "builder",
    "constructioner",
    "ctel",
    "depth",
    "deptid",
    "deptname",
    "designer",
    "dtel",
    "enddate",
    "gdDate",
    "monitor",
    "monitorUnitCode",
    "monitorid",
    "monitorunit",
    "projectcode",
    "projectcost",
    "projectgpsx",
    "projectgpsy",
    "projectgpsz",
    "projectid",
    "projectname",
    "projectnumZl",
    "projectstatus",
    "researcher",
    "rtel",
    "sgxkzh",
    "stel",
    "supervisor",
    "updatedate",
    "versionId"
})
public class ProjectBean {

    protected String address;
    protected Double area;
    protected String areaCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begindate;
    protected String btel;
    protected String builder;
    protected String constructioner;
    protected String ctel;
    protected Double depth;
    protected String deptid;
    protected String deptname;
    protected String designer;
    protected String dtel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gdDate;
    protected String monitor;
    protected String monitorUnitCode;
    protected String monitorid;
    protected String monitorunit;
    protected String projectcode;
    protected Double projectcost;
    protected String projectgpsx;
    protected String projectgpsy;
    protected String projectgpsz;
    protected String projectid;
    protected String projectname;
    @XmlElement(name = "projectnum_zl")
    protected String projectnumZl;
    protected String projectstatus;
    protected String researcher;
    protected String rtel;
    protected String sgxkzh;
    protected String stel;
    protected String supervisor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedate;
    protected String versionId;

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡarea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getArea() {
        return area;
    }

    /**
     * ����area���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setArea(Double value) {
        this.area = value;
    }

    /**
     * ��ȡareaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * ����areaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * ��ȡbegindate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegindate() {
        return begindate;
    }

    /**
     * ����begindate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegindate(XMLGregorianCalendar value) {
        this.begindate = value;
    }

    /**
     * ��ȡbtel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtel() {
        return btel;
    }

    /**
     * ����btel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtel(String value) {
        this.btel = value;
    }

    /**
     * ��ȡbuilder���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilder() {
        return builder;
    }

    /**
     * ����builder���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilder(String value) {
        this.builder = value;
    }

    /**
     * ��ȡconstructioner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructioner() {
        return constructioner;
    }

    /**
     * ����constructioner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructioner(String value) {
        this.constructioner = value;
    }

    /**
     * ��ȡctel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtel() {
        return ctel;
    }

    /**
     * ����ctel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtel(String value) {
        this.ctel = value;
    }

    /**
     * ��ȡdepth���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDepth() {
        return depth;
    }

    /**
     * ����depth���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDepth(Double value) {
        this.depth = value;
    }

    /**
     * ��ȡdeptid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * ����deptid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptid(String value) {
        this.deptid = value;
    }

    /**
     * ��ȡdeptname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * ����deptname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptname(String value) {
        this.deptname = value;
    }

    /**
     * ��ȡdesigner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * ����designer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesigner(String value) {
        this.designer = value;
    }

    /**
     * ��ȡdtel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtel() {
        return dtel;
    }

    /**
     * ����dtel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtel(String value) {
        this.dtel = value;
    }

    /**
     * ��ȡenddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddate() {
        return enddate;
    }

    /**
     * ����enddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddate(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * ��ȡgdDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGdDate() {
        return gdDate;
    }

    /**
     * ����gdDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGdDate(XMLGregorianCalendar value) {
        this.gdDate = value;
    }

    /**
     * ��ȡmonitor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitor() {
        return monitor;
    }

    /**
     * ����monitor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitor(String value) {
        this.monitor = value;
    }

    /**
     * ��ȡmonitorUnitCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorUnitCode() {
        return monitorUnitCode;
    }

    /**
     * ����monitorUnitCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorUnitCode(String value) {
        this.monitorUnitCode = value;
    }

    /**
     * ��ȡmonitorid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorid() {
        return monitorid;
    }

    /**
     * ����monitorid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorid(String value) {
        this.monitorid = value;
    }

    /**
     * ��ȡmonitorunit���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorunit() {
        return monitorunit;
    }

    /**
     * ����monitorunit���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorunit(String value) {
        this.monitorunit = value;
    }

    /**
     * ��ȡprojectcode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectcode() {
        return projectcode;
    }

    /**
     * ����projectcode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectcode(String value) {
        this.projectcode = value;
    }

    /**
     * ��ȡprojectcost���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProjectcost() {
        return projectcost;
    }

    /**
     * ����projectcost���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProjectcost(Double value) {
        this.projectcost = value;
    }

    /**
     * ��ȡprojectgpsx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectgpsx() {
        return projectgpsx;
    }

    /**
     * ����projectgpsx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectgpsx(String value) {
        this.projectgpsx = value;
    }

    /**
     * ��ȡprojectgpsy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectgpsy() {
        return projectgpsy;
    }

    /**
     * ����projectgpsy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectgpsy(String value) {
        this.projectgpsy = value;
    }

    /**
     * ��ȡprojectgpsz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectgpsz() {
        return projectgpsz;
    }

    /**
     * ����projectgpsz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectgpsz(String value) {
        this.projectgpsz = value;
    }

    /**
     * ��ȡprojectid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * ����projectid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectid(String value) {
        this.projectid = value;
    }

    /**
     * ��ȡprojectname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * ����projectname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectname(String value) {
        this.projectname = value;
    }

    /**
     * ��ȡprojectnumZl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectnumZl() {
        return projectnumZl;
    }

    /**
     * ����projectnumZl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectnumZl(String value) {
        this.projectnumZl = value;
    }

    /**
     * ��ȡprojectstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectstatus() {
        return projectstatus;
    }

    /**
     * ����projectstatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectstatus(String value) {
        this.projectstatus = value;
    }

    /**
     * ��ȡresearcher���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearcher() {
        return researcher;
    }

    /**
     * ����researcher���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearcher(String value) {
        this.researcher = value;
    }

    /**
     * ��ȡrtel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtel() {
        return rtel;
    }

    /**
     * ����rtel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtel(String value) {
        this.rtel = value;
    }

    /**
     * ��ȡsgxkzh���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgxkzh() {
        return sgxkzh;
    }

    /**
     * ����sgxkzh���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgxkzh(String value) {
        this.sgxkzh = value;
    }

    /**
     * ��ȡstel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStel() {
        return stel;
    }

    /**
     * ����stel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStel(String value) {
        this.stel = value;
    }

    /**
     * ��ȡsupervisor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisor() {
        return supervisor;
    }

    /**
     * ����supervisor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisor(String value) {
        this.supervisor = value;
    }

    /**
     * ��ȡupdatedate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedate() {
        return updatedate;
    }

    /**
     * ����updatedate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedate(XMLGregorianCalendar value) {
        this.updatedate = value;
    }

    /**
     * ��ȡversionId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * ����versionId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionId(String value) {
        this.versionId = value;
    }

}
