
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
    "count",
    "completed_count"
})
public class TaskCompletionStatus {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    @NotNull
    private Long count;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed_count")
    @NotNull
    private Long completedCount;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("count")
    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed_count")
    public Long getCompletedCount() {
        return completedCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("completed_count")
    public void setCompletedCount(Long completedCount) {
        this.completedCount = completedCount;
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
        sb.append(TaskCompletionStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("completedCount");
        sb.append('=');
        sb.append(((this.completedCount == null)?"<null>":this.completedCount));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.completedCount == null)? 0 :this.completedCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskCompletionStatus) == false) {
            return false;
        }
        TaskCompletionStatus rhs = ((TaskCompletionStatus) other);
        return ((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.completedCount == rhs.completedCount)||((this.completedCount!= null)&&this.completedCount.equals(rhs.completedCount))));
    }

}
