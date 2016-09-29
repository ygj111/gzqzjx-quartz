//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2016.09.29 时间 03:37:25 PM CST 
//


package com.hhh.webservice.gztd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>projectForPage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="projectForPage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}int" form="unqualified"/&gt;
 *         &lt;element name="projectBean" type="{http://webservice.system.platform.hhh.com/}projectBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectForPage", propOrder = {
    "pageCount",
    "projectBean"
})
public class ProjectForPage {

    protected int pageCount;
    @XmlElement(nillable = true)
    protected List<ProjectBean> projectBean;

    /**
     * 获取pageCount属性的值。
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * 设置pageCount属性的值。
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the projectBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectBean }
     * 
     * 
     */
    public List<ProjectBean> getProjectBean() {
        if (projectBean == null) {
            projectBean = new ArrayList<ProjectBean>();
        }
        return this.projectBean;
    }

}
