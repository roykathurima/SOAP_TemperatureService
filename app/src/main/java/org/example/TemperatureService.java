
package org.example;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public class TemperatureService {

    @WebMethod
    public double celsiusToFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @WebMethod
    public double farenheitToCelsius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }
}
