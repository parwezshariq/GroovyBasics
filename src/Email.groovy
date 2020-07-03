/*

class Email {
	String prospectName
	String emailAddress
	Date sendDate
	String notes
	
	def displayContents() {
		println "Recipient: $prospectName\nAddress: $emailAddress\nDate: $sendDate\nSummary: $notes"
	}
}

*/

/*

class Email {
	String prospectName
	String emailAddress
	Date sendDate
	String notes
	
	String displayContents() {
		return "Recipient: $prospectName\nAddress: $emailAddress\nDate: $sendDate\nSummary: $notes"
	}
}

*/

class Email {
	String prospectName
	String emailAddress
	Date sendDate
	String notes
	
	String displayContents() {
		"Recipient: $prospectName\nAddress: $emailAddress\nDate: $sendDate\nSummary: $notes"
	}
}