<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
<header>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Repairs</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=greek" rel="stylesheet">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->

    <link rel="stylesheet" href="/css/light-bootstrap-dashboard.css?v=2.0.1"/>
    <link rel="text/javascript" href="/js/core/jquery.3.2.1.min.js"/>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>



    <script src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <style>

        .sidebar-wrapper{
            background-color: #585858;
        }

        .logo{
            text-align: center;
        }

        tbody {
            display: block;
            max-height: 400px;
            overflow-y: scroll;
        }

        thead, tbody tr {
            display: table;
            width: 100%;
            table-layout: fixed;
        }

        .footer{
            background-color: #E8E8E8;
            max-height: 4.9em;
        }

        .modal-lg{
            max-width: 80%;

        }




    </style>
</header>
<body>


<div class="wrapper">

    <div class="sidebar" >
        <!--
    Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

    Tip 2: you can also add an image using data-image tag
-->
        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="" class="simple-text">

                </a>
            </div>
            <ul class="nav">
                <li>
                    <a class="nav-link" href="/admin">
                       <i class="nc-icon nc-notes"></i>
                       <p>Users</p>
                    </a>
                </li>
                <li class="active">
                    <a class="nav-link" href="/admin/repairs">
                        <i class="nc-icon nc-circle-09"></i>
                        <p>Repairs</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    <div class="main-panel">
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg " color-on-scroll="500">
            <div class=" container-fluid  ">
                <a  href=""> <img height="40" widfth="200"  src=""> </a>
                <button href="" class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar burger-lines"></span>
                    <span class="navbar-toggler-bar burger-lines"></span>
                    <span class="navbar-toggler-bar burger-lines"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navigation">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="">
                                <span class="no-icon">Account</span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <form id="formid" action="index.html" method="POST">
                                <a class="nav-link" onclick="document.getElementById('formid').submit()" href="#pablo">
                                    <span class="no-icon">Log out</span>
                                </a>
                            </form>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- End Navbar -->
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12">
                        <div class="card ">
                            <div class="card-header ">
                                <div class="d-flex bd-highlight mb-3">
                                    <div class="mr-auto p-2 bd-highlight">
                                        <h4 style="padding-bottom: 0.6em;" class="card-title">Repairs</h4>
                                        <!-- TODO: Add data target -->
                                        <button id="addRepairtbtn" class="btn btn-primary"
                                                data-toggle="modal" data-target="#addRepairFormModal" onclick="populateParts()">
                                            Add Repair</button>
                                    </div>

                                    <div class="p-2 bd-highlight">
                                        <!-- TODO: Add action -->
                                        <form id="afmSearchForm" action="" method="POST">
                                            <input id="afmS" name="afmS" class="form-control form-control-sm mr-2 w-95" type="text" placeholder="AFM" aria-label="Search">
                                        </form>
                                    </div>
                                        <!-- TODO: Add onclick -->
                                    <div class="p-2 bd-highlight">
                                        <button class="btn" onclick="document.getElementById('').submit();">
                                            <i class="fa fa-search" aria-hidden="true"></i>
                                        </button>

                                    </div>

                                    <div class="p-2 bd-highlight">
                                        <form id="emailSearchForm" action="/admin/user/emailSearch" method="POST">
                                            <input id="emailS" type="email" name="emailS" class="form-control form-control-sm mr-5 w-95" type="text" placeholder="Email" aria-label="Search">
                                        </form>
                                    </div>

                                    <div class="p-2 bd-highlight">
                                        <button type="submit" class="btn" onclick="document.getElementById('emailSearchForm').submit();">
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
                                        <th>Cost </th>
                                        <th>Description</th>
                                        <th>Manage</th>
                                        <th>Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody id="repairsList">

                                    </tbody>

                                </table>
                            </div>
                            <div class="card-footer ">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer">
            <div class="container">
                <p class="copyright text-center" style="font-size: 13px;">
                    <span><img style="width: 35px;" src=""></span>Auto Service Site</br>Welcome
                </p>
            </div>
        </footer>
    </div>
</div>

<script>


</script>


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
                <form id="addRepairForm" name="addRepairForm" class="form-horizontal" action="/admin/repairs/createRepair" method="POST">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="date">Date</label>
                                <input type="text" name="date" class="form-control" placeholder="Enter Date" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="cost">Cost</label>
                                <input type="text" name="cost" class="form-control" placeholder="Enter Cost" required="true">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="description">Description</label>
                                <input type="text" name="description" class="form-control" placeholder="Enter Description" required="true">
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
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="partTypeListAddForm">Part Type</label>
                                <fieldset id="partsListAddForm">
                                    <#-- Parts get populated here -->
                                </fieldset>
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
                    <form id="editRepairForm" action="" method="POST">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input type="hidden" id="id" name="id">
                                    <label for="date">Date</label>
                                    <input type="text" id="date" name="date" class="form-control" placeholder="Enter Date" required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="cost">Cost</label>
                                    <input type="text" id="cost" name="cost" class="form-control" placeholder="Enter Cost" required="true">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="description">Description</label>
                                    <input type="text" id="description" name="description" class="form-control" placeholder="Enter Description" required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="repairType">Repair Type</label>
                                    <select class="form-control" id="repairType", name="repairType">
                                        <option selected disabled>Select...</option>
                                        <option value="MINOR_REPAIR">Minor Repair</option>
                                        <option value="MAJOR_REPAIR">Major Repair</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="repairStatus">Status</label>
                                    <select class="form-control" id="repairStatus", name="repairStatus">
                                        <option selected disabled>Select...</option>
                                        <option value="PENDING">Pending</option>
                                        <option value="COMPLETED">Completed</option>
                                        <option value="IN_PROGRESS">In Progress</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="partType">Part Type</label>
                                    <fieldset id="partsListEditForm" name="partType">
                                    <#-- Here get populated Vehicle Parts -->
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Update User</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script>

    $(document).ready(function () {
        populateRepairsTable();
    });

</script>


<script src="/jsAjax/repairsajaxcalls.js" type="text/javascript"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/js/bootstrap-multiselect.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-multiselect/0.9.13/css/bootstrap-multiselect.css">

<script src="/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="/js/core/popper.min.js" type="text/javascript"></script>
<script src="/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="/js/plugins/bootstrap-switch.js"></script>
<!--  Chartist Plugin  -->
<script src="/js/plugins/chartist.min.js"></script>
<!--  Notifications Plugin    -->
<script src="/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->
<script src="/js/light-bootstrap-dashboard.js?v=2.0.1" type="text/javascript"></script>

</body>
</html>
