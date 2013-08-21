/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hcw;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author RayaXP
 */
@WebService(serviceName = "HealthCareWebService")
public class HealthCareWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "HeartRate")
    public String HeartRate(@WebParam(name = "userID") int userID, @WebParam(name = "Max") int Max, @WebParam(name = "Min") int Min, @WebParam(name = "Date") String Date) {
        //TODO write your implementation code here:
        return "Data Saved!";
    }

    
}
