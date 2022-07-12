$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/MainPage.feature");
formatter.feature({
  "line": 1,
  "name": "Set Skywhite Background",
  "description": "",
  "id": "set-skywhite-background",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User Should be able to change the color of the background to skyblue",
  "description": "",
  "id": "set-skywhite-background;user-should-be-able-to-change-the-color-of-the-background-to-skyblue",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Set Skyblue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "MainStepDefinition.set_skyblue_background_button_exists()"
});
formatter.result({
  "duration": 5224792900,
  "status": "passed"
});
formatter.match({
  "location": "MainStepDefinition.when_i_click_on_the_button()"
});
formatter.result({
  "duration": 3091353100,
  "status": "passed"
});
formatter.match({
  "location": "MainStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 320159299,
  "status": "passed"
});
});