Feature: About Personnel information

Scenario: Add Personal information
Given User Launch Chrome Browser
And User maximaze the window
When User opens URL "https://csb-idv4r.netlify.com/"
And User enters Address "Norwood" and "Park Blvd"
And User enters location "Austin" "TX" and "78752"
And User enters contact details "5122180723" and "abc@gmail.com" 
And User enters DOB "03" "03" and "1987"
When User click submit button
And User views personal information 
Then User can view confirmation message "Please double check your information. We use this for verification purposes."
And User click on continue button
Then User view message status "Success!"
#When User application is success click on Startover 
And User close window