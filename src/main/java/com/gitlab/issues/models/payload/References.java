
package com.gitlab.issues.models.payload;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "short",
    "relative",
    "full"
})
public class References {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("short")
    @NotNull
    private String _short;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("relative")
    @NotNull
    private String relative;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full")
    @NotNull
    private String full;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("short")
    public String getShort() {
        return _short;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("short")
    public void setShort(String _short) {
        this._short = _short;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("relative")
    public String getRelative() {
        return relative;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("relative")
    public void setRelative(String relative) {
        this.relative = relative;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(References.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_short");
        sb.append('=');
        sb.append(((this._short == null)?"<null>":this._short));
        sb.append(',');
        sb.append("relative");
        sb.append('=');
        sb.append(((this.relative == null)?"<null>":this.relative));
        sb.append(',');
        sb.append("full");
        sb.append('=');
        sb.append(((this.full == null)?"<null>":this.full));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._short == null)? 0 :this._short.hashCode()));
        result = ((result* 31)+((this.relative == null)? 0 :this.relative.hashCode()));
        result = ((result* 31)+((this.full == null)? 0 :this.full.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof References) == false) {
            return false;
        }
        References rhs = ((References) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this._short == rhs._short)||((this._short!= null)&&this._short.equals(rhs._short))))&&((this.relative == rhs.relative)||((this.relative!= null)&&this.relative.equals(rhs.relative))))&&((this.full == rhs.full)||((this.full!= null)&&this.full.equals(rhs.full))));
    }

}
