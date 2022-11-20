
package com.gitlab.issues.models.payload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "project_id",
    "id",
    "created_at",
    "iid",
    "title",
    "state",
    "assignees",
    "assignee",
    "type",
    "labels",
    "upvotes",
    "downvotes",
    "merge_requests_count",
    "author",
    "description",
    "updated_at",
    "closed_at",
    "closed_by",
    "milestone",
    "subscribed",
    "user_notes_count",
    "due_date",
    "web_url",
    "references",
    "time_stats",
    "confidential",
    "discussion_locked",
    "issue_type",
    "severity",
    "_links",
    "task_completion_status"
})
public class Issue {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("project_id")
    @NotNull
    private Long projectId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    @NotNull
    private Long id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    @NotNull
    private String createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("iid")
    @NotNull
    private Long iid;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    @NotNull
    private String title;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    @NotNull
    private String state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees")
    @Valid
    @NotNull
    private List<Object> assignees = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    @NotNull
    private Object assignee;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    @NotNull
    private String type;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels")
    @Valid
    @NotNull
    private List<Object> labels = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("upvotes")
    @NotNull
    private Long upvotes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downvotes")
    @NotNull
    private Long downvotes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merge_requests_count")
    @NotNull
    private Long mergeRequestsCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    @Valid
    @NotNull
    private Author author;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    @NotNull
    private Object description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    @NotNull
    private String updatedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_at")
    @NotNull
    private Object closedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_by")
    @NotNull
    private Object closedBy;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestone")
    @NotNull
    private Object milestone;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribed")
    @NotNull
    private Boolean subscribed;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user_notes_count")
    @NotNull
    private Long userNotesCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("due_date")
    @NotNull
    private Object dueDate;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("web_url")
    @NotNull
    private String webUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    @Valid
    @NotNull
    private References references;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_stats")
    @Valid
    @NotNull
    private TimeStats timeStats;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confidential")
    @NotNull
    private Boolean confidential;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discussion_locked")
    @NotNull
    private Boolean discussionLocked;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_type")
    @NotNull
    private String issueType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("severity")
    @NotNull
    private String severity;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_links")
    @Valid
    @NotNull
    private Links links;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("task_completion_status")
    @Valid
    @NotNull
    private TaskCompletionStatus taskCompletionStatus;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("project_id")
    public Long getProjectId() {
        return projectId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("project_id")
    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("iid")
    public Long getIid() {
        return iid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("iid")
    public void setIid(Long iid) {
        this.iid = iid;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees")
    public List<Object> getAssignees() {
        return assignees;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignees")
    public void setAssignees(List<Object> assignees) {
        this.assignees = assignees;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public Object getAssignee() {
        return assignee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("upvotes")
    public Long getUpvotes() {
        return upvotes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("upvotes")
    public void setUpvotes(Long upvotes) {
        this.upvotes = upvotes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downvotes")
    public Long getDownvotes() {
        return downvotes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("downvotes")
    public void setDownvotes(Long downvotes) {
        this.downvotes = downvotes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merge_requests_count")
    public Long getMergeRequestsCount() {
        return mergeRequestsCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("merge_requests_count")
    public void setMergeRequestsCount(Long mergeRequestsCount) {
        this.mergeRequestsCount = mergeRequestsCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_by")
    public Object getClosedBy() {
        return closedBy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("closed_by")
    public void setClosedBy(Object closedBy) {
        this.closedBy = closedBy;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestone")
    public Object getMilestone() {
        return milestone;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("milestone")
    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user_notes_count")
    public Long getUserNotesCount() {
        return userNotesCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user_notes_count")
    public void setUserNotesCount(Long userNotesCount) {
        this.userNotesCount = userNotesCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("due_date")
    public Object getDueDate() {
        return dueDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("due_date")
    public void setDueDate(Object dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("web_url")
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("web_url")
    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_stats")
    public TimeStats getTimeStats() {
        return timeStats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("time_stats")
    public void setTimeStats(TimeStats timeStats) {
        this.timeStats = timeStats;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confidential")
    public Boolean getConfidential() {
        return confidential;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confidential")
    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discussion_locked")
    public Boolean getDiscussionLocked() {
        return discussionLocked;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discussion_locked")
    public void setDiscussionLocked(Boolean discussionLocked) {
        this.discussionLocked = discussionLocked;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_type")
    public String getIssueType() {
        return issueType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("issue_type")
    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("task_completion_status")
    public TaskCompletionStatus getTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("task_completion_status")
    public void setTaskCompletionStatus(TaskCompletionStatus taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
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
        sb.append(Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("projectId");
        sb.append('=');
        sb.append(((this.projectId == null)?"<null>":this.projectId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("iid");
        sb.append('=');
        sb.append(((this.iid == null)?"<null>":this.iid));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("upvotes");
        sb.append('=');
        sb.append(((this.upvotes == null)?"<null>":this.upvotes));
        sb.append(',');
        sb.append("downvotes");
        sb.append('=');
        sb.append(((this.downvotes == null)?"<null>":this.downvotes));
        sb.append(',');
        sb.append("mergeRequestsCount");
        sb.append('=');
        sb.append(((this.mergeRequestsCount == null)?"<null>":this.mergeRequestsCount));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("milestone");
        sb.append('=');
        sb.append(((this.milestone == null)?"<null>":this.milestone));
        sb.append(',');
        sb.append("subscribed");
        sb.append('=');
        sb.append(((this.subscribed == null)?"<null>":this.subscribed));
        sb.append(',');
        sb.append("userNotesCount");
        sb.append('=');
        sb.append(((this.userNotesCount == null)?"<null>":this.userNotesCount));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("webUrl");
        sb.append('=');
        sb.append(((this.webUrl == null)?"<null>":this.webUrl));
        sb.append(',');
        sb.append("references");
        sb.append('=');
        sb.append(((this.references == null)?"<null>":this.references));
        sb.append(',');
        sb.append("timeStats");
        sb.append('=');
        sb.append(((this.timeStats == null)?"<null>":this.timeStats));
        sb.append(',');
        sb.append("confidential");
        sb.append('=');
        sb.append(((this.confidential == null)?"<null>":this.confidential));
        sb.append(',');
        sb.append("discussionLocked");
        sb.append('=');
        sb.append(((this.discussionLocked == null)?"<null>":this.discussionLocked));
        sb.append(',');
        sb.append("issueType");
        sb.append('=');
        sb.append(((this.issueType == null)?"<null>":this.issueType));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("taskCompletionStatus");
        sb.append('=');
        sb.append(((this.taskCompletionStatus == null)?"<null>":this.taskCompletionStatus));
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
        result = ((result* 31)+((this.closedBy == null)? 0 :this.closedBy.hashCode()));
        result = ((result* 31)+((this.upvotes == null)? 0 :this.upvotes.hashCode()));
        result = ((result* 31)+((this.references == null)? 0 :this.references.hashCode()));
        result = ((result* 31)+((this.iid == null)? 0 :this.iid.hashCode()));
        result = ((result* 31)+((this.dueDate == null)? 0 :this.dueDate.hashCode()));
        result = ((result* 31)+((this.assignees == null)? 0 :this.assignees.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.userNotesCount == null)? 0 :this.userNotesCount.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.subscribed == null)? 0 :this.subscribed.hashCode()));
        result = ((result* 31)+((this.timeStats == null)? 0 :this.timeStats.hashCode()));
        result = ((result* 31)+((this.taskCompletionStatus == null)? 0 :this.taskCompletionStatus.hashCode()));
        result = ((result* 31)+((this.links == null)? 0 :this.links.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.closedAt == null)? 0 :this.closedAt.hashCode()));
        result = ((result* 31)+((this.mergeRequestsCount == null)? 0 :this.mergeRequestsCount.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.confidential == null)? 0 :this.confidential.hashCode()));
        result = ((result* 31)+((this.discussionLocked == null)? 0 :this.discussionLocked.hashCode()));
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.downvotes == null)? 0 :this.downvotes.hashCode()));
        result = ((result* 31)+((this.labels == null)? 0 :this.labels.hashCode()));
        result = ((result* 31)+((this.issueType == null)? 0 :this.issueType.hashCode()));
        result = ((result* 31)+((this.milestone == null)? 0 :this.milestone.hashCode()));
        result = ((result* 31)+((this.webUrl == null)? 0 :this.webUrl.hashCode()));
        result = ((result* 31)+((this.assignee == null)? 0 :this.assignee.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.projectId == null)? 0 :this.projectId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Issue) == false) {
            return false;
        }
        Issue rhs = ((Issue) other);
        return (((((((((((((((((((((((((((((((((this.closedBy == rhs.closedBy)||((this.closedBy!= null)&&this.closedBy.equals(rhs.closedBy)))&&((this.upvotes == rhs.upvotes)||((this.upvotes!= null)&&this.upvotes.equals(rhs.upvotes))))&&((this.references == rhs.references)||((this.references!= null)&&this.references.equals(rhs.references))))&&((this.iid == rhs.iid)||((this.iid!= null)&&this.iid.equals(rhs.iid))))&&((this.dueDate == rhs.dueDate)||((this.dueDate!= null)&&this.dueDate.equals(rhs.dueDate))))&&((this.assignees == rhs.assignees)||((this.assignees!= null)&&this.assignees.equals(rhs.assignees))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.userNotesCount == rhs.userNotesCount)||((this.userNotesCount!= null)&&this.userNotesCount.equals(rhs.userNotesCount))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.subscribed == rhs.subscribed)||((this.subscribed!= null)&&this.subscribed.equals(rhs.subscribed))))&&((this.timeStats == rhs.timeStats)||((this.timeStats!= null)&&this.timeStats.equals(rhs.timeStats))))&&((this.taskCompletionStatus == rhs.taskCompletionStatus)||((this.taskCompletionStatus!= null)&&this.taskCompletionStatus.equals(rhs.taskCompletionStatus))))&&((this.links == rhs.links)||((this.links!= null)&&this.links.equals(rhs.links))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.closedAt == rhs.closedAt)||((this.closedAt!= null)&&this.closedAt.equals(rhs.closedAt))))&&((this.mergeRequestsCount == rhs.mergeRequestsCount)||((this.mergeRequestsCount!= null)&&this.mergeRequestsCount.equals(rhs.mergeRequestsCount))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.confidential == rhs.confidential)||((this.confidential!= null)&&this.confidential.equals(rhs.confidential))))&&((this.discussionLocked == rhs.discussionLocked)||((this.discussionLocked!= null)&&this.discussionLocked.equals(rhs.discussionLocked))))&&((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.downvotes == rhs.downvotes)||((this.downvotes!= null)&&this.downvotes.equals(rhs.downvotes))))&&((this.labels == rhs.labels)||((this.labels!= null)&&this.labels.equals(rhs.labels))))&&((this.issueType == rhs.issueType)||((this.issueType!= null)&&this.issueType.equals(rhs.issueType))))&&((this.milestone == rhs.milestone)||((this.milestone!= null)&&this.milestone.equals(rhs.milestone))))&&((this.webUrl == rhs.webUrl)||((this.webUrl!= null)&&this.webUrl.equals(rhs.webUrl))))&&((this.assignee == rhs.assignee)||((this.assignee!= null)&&this.assignee.equals(rhs.assignee))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.projectId == rhs.projectId)||((this.projectId!= null)&&this.projectId.equals(rhs.projectId))));
    }

}
