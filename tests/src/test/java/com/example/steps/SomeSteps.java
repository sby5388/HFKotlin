package com.example.steps;

import com.example.components.CurrentPage;
import com.example.components.HomePage;
import com.example.components.SourceCodePage;
import com.example.components.TableOfContentsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.blackpepper.relish.core.TableRow;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SomeSteps
{
    private HomePage homePage = new HomePage();
    private TableOfContentsPage tableOfContentsPage = new TableOfContentsPage();
    private SourceCodePage sourceCodePage = new SourceCodePage();
    private CurrentPage currentPage = new CurrentPage();

    @When("^I launch the app$")
    public void iLaunchTheApp() {
        homePage.launch();
    }

    @Then("^I will see the welcome$")
    public void iWillSeeTheWelcome() {
        homePage.welcome().assertVisible();
    }

    @And("^the title will be '([^']*)'$")
    public void theTitleWillBeHeadFirstKotlin(String expectedTitle) {
        currentPage.pageTitle().matches(expectedTitle);
        currentPage.appBar().title().matches(expectedTitle);
    }

    @And("^I navigate to '([^']*)'$")
    public void iNavigateToTableOfContents(String drawerOption) {
        currentPage.drawer().open(drawerOption);
    }

    @Then("^I will see the following table of contents:$")
    public void iWillSeeTheFollowingTableOfContents(List<TableRow> tocs) {
        tableOfContentsPage.tableOfContents().matches(tocs);
    }

    @Then("^the home page will be visible$")
    public void theHomePageWillBeVisible() {
        homePage.assertVisible();
    }

    @And("^I will see a link to the Github repo$")
    public void iWillSeeALinkToTheGithubRepo() {
        sourceCodePage.repoLinkUrl().matches("https://github.com/dogriffiths/HFKotlin");
        sourceCodePage.repoLink().matches("source code on Github");
        assertEquals(sourceCodePage.repoLink().get().attr("target"), "_blank");
    }
}