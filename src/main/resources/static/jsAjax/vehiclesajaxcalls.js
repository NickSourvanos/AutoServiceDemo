function populateVehiclesTable(){
    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/api/vehicles',
        success: function(result){
            var vehicles_data = '';
            result.forEach(function(d){
                vehicles_data += "<tr>";
                vehicles_data += '<td>' + d.plateNUmber + '</td>';
                vehicles_data += '<td>' + d.yearOfManufacture + '</td>';
                vehicles_data += '<td>' + d.color + '</td>';
                vehicles_data += '<td>' + d.model + '</td>';
                vehicles_data += '<td style="padding-left: 1.5em;">' +
                    '<button class="btn" data-toggle="modal" data-target="#editVehicle" ' +
                    'onclick="updateVehicle(' + d.vehicleId + ')" >'+
                    '<i class="fa fa-edit" style="font-size:24px; text-align: center"></i>'+
                    '</button>' +
                    '</td>';
                vehicles_data += '<td style="padding-left: 1.5em;">' +
                    '<form action="/admin/vehicle/deleteVehicle" method="GET">' +
                    '<input type="hidden" name="vehicleId" value="' + d.vehicleId + '"/> '+
                    '<button class="btn" type="submit" >'+
                    '<i class="fa fa-remove" style="font-size:24px; text-align: center"></i>'+
                    '</button></form>' +
                    '</td>';

                vehicles_data += '</tr>';
            });
            $('#vehiclesList').html(vehicles_data);
        }
    });
}


function updateVehicle(vehicleId){

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/api/vehicle?vehicleId='+vehicleId,
        success: function(result){
            document.getElementById('vehicleId').value = result.vehicleId
            document.getElementById('plateNumber').value = result.plateNUmber;
            document.getElementById('yearOfManufacture').value = result.yearOfManufacture;
            document.getElementById('color').value = result.color;
            document.getElementById('model').value = result.model;
        }
    });
}
