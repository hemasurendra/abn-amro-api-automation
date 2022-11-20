package com.gitlab.issues.api;

import static net.serenitybdd.rest.SerenityRest.given;
import static org.assertj.core.api.StrictAssertions.assertThat;
import io.restassured.response.Response;
import java.util.Map;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

/**
 * All operations corresponding to UpdateIssue are managed here
 */
public class EditIssuesAPI extends BasePage{

    /**
     * Method to update a Issue on a git lab project
     * @param updateData required data for updating a issue
     */
    @Step
  public void updateIssues(Map<String, String> updateData) {
    Response response = given()
            .header("Content-Type", "application/json")
            .header("Authorization", Serenity.sessionVariableCalled("token"))
            .when().log().all().body(new JSONObject(updateData).toString()).put("/"+ updateData.get("iid"));
    Serenity.setSessionVariable("updateIssueResponseCode").to(response.statusCode());
    Serenity.setSessionVariable("updateIssueResponse").to(response.getBody().asString());
  }

  /**
   * Method to to verify if issue is updated correctly
   * @param updateData
   * @return
   */
  public void updatedCorrectly(Map<String, String> updateData) {
    JSONObject updateIssueResponse = new JSONObject(Serenity.sessionVariableCalled("updateIssueResponse").toString());
    updateData.forEach((k, v) -> assertThat(compareUpdateResponse(updateIssueResponse,updateData,k)).as(k+ " value is expected to be updated correctly").isTrue());
  }

  private boolean compareUpdateResponse(JSONObject updateIssueResponse, Map<String, String> updateData, String k) {
    if (updateData.get(k) != null) {
      switch (k) {
        case "state_event":
          return updateIssueResponse.get("state").toString().contains(updateData.get(k));
        case "milestone_id":
          JSONObject milestoneData = new JSONObject(updateIssueResponse.get("milestone").toString());
          return updateData.get(k).equals(milestoneData.get("id").toString());
        default:
          return updateData.get(k).equals(updateIssueResponse.get(k).toString());
      }
    }
    return true;
  }

}
