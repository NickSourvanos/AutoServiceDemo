var $sidebarListItems = $('.sidebar .nav li a');

$sidebarListItems.each(function () {

    var link = $(this).attr('href');
    if(window.location.pathname === link ){
        $(this).parent().addClass('active');
    }
});
