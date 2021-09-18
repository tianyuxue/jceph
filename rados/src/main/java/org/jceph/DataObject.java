package org.jceph;

import java.util.Map;

public class DataObject {
    private String id;
    private Map<String, Object> metadata;
    private byte[] binaryData;

    public String getId() {
        return id;
    }

    public DataObject setId(String id) {
        this.id = id;
        return this;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public DataObject setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    public byte[] getBinaryData() {
        return binaryData;
    }

    public DataObject setBinaryData(byte[] binaryData) {
        this.binaryData = binaryData;
        return this;
    }
}
