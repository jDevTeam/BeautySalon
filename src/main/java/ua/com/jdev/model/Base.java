package ua.com.jdev.model;

import javafx.beans.property.StringProperty;

public abstract class Base {

    protected StringProperty id;

    public String getId() {
        return id.get();
    }

    public StringProperty idProperty() {
        return id;
    }
}
