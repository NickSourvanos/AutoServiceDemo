<!DOCTYPE html>
<html>
<header>

    <title>User Records</title>
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
                                <div class="card-header">
                                    <div class="d-flex bd-highlight mb-3">
                                        <div class="mr-auto p-2 bd-highlight">
                                            <h4 style="padding-bottom: 0.6em;" class="card-title">Users</h4>
                                            <button id="add-user-btn" class="btn btn-primary"
                                                    data-toggle="modal" data-target="#addUserFormModal">Add User
                                            </button>
                                        </div>

                                        <!-- AFM Search Bar -->
                                        <div class="p-2 bd-highlight">
                                            <form id="afmSearchForm" action="/admin/user/afmSearch" method="POST">
                                                <input id="afmS" name="afmS"
                                                       class="form-control form-control-sm mr-2 w-95"
                                                       type="text" placeholder="AFM" aria-label="Search">
                                            </form>
                                        </div>

                                        <div class="p-2 bd-highlight">
                                            <button class="btn"
                                                    onclick="document.getElementById('afmSearchForm').submit();">
                                                <i class="fa fa-search" aria-hidden="true"></i>
                                            </button>
                                        </div>

                                        <!-- E-MAIL Search Bar -->
                                        <div class="p-2 bd-highlight">
                                            <form id="emailSearchForm" action="/admin/user/emailSearch" method="POST">
                                                <input id="emailS" type="email" name="emailS"
                                                       class="form-control form-control-sm mr-5 w-95"
                                                       placeholder="Email" aria-label="Search">
                                            </form>
                                        </div>

                                        <div class="p-2 bd-highlight">
                                            <button type="submit" class="btn"
                                                    onclick="document.getElementById('emailSearchForm').submit();">
                                                <i class="fa fa-search" aria-hidden="true"></i>
                                            </button>
                                        </div>
                                    </div>
                                </div>

                                <!-- TABLE-->
                                <div id="booksTable" class="card-body table-full-width table-responsive">
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Email</th>
                                            <th>Manage</th>
                                            <th>Vehicles</th>
                                            <th>Delete</th>
                                        </tr>
                                        </thead>
                                        <tbody id="usersList">
                                        <!-- Users get populated here -->
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

            <!-- FOOTER -->
            <#include "partials/footer.ftl">

        </div>
    </div>


    <!-- MODAL SECTION -->

    <!-- CREATE USER MODAL -->
    <div class="modal fade" id="addUserFormModal" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content ">
                <div class="modal-header">
                    <h4 class="modal-title">Add User</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form id="addUserForm" name="addUserForm" class="form-horizontal" action="/admin/user/createUser"
                      method="POST">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="afm">AFM</label>
                                    <input type="text" name="afm" class="form-control" placeholder="Enter AFM"
                                           required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="email" name="email" class="form-control" placeholder="Enter email"
                                           required="required">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="firstName">First Name</label>
                                    <input type="text" name="firstName" class="form-control"
                                           placeholder="Enter first name" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="lastName">Last Name</label>
                                    <input type="text" name="lastName" class="form-control"
                                           placeholder="Enter last name" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" name="password" class="form-control"
                                           placeholder="Enter password" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="password2">Re-enter password</label>
                                    <input type="password" name="password2" class="form-control"
                                           placeholder="Re-enter password" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <input type="text" name="address" class="form-control"
                                           placeholder="Enter address" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="roleType">Role
                                        <select name="roleType" class="form-control">
                                            <option name="admin" value="ADMIN_ROLE">Admin</option>
                                            <option name="simpleUser" value="SIMPLE_USER_ROLE">User</option>
                                        </select>
                                    </label>
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

    <!-- UPDATE User Modal -->
    <div class="modal fade" id="editUser" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content ">
                <div class="modal-header">
                    <h4 class="modal-title">Edit User</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <form id="editUserForm" action="/admin/user/updateUser" method="POST">
                    <div class="modal-body">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <input id="id" name="id" type="hidden"/>
                                    <label for="afm">AFM</label>
                                    <input id="afm" type="text" name="afm" class="form-control" placeholder="Enter AFM"
                                           required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input id="email" type="email" name="email" class="form-control"
                                           placeholder="Enter email" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="firstName">First Name</label>
                                    <input id="firstName" type="text" name="firstName" class="form-control"
                                           placeholder="Enter first name" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="lastName">Last Name</label>
                                    <input id="lastName" type="text" name="lastName" class="form-control"
                                           placeholder="Enter last name" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input id="password" type="password" name="password" class="form-control"
                                           placeholder="Enter password" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="password2">Re-enter password</label>
                                    <input id="password2" type="password" name="password2" class="form-control"
                                           placeholder="Re-enter password" required="required">
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="address">Address</label>
                                    <input id="address" type="text" name="address" class="form-control"
                                           placeholder="Enter address" required="required">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="roleType">Role
                                        <select name="roleType" class="form-control">
                                            <option name="admin" value="ADMIN_ROLE">Admin</option>
                                            <option name="user" value="SIMPLE_USER_ROLE">User</option>
                                        </select>
                                    </label>
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


    <#--TODO: Ask Ema-->
    <#--alertMessage(${message}, function(){-->
        <#--alert(${message});-->
    <#--});-->

    <!-- SCRIPTS  -->
    <#include "partials/common-scripts.ftl">

</body>

</html>
