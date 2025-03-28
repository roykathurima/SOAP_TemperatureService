
package org.example;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;

@WebService
public class TemperatureService {

    @WebMethod
    @WebResult(name = "temperatureInFarenheit")
    public double celsiusToFarenheit(@WebParam(name = "celsius") double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @WebMethod
    @WebResult(name = "temperatureInFarenheit")
    public double farenheitToCelsius(@WebParam(name = "farenheit") double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }
}
