<!DOCTYPE html>
<html>
<header>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>IREAD</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=greek" rel="stylesheet">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->

    <link rel="stylesheet" href="/css/light-bootstrap-dashboard.css?v=2.0.1"/>
    <link rel="text/javascript" href="/js/core/jquery.3.2.1.min.js"/>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>




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
                <li  class="active">
                    <a class="nav-link" href="">
                       <i class="nc-icon nc-notes"></i>
                       <p>Users</p>
                    </a>
                </li>
                <li>
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
                            <div class="card-header">
                                <div class="d-flex bd-highlight mb-3">
                                    <div class="mr-auto p-2 bd-highlight">
                                        <h4 style="padding-bottom: 0.6em;" class="card-title">Users</h4>
                                        <button id="students" class="btn btn-primary"
                                                data-toggle="modal" data-target="#addUserFormModal">Add User</button>
                                    </div>

                                    <div class="p-2 bd-highlight">
                                        <form id="afmSearchForm" action="/admin/user/afmSearch" method="POST">
                                            <input id="afmS" name="afmS" class="form-control form-control-sm mr-2 w-95" type="text" placeholder="AFM" aria-label="Search" required="true">
                                        </form>
                                    </div>

                                    <div class="p-2 bd-highlight">
                                        <button class="btn" onclick="document.getElementById('afmSearchForm').submit();">
                                            <i class="fa fa-search" aria-hidden="true"></i>
                                        </button>

                                    </div>

                                    <div class="p-2 bd-highlight">
                                        <form id="emailSearchForm" action="/admin/user/emailSearch" method="POST">
                                            <input id="emailS" type="email" name="emailS" class="form-control form-control-sm mr-5 w-95" type="text" placeholder="Email" aria-label="Search" required="true">
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
                                        <th>First Name</th>
                                        <th>Last Name</th>
                                        <th>Email</th>
                                        <th>Manage</th>
                                        <th>Vehicles</th>
                                        <th>Delete</th>
                                    </tr>
                                    </thead>
                                    <tbody id="usersList">

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
            <form id="addUserForm" name="addUserForm" class="form-horizontal" action="/admin/user/createUser" method="POST">
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
            <form id="editUserForm" action="/admin/user/updateUser" method="POST">
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
                                <label for="password">Password</label>
                                <input id="password" type="password" name="password" class="form-control" placeholder="Enter password" required="true">
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <label for="password2">Re-enter password</label>
                                <input id="password2" type="password" name="password2" class="form-control" placeholder="Re-enter password" required="true">
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
                    <button type="submit" class="btn btn-primary" >Update User</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script>
    $('document').ready(function () {
        populateTable();
    });
</script>

<script src="/jsAjax/userajaxcalls.js" type="text/javascript"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


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
