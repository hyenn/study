function inputData(){
	
	var book = $('#form').serialize();
	$.ajax({
		url: "/test7_1",
		data: book,
		type: "POST",
		cache: false
	}).done(function(fragment) {
		$("#list").replaceWith(fragment);
	});
}

function inputData2(){
	
	var book = $('#form').serialize();
	$.ajax({
		url: "/test8",
		data: book,
		type: "POST",
		chche: false
	}).done(function(fragment) {
		if($(fragment).find("#form").prevObject["0"].length>0){
			$("#form").replaceWith(fragment);
		}
		else{
			$("#list").replaceWith(fragment);
			$("input[type=text]").val("");
			$('.err').text("");
		}
	});
}