/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap_subsystem;

import java.util.List;
import javax.xml.ws.WebServiceRef;
import webservice.ProductE;
import webservice.SoapWebService_Service;

/**
 *
 * @author sebas
 */
public class Main {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/SoapWebService/SoapWebService.wsdl")
    private static SoapWebService_Service service;

    /**
     * @param args the command line arguments
     */
    private static List<ProductE> auctionList;
    //private String test;
    
    private Main(){
        System.out.println("soap_subsystem.Main.<init>()");
        try {
            List<ProductE> auctions = getActiveAuctions();
            auctionList = auctions;
            try {
                System.out.println(auctions.get(0));
            } catch (Exception e){
                System.out.println("Exceptions: " + e);
            }
        } catch (Exception ex){
            System.out.println("Exception: " + ex);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("soap_subsystem.Main.main()");
        System.out.println();
        List<ProductE> List = getActiveAuctions();
        auctionList = List;
        try {
            auctionList.stream().map((p) -> {
                System.out.println("Name: " + p.getName());
                return p;
            }).map((p) -> {
                System.out.println("CurrentBid: " + p.getCurrentBid());
                return p;
            }).forEachOrdered((_item) -> {
                System.out.println();
            });
        } catch (Exception ex){
            System.out.println("getActiveAuctions Exception: " + ex);
        }
        
        try {
            String bidSucces = bidForAuction("701", 8501, 700, "sebastian", "heilund");
            if ( "ProductList".equals(bidSucces)){
            System.out.println("Bid has been made.");
            } else {
                System.out.println("Bid failed, is the new bid lower or equal to the currentbid?");
            }
        } catch (Exception ex){
            System.out.println("bidForAuction Excpetion: " + ex);
        }
        //System.out.println(bidForAuction("800", 8501, 500, "sebastian", "heilund"));
    }

    private static java.util.List<webservice.ProductE> getActiveAuctions() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.SoapWebService port = service.getSoapWebServicePort();
        return port.getActiveAuctions();
    }

    private static String bidForAuction(java.lang.String currentBid, long productId, long oldBid, java.lang.String bidderUserName, java.lang.String creatorUserName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.SoapWebService port = service.getSoapWebServicePort();
        return port.bidForAuction(currentBid, productId, oldBid, bidderUserName, creatorUserName);
    }    
}
