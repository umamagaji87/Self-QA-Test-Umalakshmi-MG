$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/PeronalInfo.feature");
formatter.feature({
  "line": 1,
  "name": "About Personnel information",
  "description": "",
  "id": "about-personnel-information",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1348035081,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Add Personal information",
  "description": "",
  "id": "about-personnel-information;add-personal-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User maximaze the window",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User opens URL \"https://csb-idv4r.netlify.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Address \"Norwood\" and \"Park Blvd\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters location \"Austin\" \"TX\" and \"78752\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters contact details \"5122180723\" and \"abc@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters DOB \"03\" \"03\" and \"1987\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click submit button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User views personal information",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User can view confirmation message \"Please double check your information. We use this for verification purposes.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User view message status \"Success!\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 16,
      "value": "#When User application is success click on Startover"
    }
  ],
  "line": 17,
  "name": "User close window",
  "keyword": "And "
});
formatter.match({
  "location": "AddInfoStep.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 89763650,
  "status": "passed"
});
formatter.match({
  "location": "AddInfoStep.user_maximaze_the_window()"
});
formatter.result({
  "duration": 136072866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://csb-idv4r.netlify.com/",
      "offset": 16
    }
  ],
  "location": "AddInfoStep.user_opens_URL(String)"
});
formatter.result({
  "duration": 918969359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Norwood",
      "offset": 21
    },
    {
      "val": "Park Blvd",
      "offset": 35
    }
  ],
  "location": "AddInfoStep.user_enters_Address_and(String,String)"
});
formatter.result({
  "duration": 454841467,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Austin",
      "offset": 22
    },
    {
      "val": "TX",
      "offset": 31
    },
    {
      "val": "78752",
      "offset": 40
    }
  ],
  "location": "AddInfoStep.user_enters_location_and(String,String,String)"
});
formatter.result({
  "duration": 1837305380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5122180723",
      "offset": 29
    },
    {
      "val": "abc@gmail.com",
      "offset": 46
    }
  ],
  "location": "AddInfoStep.user_enters_contact_details_and(String,String)"
});
formatter.result({
  "duration": 992773453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03",
      "offset": 17
    },
    {
      "val": "03",
      "offset": 22
    },
    {
      "val": "1987",
      "offset": 31
    }
  ],
  "location": "AddInfoStep.user_enters_DOB_and(String,String,String)"
});
formatter.result({
  "duration": 1363597831,
  "status": "passed"
});
formatter.match({
  "location": "AddInfoStep.user_click_submit_button()"
});
formatter.result({
  "duration": 4663449061,
  "status": "passed"
});
formatter.match({
  "location": "VerfiyInfoStep.user_views_personal_information()"
});
formatter.result({
  "duration": 2964220913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please double check your information. We use this for verification purposes.",
      "offset": 36
    }
  ],
  "location": "VerfiyInfoStep.user_can_view_confirmation_message(String)"
});
formatter.result({
  "duration": 35627397,
  "status": "passed"
});
formatter.match({
  "location": "VerfiyInfoStep.user_click_on_continue_button()"
});
formatter.result({
  "duration": 55798838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Success!",
      "offset": 26
    }
  ],
  "location": "SubmitInfoStep.user_view_message_status(String)"
});
formatter.result({
  "duration": 23371765,
  "status": "passed"
});
formatter.match({
  "location": "SubmitInfoStep.user_close_window()"
});
formatter.result({
  "duration": 71455424,
  "status": "passed"
});
});