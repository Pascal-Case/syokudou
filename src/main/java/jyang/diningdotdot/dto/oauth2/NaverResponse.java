package jyang.diningdotdot.dto.oauth2;

import java.util.Map;


public class NaverResponse implements OAuth2Response {

    private final Map<String, Object> attribute;

    @SuppressWarnings("unchecked")
    public NaverResponse(Map<String, Object> attribute) {
        this.attribute = (Map<String, Object>) attribute.get("response");
    }

    @Override
    public String getProvider() {
        return "naver";
    }

    @Override
    public String getProviderId() {
        return attribute.get("id").toString();
    }

    @Override
    public String getEmail() {
        return attribute.get("email").toString();
    }

    @Override
    public String getName() {
        return attribute.get("name").toString();
    }

    @Override
    public String getPhone() {
        return attribute.get("phone_number").toString();
    }

    @Override
    public String getNickName() {
        return attribute.get("profile_nickname").toString();
    }
}