package com.laonce.fulbito.models;

/**
 * Created by PinkFloyd on 14/07/2017.
 */
public class MetaData {
    private Integer id;
    private Integer user_id;
    private String metadatatype;
    private String description;
    private MetaData metaData;

    public MetaData(Integer id, Integer user_id, String metadatatype, String description, MetaData metaData) {
        this.id = id;
        this.user_id = user_id;
        this.metadatatype = metadatatype;
        this.description = description;
        this.metaData = metaData;
    }

    public MetaData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getMetadatatype() {
        return metadatatype;
    }

    public void setMetadatatype(String metadatatype) {
        this.metadatatype = metadatatype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }
}
