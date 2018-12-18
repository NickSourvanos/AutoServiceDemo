<!DOCTYPE html>
<html>
<header>

    <title>Repair Records</title>
    <#include "partials/head.ftl">

</header>

<body>

<div class="wrapper">
    <!-- SIDEBAR -->
    <#include "partials/sidebar.ftl">

    <!-- MAIN CONTENT -->
    <div class="main-panel">
        <!-- NAVBAR -->
        <#include "partials/navbar.ftl">


        <!-- CONTENT -->
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12">
                        <div class="card ">
                            <div class="card-header ">
                                <div class="d-flex bd-highlight mb-3">
                                    <div class="mr-auto p-2 bd-highlight">
                                        <h4 style="padding-bottom: 0.6em;" class="card-title">Repairs</h4>
                                    </div>

                                    <!--   Date picker   -->
                                    <div class="p-2 bd-highlight">
                                        <!-- TODO: Add action -->
                                        <form id="searchDateForm" action="/admin/repairs/byDate" method="GET">
                                            <input id="startDate" type="text" name="startDate"
                                                   class="form-control form-control-sm mr-2 w-95" type="text"
                                                   placeholder="Start Date" aria-label="Search">

                                            <input id="endDate" type="text" name="endDate"
                                                   class="form-control form-control-sm mr-5 w-95"
                                                   placeholder="End Date" aria-label="Search">
                                        </form>
                                    </div>
                                    <div class="p-2 bd-highlight">
                                        <button class="btn" onclick="document.getElementById('searchDateForm').submit();">
                                            <i class="fa fa-search" aria-hidden="true"></i>
                                        </button></br>

                                    </div>


                                    <!-- AFM Search Bar -->
                                    <div class="p-2 bd-highlight">
                                        <!-- TODO: Add action -->
                                        <form id="afmSearchForm" action="/admin/repairs/byAfm" method="GET">
                                            <input id="afm" name="afm"
                                                   class="form-control form-control-sm mr-2 w-95" type="text"
                                                   placeholder="AFM" aria-label="Search">
                                        </form>
                                        <form id="plateSearchForm" action="/admin/repairs/byPlate" method="GET">
                                            <input id="plateNUmber" type="text" name="plateNUmber"
                                                   class="form-control form-control-sm mr-5 w-95"
                                                   placeholder="Plate Number" aria-label="Search">
                                        </form>
                                    </div>
                                    <div class="p-2 bd-highlight">
                                        <button class="btn" onclick="document.getElementById('afmSearchForm').submit();">
                                            <i class="fa fa-search" aria-hidden="true"></i>
                                        </button></br>
                                        <button  type="submit" class="btn"
                                                 onclick="document.getElementById('plateSearchForm').submit();">
                                            <i class="fa fa-search" aria-hidden="true"></i>
                                        </button>
                                    </div>

                                </div>
                            </div>
                            <div id="booksTable" class="card-body table-full-width table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                    <tr>
                                        <th>Date</th>
                                        <th>Status</th>
                                        <th>Type</th>
                                        <th>Cost</th>
                                        <th>Description</th>
                                        <th>Manage</th>
                                        <th>Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <#list repairs as repair>
                                            <tr>
                                                <td>${repair.getRepairDate()}</td>
                                                <td>${repair.getStatus()}</td>
                                                <td>${repair.getRepairType()}</td>
                                            <td>${repair.getCost()}</td>
                                                <td>${repair.getDescription()}</td>
                                                <td style="padding-left: 1.5em;">
                                                    <button class="btn" data-toggle="modal" data-target="#editRepairFormModal"
                                                        onclick="updaterepair(${repair.getRepairId()})" >
                                                        <i class="fa fa-edit" style="font-size:24px; text-align: center"></i>
                                                    </button>
                                                </td>
                                                <td style="padding-left: 1.5em;">
                                                    <button class="btn" onclick="deleterepair(${repair.getRepairId()})">
                                                        <i class="fa fa-remove" style="font-size:24px; text-align: center"></i>
                                                    </button>
                                                </td>

                                            </tr>
                                        </#list>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="modal fade" id="addRepairFormModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">Add Repair</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form id="addRepairForm" name="addRepairForm" class="form-horizontal"
                      action="/admin/repairs/createRepair" method="POST">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="date">Date</label>
                                <input type="text" name="date" class="form-control" placeholder="Enter Date"
                                       required="required">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="cost">Cost</label>
                                <input type="text" name="cost" class="form-control" placeholder="Enter Cost"
                                       required="required">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="description">Description</label>
                                <input type="text" name="description" class="form-control"
                                       placeholder="Enter Description" required="required">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="repairType">Repair Type</label>
                                <select class="form-control" name="repairType">
                                    <option selected disabled>Select...</option>
                                    <optionv value="MINOR_REPAIR">Minor Repair</optionv>
                                    <option value="MAJOR_REPAIR">Major Repair</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="repairStatus">Status</label>
                                <select class="form-control" name="repairStatus">
                                    <option selected disabled>Select...</option>
                                    <option value="PENDING">Pending</option>
                                    <option value="COMPLETED">Completed</option>
                                    <option value="IN_PROGRESS">In Progress</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </form>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button class="btn btn-primary">Create Repair</button>
            </div>
        </div>
    </div>
</div>


<div class="modal fade" id="editRepairFormModal" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content ">
            <div class="modal-header">
                <h4 class="modal-title">Edit Repair</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <#-- Add actions -->
            <div class="modal-body">
                <form id="editRepairForm" action="/admin/repairs/updateRepair" method="POST">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="hidden" id="repairId" name="repairId">
                                <input type="hidden" id="vehicleId" name="vehicleId">
                                <label for="repairDate">Date</label>
                                <input type="text" id="repairDate" name="repairDate" class="form-control"
                                       placeholder="Enter Date" required="required">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="cost">Cost</label>
                                <input type="text" id="cost" name="cost" class="form-control"
                                       placeholder="Enter Cost" required="required">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="description">Description</label>
                                <input type="text" id="description" name="description" class="form-control"
                                       placeholder="Enter Description" required="required">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="repairType">Repair Type</label>
                                <select class="form-control" id="repairType" name="repairType">
                                    <option selected disabled>Select...</option>
                                    <option value="MINOR_REPAIR">Minor Repair</option>
                                    <option value="MAJOR_REPAIR">Major Repair</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="status">Status</label>
                                <select class="form-control" id="status" name="status">
                                    <option selected disabled>Select...</option>
                                    <option value="PENDING">Pending</option>
                                    <option value="COMPLETED">Completed</option>
                                    <option value="IN_PROGRESS">In Progress</option>
                                </select>
                            </div>
                        </div>

                    </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="submit" class="btn btn-primary">Update Service</button>
            </div>
            </form>
        </div>
    </div>
</div>


<!-- SCRIPTS-->
<#include "partials/common-scripts.ftl">

</body>

</html>
