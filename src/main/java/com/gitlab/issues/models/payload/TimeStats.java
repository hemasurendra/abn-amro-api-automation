
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
    "time_estimate",
    "total_time_spent",
    "human_time_estimate",
    "human_total_time_spent"
})
public class TimeStats {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_estimate")
    @NotNull
    private Long timeEstimate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_time_spent")
    @NotNull
    private Long totalTimeSpent;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("human_time_estimate")
    @NotNull
    private Object humanTimeEstimate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("human_total_time_spent")
    @NotNull
    private Object humanTotalTimeSpent;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_estimate")
    public Long getTimeEstimate() {
        return timeEstimate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_estimate")
    public void setTimeEstimate(Long timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_time_spent")
    public Long getTotalTimeSpent() {
        return totalTimeSpent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_time_spent")
    public void setTotalTimeSpent(Long totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("human_time_estimate")
    public Object getHumanTimeEstimate() {
        return humanTimeEstimate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("human_time_estimate")
    public void setHumanTimeEstimate(Object humanTimeEstimate) {
        this.humanTimeEstimate = humanTimeEstimate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("human_total_time_spent")
    public Object getHumanTotalTimeSpent() {
        return humanTotalTimeSpent;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("human_total_time_spent")
    public void setHumanTotalTimeSpent(Object humanTotalTimeSpent) {
        this.humanTotalTimeSpent = humanTotalTimeSpent;
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
        sb.append(TimeStats.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timeEstimate");
        sb.append('=');
        sb.append(((this.timeEstimate == null)?"<null>":this.timeEstimate));
        sb.append(',');
        sb.append("totalTimeSpent");
        sb.append('=');
        sb.append(((this.totalTimeSpent == null)?"<null>":this.totalTimeSpent));
        sb.append(',');
        sb.append("humanTimeEstimate");
        sb.append('=');
        sb.append(((this.humanTimeEstimate == null)?"<null>":this.humanTimeEstimate));
        sb.append(',');
        sb.append("humanTotalTimeSpent");
        sb.append('=');
        sb.append(((this.humanTotalTimeSpent == null)?"<null>":this.humanTotalTimeSpent));
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
        result = ((result* 31)+((this.humanTotalTimeSpent == null)? 0 :this.humanTotalTimeSpent.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.humanTimeEstimate == null)? 0 :this.humanTimeEstimate.hashCode()));
        result = ((result* 31)+((this.totalTimeSpent == null)? 0 :this.totalTimeSpent.hashCode()));
        result = ((result* 31)+((this.timeEstimate == null)? 0 :this.timeEstimate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimeStats) == false) {
            return false;
        }
        TimeStats rhs = ((TimeStats) other);
        return ((((((this.humanTotalTimeSpent == rhs.humanTotalTimeSpent)||((this.humanTotalTimeSpent!= null)&&this.humanTotalTimeSpent.equals(rhs.humanTotalTimeSpent)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.humanTimeEstimate == rhs.humanTimeEstimate)||((this.humanTimeEstimate!= null)&&this.humanTimeEstimate.equals(rhs.humanTimeEstimate))))&&((this.totalTimeSpent == rhs.totalTimeSpent)||((this.totalTimeSpent!= null)&&this.totalTimeSpent.equals(rhs.totalTimeSpent))))&&((this.timeEstimate == rhs.timeEstimate)||((this.timeEstimate!= null)&&this.timeEstimate.equals(rhs.timeEstimate))));
    }

}
