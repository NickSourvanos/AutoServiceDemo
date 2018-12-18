<!DOCTYPE html>
<html>
<header>

    <title>User's Vehicles</title>
    <#include "partials/head.ftl">

</header>
<body>

    <div class="wrapper">
        <div class="sidebar">
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
                    <li class="active">
                        <a class="nav-link" href="">
                            <i class="nc-icon nc-notes"></i>
                            <p>Users</p>
                        </a>
                    </li>
                    <li>
                        <a class="nav-link" href="userprofile.html">
                            <i class="nc-icon nc-circle-09"></i>
                            <p>Services</p>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg " color-on-scroll="500">
                <div class=" container-fluid  ">
                    <a href=""> <img height="40" widfth="200" src=""> </a>
                    <button href="" class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                            aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
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
                                    <a class="nav-link" onclick="document.getElementById('formid').submit()"
                                       href="#pablo">
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
                                    <h4 style="padding-bottom: 0.6em;" class="card-title">Vehicles</h4>


                                </div>
                                <div id="booksTable" class="card-body table-full-width table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th>Plate Number</th>
                                            <th>Year of Man.</th>
                                            <th>Color</th>
                                            <th>Model</th>
                                            <th>Edit</th>
                                            <th>Delete</th>
                                        </tr>
                                        </thead>
                                        <tbody id="vehiclesList">

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


    <div class="modal fade" id="addUserFormModal" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content ">
                <div class="modal-header">
                    <h4 class="modal-title">Add User</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form id="addUserForm" name="addUserForm" class="form-horizontal" action="/user/createUser"
                      method="POST">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="afm">AFM</label>
                                    <input type="text" name="afm" class="form-control" placeholder="Enter AFM"
                                           required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="email" name="email" class="form-control" placeholder="Enter email"
                                           required="true">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="firstName">First Name</label>
                                    <input type="text" name="firstName" class="form-control"
                                           placeholder="Enter first name" required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="lastName">Last Name</label>
                                    <input type="text" name="lastName" class="form-control"
                                           placeholder="Enter last name" required="true">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" name="password" class="form-control"
                                           placeholder="Enter password" required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="password2">Re-enter password</label>
                                    <input type="password" name="password2" class="form-control"
                                           placeholder="Re-enter password" required="true">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <input type="text" name="address" class="form-control" placeholder="Enter address"
                                           required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="roleType">Role</label>
                                    <select name="roleType" class="form-control">
                                        <option name="admin" value="ADMIN_ROLE">Admin</option>
                                        <option name="simpleUser" value="SIMPLE_USER_ROLE">User</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button class="btn btn-primary">Create User</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


    <div class="modal fade" id="editVehicle" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content ">
                <div class="modal-header">
                    <h4 class="modal-title">Edit User</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form id="editUserForm" action="/vehicles/updateVehicle" method="POST">

                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input id="vehicleId" name="vehicleId" type="hidden"/>
                                    <label for="plateNumber">Plate Number</label>
                                    <input id="plateNumber" type="text" name="plateNUmber" class="form-control"
                                           placeholder="Enter plate number" required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="model">Model</label>
                                    <input id="model" type="text" name="model" class="form-control"
                                           placeholder="Enter model" required="true">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="yearOfManufacture">Year of Man.</label>
                                    <input id="yearOfManufacture" type="text" name="yearOfManufacture"
                                           class="form-control" placeholder="Year of manufacture" required="true">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="color">Enter color</label>
                                    <input id="color" type="text" name="color" class="form-control"
                                           placeholder="Enter color" required="true">
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Update Vehicle</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


    <script>
        $(document).ready(function () {
            populateVehiclesTable();
        })
    </script>



    <!-- SCRIPTS  -->
    <#include "partials/common-scripts.ftl">

</body>
</html>
