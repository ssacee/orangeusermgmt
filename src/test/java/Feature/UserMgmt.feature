Feature: Orange HRM 

@login 
Scenario: User launches OrangeHRM application 
	Given User launches Chrome browser 
	When User enter valid <username> and <password> 
	Then User validate to login the orange HRM application 
	
@Adminandusermanagement 
Scenario: User navigates to admin tab and user management 
	Given User mouseover admin tab and click 
	When User mouse over to user management tab and click 
	Then User validate to display the search button 
	
@Valuesgiventosearch 
Scenario: User Enter the valid values 
	Given User Enter the Username value as "Admin" 
	And User selects the Userrole as ESS 
	And User Enter the Employeename as "paul" 
	And User selects the status  as Enabled 
	Then User click to search and take screenshot 
	
@AscendingDescendingusername 
Scenario: User can view ascending and descending order based on username 
	Given User mouseover to username tab 
	And User click downarrow to display in ascending order 
	And User click uparrow to display in descending order 
	Then User validate and take screenshot 
@AscendingDescendinguserrole 
Scenario: User can view ascending and descending order based on userrole 
	Given User mouseover to userrole tab 
	And User click downarrow to display in ascending order based on userrole
	And User click uparrow to display in descending order based on userrole
	Then User validate and take screenshot based on userrole 
	
@AscendingDescendingEmployeename 
Scenario: User can view ascending and descending order based on Employeename 
	Given User mouseover to Employeename tab 
	And User click downarrow to display in ascending order based on Employeename
	And User click uparrow to display in descending order based on Employeename
	Then User validate and take screenshot based on Employeename
@AscendingDescendingStatus 
Scenario: User can view ascending and descending order based on Status 
	Given User mouseover to Status tab 
	And User click downarrow to display in ascending order based on Status
	And User click uparrow to display in descending order based on Status
	Then User validate and take screenshot based on Status
	
@HideOptions 
Scenario: User Click to HideOptions 
	Given User mouse over to System User 
	When User clicks System user tab 
	Then User clicks validate to hide search tab and take screenshot