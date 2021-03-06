package mypackage;

import javax.jws.WebService;
import java.math.BigInteger;

/**
 * Created by Nick on 23-6-2017.
 */
@WebService( endpointInterface= "mypackage.WSInterface")
public class ZonnepanelenServiceImpl implements WSInterface {
    @Override
    public Response calculatePower(Request request) {
        ObjectFactory factory = new ObjectFactory();
        Response response = factory.createResponse();
        Double getal = request.getZonkracht().doubleValue() + request.getZonstand().doubleValue();
        BigInteger actualResult = BigInteger.valueOf(getal.longValue());
        response.setResult(actualResult);
        return response;
    }
}
