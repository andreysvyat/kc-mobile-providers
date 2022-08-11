package cc.coopersoft.keycloak.phone.providers.spi;

import cc.coopersoft.keycloak.phone.providers.constants.TokenCodeType;
import org.keycloak.provider.Provider;


public interface PhoneSupportProvider extends Provider {

    //TODO on key longin support
    //boolean Verification(String phoneNumber, String token);

    boolean isDuplicatePhoneAllowed(String realm);

    int sendTokenCode(String phoneNumber, TokenCodeType type, String kind);
}