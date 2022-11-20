package com.gitlab.issues.stepDefinition;

import com.gitlab.issues.api.EditIssuesAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Steps;
import java.util.Map;

public class EditIssueSteps {

   @Steps
   EditIssuesAPI editIssuesAPI;

    @When("^user tries to edit an issue with details$")
    public void editIssue(DataTable dataTable) {
        Map<String, String> updateData = dataTable.asMaps(String.class, String.class).get(0);
        editIssuesAPI.updateIssues(updateData);
    }
    @Then("Issue is updated successfully")
    public void editedSuccessfully() {
        editIssuesAPI.verifyStatusCode("updateIssueResponseCode","200");
    }
    @Then("^the issue is updated correctly$")
    public void editedCorrectly(DataTable dataTable) {
        Map<String, String> updateData = dataTable.asMaps(String.class, String.class).get(0);
        editIssuesAPI.updatedCorrectly(updateData);
    }

}
