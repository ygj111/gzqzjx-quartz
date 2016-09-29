//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.29 时间 03:37:25 PM CST 
//


package com.hhh.webservice.gztd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>projectBean2 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="projectBean2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="area" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="begindate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="btel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="builder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="builderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="constructioner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="constructionerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="ctel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="deptid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="deptname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="designer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="designerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
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
 *         &lt;element name="researcherID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="rtel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="sgxkzh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="stel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="supervisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="supervisorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/&gt;
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
@XmlType(name = "projectBean2", propOrder = {
    "address",
    "area",
    "areaCode",
    "begindate",
    "btel",
    "builder",
    "builderID",
    "constructioner",
    "constructionerID",
    "ctel",
    "depth",
    "deptid",
    "deptname",
    "designer",
    "designerID",
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
    "researcherID",
    "rtel",
    "sgxkzh",
    "stel",
    "supervisor",
    "supervisorID",
    "updatedate",
    "versionId"
})
public class ProjectBean2 {

    protected String address;
    protected Double area;
    protected String areaCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begindate;
    protected String btel;
    protected String builder;
    protected String builderID;
    protected String constructioner;
    protected String constructionerID;
    protected String ctel;
    protected Double depth;
    protected String deptid;
    protected String deptname;
    protected String designer;
    protected String designerID;
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
    protected String researcherID;
    protected String rtel;
    protected String sgxkzh;
    protected String stel;
    protected String supervisor;
    protected String supervisorID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedate;
    protected String versionId;

    /**
     * 获取address属性的值。
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
     * 设置address属性的值。
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
     * 获取area属性的值。
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
     * 设置area属性的值。
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
     * 获取areaCode属性的值。
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
     * 设置areaCode属性的值。
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
     * 获取begindate属性的值。
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
     * 设置begindate属性的值。
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
     * 获取btel属性的值。
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
     * 设置btel属性的值。
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
     * 获取builder属性的值。
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
     * 设置builder属性的值。
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
     * 获取builderID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilderID() {
        return builderID;
    }

    /**
     * 设置builderID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilderID(String value) {
        this.builderID = value;
    }

    /**
     * 获取constructioner属性的值。
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
     * 设置constructioner属性的值。
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
     * 获取constructionerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstructionerID() {
        return constructionerID;
    }

    /**
     * 设置constructionerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstructionerID(String value) {
        this.constructionerID = value;
    }

    /**
     * 获取ctel属性的值。
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
     * 设置ctel属性的值。
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
     * 获取depth属性的值。
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
     * 设置depth属性的值。
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
     * 获取deptid属性的值。
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
     * 设置deptid属性的值。
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
     * 获取deptname属性的值。
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
     * 设置deptname属性的值。
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
     * 获取designer属性的值。
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
     * 设置designer属性的值。
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
     * 获取designerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignerID() {
        return designerID;
    }

    /**
     * 设置designerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignerID(String value) {
        this.designerID = value;
    }

    /**
     * 获取dtel属性的值。
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
     * 设置dtel属性的值。
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
     * 获取enddate属性的值。
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
     * 设置enddate属性的值。
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
     * 获取gdDate属性的值。
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
     * 设置gdDate属性的值。
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
     * 获取monitor属性的值。
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
     * 设置monitor属性的值。
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
     * 获取monitorUnitCode属性的值。
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
     * 设置monitorUnitCode属性的值。
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
     * 获取monitorid属性的值。
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
     * 设置monitorid属性的值。
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
     * 获取monitorunit属性的值。
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
     * 设置monitorunit属性的值。
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
     * 获取projectcode属性的值。
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
     * 设置projectcode属性的值。
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
     * 获取projectcost属性的值。
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
     * 设置projectcost属性的值。
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
     * 获取projectgpsx属性的值。
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
     * 设置projectgpsx属性的值。
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
     * 获取projectgpsy属性的值。
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
     * 设置projectgpsy属性的值。
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
     * 获取projectgpsz属性的值。
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
     * 设置projectgpsz属性的值。
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
     * 获取projectid属性的值。
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
     * 设置projectid属性的值。
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
     * 获取projectname属性的值。
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
     * 设置projectname属性的值。
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
     * 获取projectnumZl属性的值。
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
     * 设置projectnumZl属性的值。
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
     * 获取projectstatus属性的值。
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
     * 设置projectstatus属性的值。
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
     * 获取researcher属性的值。
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
     * 设置researcher属性的值。
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
     * 获取researcherID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResearcherID() {
        return researcherID;
    }

    /**
     * 设置researcherID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResearcherID(String value) {
        this.researcherID = value;
    }

    /**
     * 获取rtel属性的值。
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
     * 设置rtel属性的值。
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
     * 获取sgxkzh属性的值。
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
     * 设置sgxkzh属性的值。
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
     * 获取stel属性的值。
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
     * 设置stel属性的值。
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
     * 获取supervisor属性的值。
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
     * 设置supervisor属性的值。
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
     * 获取supervisorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupervisorID() {
        return supervisorID;
    }

    /**
     * 设置supervisorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupervisorID(String value) {
        this.supervisorID = value;
    }

    /**
     * 获取updatedate属性的值。
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
     * 设置updatedate属性的值。
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
     * 获取versionId属性的值。
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
     * 设置versionId属性的值。
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
