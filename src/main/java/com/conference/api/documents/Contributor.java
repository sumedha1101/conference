package com.conference.api.documents;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"name",
"iconUrl",
"profileUrl",
"type"
})
/**
 * Contributor
 */
@Document
public class Contributor {

@Id
@JsonProperty("id")
private String id;
@JsonProperty("name")
private String name;
@JsonProperty("iconUrl")
private String iconUrl;
@JsonProperty("profileUrl")
private String profileUrl;
@JsonProperty("type")
private String type;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("iconUrl")
public String getIconUrl() {
return iconUrl;
}

@JsonProperty("iconUrl")
public void setIconUrl(String iconUrl) {
this.iconUrl = iconUrl;
}

@JsonProperty("profileUrl")
public String getProfileUrl() {
return profileUrl;
}

@JsonProperty("profileUrl")
public void setProfileUrl(String profileUrl) {
this.profileUrl = profileUrl;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
