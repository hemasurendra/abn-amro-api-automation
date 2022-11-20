package com.gitlab.issues.stepDefinition;

import com.gitlab.issues.api.RemoveIssuesAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RemoveIssueSteps {

    @Steps
    RemoveIssuesAPI removeIssuesAPI;

    @When("^user tries to delete an issue with (.*) details$")
    public void removeIssues(String iid) {
        removeIssuesAPI.deleteIssues(iid);
    }

    @Then("^Issue (.*) deleted successfully$")
    public void verifyRemoval(String status) {
        if (status.equalsIgnoreCase("is"))
            removeIssuesAPI.verifyStatusCode("deleteIssueResponseCode","204");
        else
            removeIssuesAPI.verifyStatusCodeIsNot("deleteIssueResponseCode","204");
    }
}
