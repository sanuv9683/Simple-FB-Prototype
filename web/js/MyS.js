/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var res = false;
var res2 = false;
$("#dsds").click(function () {
    if (!res) {
        $("#fwin").fadeIn(1000);
        res = true;
        return;
    }
    if (res) {
        $("#fwin").fadeOut(1000);
        res = false;
        return;
    }

});

$("#rlist").click(function () {
    alert("Request Sent..!");
});



$("#message").click(function () {
    $('#message').css({
        "transition": "bottom 2s",
        "bottom": "10px",
        "background-color": "black"
    });
});

$("#message").click(function () {
    if (!res2) {
        $('#message').css({
            "transition": "bottom 2s",
            "bottom": "10px",
            "background-color": "rgba(13, 10, 3, 0.65)"
        });
        res2 = true;
        return;
    }
    if (res2) {
        $('#message').css({
            "transition": "bottom 2s",
            "bottom": "-350px",
            "background-color": "rgba(13, 10, 3, 0.65)"
        });
        res2 = false;
        return;
    }

});

//$(document).ready(function () {
//    $('#tarea').empty();
//});