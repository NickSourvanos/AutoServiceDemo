function populateRepairsTable(){

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/api/repairs',
        success: function(result){
            var repair_data = '';
            result.forEach(function(d){
                repair_data += "<tr>";
                repair_data += '<td>' + d.repairDate + '</td>';
                repair_data += '<td>' + d.status + '</td>';
                repair_data += '<td>' + d.repairType + '</td>';
                repair_data += '<td>' + d.cost + '</td>';
                repair_data += '<td>' + d.description + '</td>';
                repair_data += '<td style="padding-left: 1.5em;">' +
                    '<button class="btn" data-toggle="modal" data-target="#editRepairFormModal"' +
                    'onclick="updaterepair(' + d.repairId + ')" >'+
                    '<i class="fa fa-edit" style="font-size:24px; text-align: center"></i>'+
                    '</button>' +
                    '</td>';
                repair_data += '<td style="padding-left: 1.5em;">' +                     ///DELETE
                    '<button class="btn" onclick="deleterepair(' + d.repairId + ')">'+
                    '<i class="fa fa-remove" style="font-size:24px; text-align: center"></i>'+
                    '</button>' +
                    '</td>';
                repair_data += '</tr>';
            });
            $('#repairsList').html(repair_data);
        }
    });
}


function deleterepair(repairId){
    var result = confirm("Are you sure? Repair ID: " + repairId);

    if(result){
        $.ajax({
            type: 'GET',
            url: 'http://localhost:8080/admin/api/repairs/deleteRepair?id='+repairId,
            success: function(){
                populateRepairsTable();
            }
        });
    }
}


function updaterepair(repairId){

    $.ajax({
        type: 'GET',
        url: 'http://localhost:8080/admin/api/repair?id='+repairId,
        success: function(result){
            alert(result.vehicle.vehicleId);
            document.getElementById('vehicleId').value = result.vehicle.vehicleId;
            document.getElementById('repairId').value = repairId;
            document.getElementById('repairDate').value = result.repairDate;
            document.getElementById('cost').value = result.cost;
            document.getElementById('description').value = result.description;
            document.getElementById('status').value = result.status;
            document.getElementById('repairType').value = result.repairType;
        }
    });
}

$(document).ready(function () {
    populateRepairsTable();
})