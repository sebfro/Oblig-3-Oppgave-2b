
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bidForAuction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bidForAuction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentBid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="oldBid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="bidderUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creatorUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bidForAuction", propOrder = {
    "currentBid",
    "productId",
    "oldBid",
    "bidderUserName",
    "creatorUserName"
})
public class BidForAuction {

    protected String currentBid;
    protected long productId;
    protected long oldBid;
    protected String bidderUserName;
    protected String creatorUserName;

    /**
     * Gets the value of the currentBid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBid() {
        return currentBid;
    }

    /**
     * Sets the value of the currentBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBid(String value) {
        this.currentBid = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     */
    public long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(long value) {
        this.productId = value;
    }

    /**
     * Gets the value of the oldBid property.
     * 
     */
    public long getOldBid() {
        return oldBid;
    }

    /**
     * Sets the value of the oldBid property.
     * 
     */
    public void setOldBid(long value) {
        this.oldBid = value;
    }

    /**
     * Gets the value of the bidderUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBidderUserName() {
        return bidderUserName;
    }

    /**
     * Sets the value of the bidderUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidderUserName(String value) {
        this.bidderUserName = value;
    }

    /**
     * Gets the value of the creatorUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorUserName() {
        return creatorUserName;
    }

    /**
     * Sets the value of the creatorUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorUserName(String value) {
        this.creatorUserName = value;
    }

}
