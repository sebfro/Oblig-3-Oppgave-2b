
package webservice;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapWebService", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapWebService {


    /**
     * 
     * @param currentBid
     * @param productId
     * @param creatorUserName
     * @param oldBid
     * @param bidderUserName
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bidForAuction", targetNamespace = "http://webservice/", className = "webservice.BidForAuction")
    @ResponseWrapper(localName = "bidForAuctionResponse", targetNamespace = "http://webservice/", className = "webservice.BidForAuctionResponse")
    @Action(input = "http://webservice/SoapWebService/bidForAuctionRequest", output = "http://webservice/SoapWebService/bidForAuctionResponse")
    public String bidForAuction(
        @WebParam(name = "currentBid", targetNamespace = "")
        String currentBid,
        @WebParam(name = "productId", targetNamespace = "")
        long productId,
        @WebParam(name = "oldBid", targetNamespace = "")
        long oldBid,
        @WebParam(name = "bidderUserName", targetNamespace = "")
        String bidderUserName,
        @WebParam(name = "creatorUserName", targetNamespace = "")
        String creatorUserName);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.ProductE>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getActiveAuctions", targetNamespace = "http://webservice/", className = "webservice.GetActiveAuctions")
    @ResponseWrapper(localName = "getActiveAuctionsResponse", targetNamespace = "http://webservice/", className = "webservice.GetActiveAuctionsResponse")
    @Action(input = "http://webservice/SoapWebService/getActiveAuctionsRequest", output = "http://webservice/SoapWebService/getActiveAuctionsResponse")
    public List<ProductE> getActiveAuctions();

}