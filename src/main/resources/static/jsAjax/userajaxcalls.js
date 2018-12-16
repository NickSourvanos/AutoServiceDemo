function populateTable(){
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/api/users',
        success: function(result){
            var users_data = '';
            result.forEach(function(d){
                users_data += "<tr>";
                users_data += '<td>' + d.firstName + '</td>';
                users_data += '<td>' + d.lastName + '</td>';
                users_data += '<td>' + d.email + '</td>';
                users_data += '<td style="padding-left: 1.5em;">' +
                    '<button class="btn" data-toggle="modal" data-target="#editUser" ' +
                    'onclick="updateuser(' + d.id + ')" >'+
                    '<i class="fa fa-edit" style="font-size:24px; text-align: center"></i>'+
                    '</button>' +
                    '</td>';
                users_data += '<td style="padding-left: 1.5em;">' +
                    '<form action="/admin/vehicles/user" method="GET">' +
                    '<input type="hidden" name="id" value="' + d.id + '"/> '+
                    '<button class="btn" type="submit" >'+
                    '<i class="fa fa-edit" style="font-size:24px; text-align: center"></i>'+
                    '</button></form>' +
                    '</td>';
                users_data += '<td style="padding-left: 1.5em;">' +
                    '<form action="/admin/user/deleteUser" method="GET">' +
                    '<input type="hidden" name="id" value="' + d.id + '"/> '+
                    '<button class="btn" type="submit" >'+
                    '<i class="fa fa-remove" style="font-size:24px; text-align: center"></i>'+
                    '</button></form>' +
                    '</td>';
                users_data += '</tr>';
            });
            $('#usersList').html(users_data);
        }
    });

}



function redirect(){
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/vehicles'
    });
}

function updateuser(userId){

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/api/user?id='+userId,
        success: function(result){
            document.getElementById('id').value = result.id;
            document.getElementById('afm').value = result.afm;
            document.getElementById('email').value = result.email;
            document.getElementById('firstName').value = result.firstName;
            document.getElementById('lastName').value = result.lastName;
            document.getElementById('address').value = result.address;
            document.getElementById('password').value = result.password;
            document.getElementById('password2').value = result.password2;
            if(result.role === "SIMPLE_ROLE_TYPE"){
                document.getElementsByName('role').value = "SIMPLE_USER_ROLE";
            }if(result.role === "ADMIN_ROLE"){
                document.getElementsByName('role').value = "ADMIN_ROLE";
            }
        }
    });
}

