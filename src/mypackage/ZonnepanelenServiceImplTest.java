package mypackage;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZonnepanelenServiceImplTest {
    @Test
    public void geldigeInput() {
        Request req = new Request();
        req.setZonkracht(BigInteger.valueOf(11));
        req.setZonstand(BigInteger.valueOf(85));
        ZonnepanelenServiceImpl wsi = new ZonnepanelenServiceImpl();
        Response result = wsi.calculatePower(req);
        BigInteger result2 = result.getResult();
        int actualResult = result2.intValue();
        assertEquals(96, actualResult);
    }
}