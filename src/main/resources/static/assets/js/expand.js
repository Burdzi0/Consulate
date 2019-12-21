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
        if ($.trim($("#contenttext").val())) {
            $('#alert').show()
            $('#error').hide()
        } else {
            $('#error').show()
        }
    }) 
});