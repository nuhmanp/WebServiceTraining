
package com.jaxws.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculateSum", targetNamespace = "http://calc.jaxws.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculateSum {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calc.jaxws.com/", className = "com.jaxws.calc.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calc.jaxws.com/", className = "com.jaxws.calc.AddResponse")
    @Action(input = "http://calc.jaxws.com/CalculateSum/addRequest", output = "http://calc.jaxws.com/CalculateSum/addResponse")
    public int add(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calProduct", targetNamespace = "http://calc.jaxws.com/", className = "com.jaxws.calc.CalProduct")
    @ResponseWrapper(localName = "calProductResponse", targetNamespace = "http://calc.jaxws.com/", className = "com.jaxws.calc.CalProductResponse")
    @Action(input = "http://calc.jaxws.com/CalculateSum/calProductRequest", output = "http://calc.jaxws.com/CalculateSum/calProductResponse")
    public int calProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookTicket", targetNamespace = "http://calc.jaxws.com/", className = "com.jaxws.calc.BookTicket")
    @ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://calc.jaxws.com/", className = "com.jaxws.calc.BookTicketResponse")
    @Action(input = "http://calc.jaxws.com/CalculateSum/bookTicketRequest", output = "http://calc.jaxws.com/CalculateSum/bookTicketResponse")
    public String bookTicket(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

}