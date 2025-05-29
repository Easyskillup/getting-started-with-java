package demo.sealed_classes;

/**
 * PaymentGateway
 * --MasterCardGateway
 * --VisaGateway
 * --UPIGateWay
 * Sealed classes: Control the inheritance hierarchy, in other words control the classes that are able to inherit my class.
 * While inheriting from a sealed class, the child class mut be final, non-sealed, sealed.
 * If the child class is non-sealed, then it can be inherited by any other class.
 */
public sealed class PaymentGateway
        permits MasterCardGateway, VisaGateway, UPIGateWay {
}
