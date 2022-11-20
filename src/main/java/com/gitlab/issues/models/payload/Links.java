
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
    "self",
    "notes",
    "award_emoji",
    "project",
    "closed_as_duplicate_of"
})
public class Links {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    @NotNull
    private String self;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notes")
    @NotNull
    private String notes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("award_emoji")
    @NotNull
    private String awardEmoji;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("project")
    @NotNull
    private String project;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_as_duplicate_of")
    @NotNull
    private String closedAsDuplicateOf;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    public String getSelf() {
        return self;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("self")
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("award_emoji")
    public String getAwardEmoji() {
        return awardEmoji;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("award_emoji")
    public void setAwardEmoji(String awardEmoji) {
        this.awardEmoji = awardEmoji;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("project")
    public String getProject() {
        return project;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("project")
    public void setProject(String project) {
        this.project = project;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_as_duplicate_of")
    public String getClosedAsDuplicateOf() {
        return closedAsDuplicateOf;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_as_duplicate_of")
    public void setClosedAsDuplicateOf(String closedAsDuplicateOf) {
        this.closedAsDuplicateOf = closedAsDuplicateOf;
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
        sb.append(Links.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("self");
        sb.append('=');
        sb.append(((this.self == null)?"<null>":this.self));
        sb.append(',');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("awardEmoji");
        sb.append('=');
        sb.append(((this.awardEmoji == null)?"<null>":this.awardEmoji));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("closedAsDuplicateOf");
        sb.append('=');
        sb.append(((this.closedAsDuplicateOf == null)?"<null>":this.closedAsDuplicateOf));
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
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.self == null)? 0 :this.self.hashCode()));
        result = ((result* 31)+((this.awardEmoji == null)? 0 :this.awardEmoji.hashCode()));
        result = ((result* 31)+((this.project == null)? 0 :this.project.hashCode()));
        result = ((result* 31)+((this.closedAsDuplicateOf == null)? 0 :this.closedAsDuplicateOf.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Links) == false) {
            return false;
        }
        Links rhs = ((Links) other);
        return (((((((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes)))&&((this.self == rhs.self)||((this.self!= null)&&this.self.equals(rhs.self))))&&((this.awardEmoji == rhs.awardEmoji)||((this.awardEmoji!= null)&&this.awardEmoji.equals(rhs.awardEmoji))))&&((this.project == rhs.project)||((this.project!= null)&&this.project.equals(rhs.project))))&&((this.closedAsDuplicateOf == rhs.closedAsDuplicateOf)||((this.closedAsDuplicateOf!= null)&&this.closedAsDuplicateOf.equals(rhs.closedAsDuplicateOf))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
