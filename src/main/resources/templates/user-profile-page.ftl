<!DOCTYPE html>
<html>
<header>
    <#include "partials/head.ftl">
</header>
<body>


<div class="wrapper">



    <#include "partials/sidebar.ftl">
    <div class="main-panel">
        <!-- Navbar -->
        <#include "partials/navbar.ftl">
        <!-- End Navbar -->
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12">
                        <div class="card ">
                            <div class="card-header ">

                                <!--
                                <div class="d-flex bd-highlight mb-3">
                                  <div class="mr-auto p-2 bd-highlight">Flex item</div>
                                  <div class="p-2 bd-highlight">Flex item</div>
                                  <div class="p-2 bd-highlight">Flex item</div>
                                </div>-->
                                <div class="d-flex bd-highlight mb-3">

                                    <div class="mr-auto p-2 bd-highlight">
                                        <h4 style="padding-bottom: 0.6em;" class="card-title">${user.getFirstName()} ${user.getLastName()}</h4>

                                    </div>



                                </div>
                            </div>
                            <div id="booksTable" class="card-body table-full-width table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                    <tr>
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Email</th>
                                        <th>Edit</th>
                                        <th>Vehicles</th>
                                        <th>Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody >
                                        <tr>
                                            <td>${user.getFirstName()}</td>
                                            <td>${user.getLastName()}</td>
                                            <td>${user.getEmail()}</td>
                                            <td><button class="btn" data-toggle="modal" data-target="#editUser"
                                                onclick="updateuser(${user.getId()})" >
                                                <i class="fa fa-edit" style="font-size:24px; text-align: center"></i>
                                                </button></td>
                                            <td style="padding-left: 1.5em;">
                                                <form action="/admin/vehicles/user" method="GET">
                                                    <input type="hidden" name="id" value="${user.getId()}"/>
                                                    <button class="btn" type="submit" >
                                                        <i class="fa fa-edit" style="font-size:24px; text-align: center"></i>
                                                        </button></form>
                                                </td>
                                            <td style="padding-left: 1.5em;">
                                                <form action="/admin/user/deleteUser" method="GET">
                                                    <input type="hidden" name="id" value="${user.getId()}"/>
                                                    <button class="btn" type="submit" >
                                                        <i class="fa fa-remove" style="font-size:24px; text-align: center"></i>
                                                    </button></form>
                                            </td>;
                                        </tr>
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
            <form id="addUserForm" name="addUserForm" class="form-horizontal" action="/user/createUser" method="POST">
                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="afm">AFM</label>
                                <input type="text" name="afm" class="form-control" placeholder="Enter AFM" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" name="email" class="form-control" placeholder="Enter email" required="true">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="firstName">First Name</label>
                                <input type="text" name="firstName" class="form-control" placeholder="Enter first name" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="lastName">Last Name</label>
                                <input type="text" name="lastName" class="form-control" placeholder="Enter last name" required="true">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="password">Password</label>
                                <input type="password" name="password" class="form-control" placeholder="Enter password" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="password2">Re-enter password</label>
                                <input type="password" name="password2" class="form-control" placeholder="Re-enter password" required="true">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="address">Address</label>
                                <input type="text" name="address" class="form-control" placeholder="Enter address" required="true">
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


<div class="modal fade" id="editUser" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog modal-lg">
        <div class="modal-content ">
            <div class="modal-header">
                <h4 class="modal-title">Edit User</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form id="editUserForm" action="/admin/user/userProfileUpdate" method="POST">

                <div class="modal-body">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input id="id" name="id" type="hidden"/>
                                <label for="afm">AFM</label>
                                <input id="afm" type="text" name="afm" class="form-control" placeholder="Enter AFM" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input id="email" type="email" name="email" class="form-control" placeholder="Enter email" required="true">
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="firstName">First Name</label>
                                <input id="firstName" type="text" name="firstName" class="form-control" placeholder="Enter first name" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="lastName">Last Name</label>
                                <input id="lastName" type="text" name="lastName" class="form-control" placeholder="Enter last name" required="true">
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="address">Address</label>
                                <input id="address" type="text" name="address" class="form-control" placeholder="Enter address" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="roleType">Role</label>
                                <select name="roleType" class="form-control">
                                    <option name="admin" value="ADMIN_ROLE">Admin</option>
                                    <option name="user" value="SIMPLE_USER_ROLE">User</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Update User</button>
                </div>
            </form>
        </div>
    </div>
</div>


<#include "partials/common-scripts.ftl">
<script src="/jsAjax/usersajaxcalls.js"></script>
<script src="/jsAjax/vehiclesajaxcalls.js"></script>

</body>
</html>
