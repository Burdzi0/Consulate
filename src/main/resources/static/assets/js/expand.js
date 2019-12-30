$(".collapse").click(function() {
    if($("#collapseme").hasClass("out")) {
        $("#collapseme").addClass("in");
        $("#collapseme").removeClass("out");
    } else {
        $("#collapseme").addClass("out");
        $("#collapseme").removeClass("in");
    }
});


$(document).ready(function(){
    $('button').click(function(){
        if (!$.trim($("#contenttext").val())) {
            $('#error').show()
        } else {
            $('#error').hide()
        }
    }) 
});