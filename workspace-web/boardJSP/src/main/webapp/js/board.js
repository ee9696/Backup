function checkboardWriteForm() {
	document.getElementById("subjectDiv").innerText = ""
	document.getElementById("contentDiv").innerText = ""
	
	if(document.boardWriteForm.subject.value == "")
		document.getElementById("subjectDiv").innerText = "제목을 입력하세요"
	else if(document.boardWriteForm.content.value == "")
		document.getElementById("contentDiv").innerText = "내용을 입력하세요"
	else
		document.boardWriteForm.submit();
}