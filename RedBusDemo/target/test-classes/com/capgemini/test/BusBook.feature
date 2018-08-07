Feature: Red bus online booking
Scenario: Booking a bus
	Given user is on HomePage
	Then user has entered "Pune" as source
	And user enters "Mumbai" as destination
	And user selects "15" as the date, "Aug 2018" as the month-year
	When user presses Search buses
	Then the user should move to booking page
	When user selects view seats
	Then boarding pt "Railway Station" is selected by user
	And dropping pt is selected as "BorivaliW" by user
	When user presses proceed
	Then user enters "Jane Austen" as name
	And user selects "male" as gender
	And user enters "22" as age
	And user enters "hellojane@hotmail.com" as email
	And user enters "9876543210" as phone number
	And user selects "yes" checkbox 
	When user selects proceed to pay
	Then user is directed to "" Page