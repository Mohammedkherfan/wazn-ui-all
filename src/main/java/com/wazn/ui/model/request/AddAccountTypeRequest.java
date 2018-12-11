package com.wazn.ui.model.request;

public class AddAccountTypeRequest {

    private Integer type;

    public AddAccountTypeRequest() {
    }

    public AddAccountTypeRequest(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
