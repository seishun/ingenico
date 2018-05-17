package lv.javaguru.courses.ingenico.lecture3.hometasks.strings.paymentnetwork;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentNetworkDetectorTest {

    private PaymentNetworkDetector detector = new PaymentNetworkDetector();

    @Test
    public void shouldDetectMastercard() throws Exception {
        assertEquals(PaymentNetwork.MASTERCARD, detector.detectByPan("5100000000000000"));
        assertEquals(PaymentNetwork.MASTERCARD, detector.detectByPan("5352400000000000"));
        assertEquals(PaymentNetwork.MASTERCARD, detector.detectByPan("5599990000000000"));
        assertEquals(PaymentNetwork.MASTERCARD, detector.detectByPan("2221000000000000"));
        assertEquals(PaymentNetwork.MASTERCARD, detector.detectByPan("2565400000000000"));
        assertEquals(PaymentNetwork.MASTERCARD, detector.detectByPan("2720990000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("50999900000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("52321500000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("2220990000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("27199900000000000000"));
    }

    @Test
    public void shouldDetectVisa() throws Exception {
        assertEquals(PaymentNetwork.VISA, detector.detectByPan("4000000000000"));
        assertEquals(PaymentNetwork.VISA, detector.detectByPan("4999990000000"));
        assertEquals(PaymentNetwork.VISA, detector.detectByPan("4000000000000000"));
        assertEquals(PaymentNetwork.VISA, detector.detectByPan("4999990000000000"));
        assertEquals(PaymentNetwork.VISA, detector.detectByPan("4000000000000000000"));
        assertEquals(PaymentNetwork.VISA, detector.detectByPan("4999990000000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("40000000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("499999000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("49999900000000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("3000000000000"));
    }

    @Test
    public void shouldDetectAmericanExpress() throws Exception {
        assertEquals(PaymentNetwork.AMEX, detector.detectByPan("340000000000000"));
        assertEquals(PaymentNetwork.AMEX, detector.detectByPan("349999000000000"));
        assertEquals(PaymentNetwork.AMEX, detector.detectByPan("361234000000000"));
        assertEquals(PaymentNetwork.AMEX, detector.detectByPan("370000000000000"));
        assertEquals(PaymentNetwork.AMEX, detector.detectByPan("379999000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("3799990000000000"));
        assertEquals(PaymentNetwork.UNKNOWN, detector.detectByPan("3799990000000"));
    }
}