<!DOCTYPE html>
<html>
<header>
    <title>Repairs</title>
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
                                <h4 class="card-title">
                                    ${user.getFirstName()} ${user.getLastName()}
                                </h4></br>
                            </div>
                            <div id="booksTable" class="card-body table-full-width table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                    <tr>
                                        <th>Date</th>
                                        <th>Description</th>
                                        <th>Type</th>
                                        <th>Cost</th>
                                        <th>Status</th>
                                    </tr>
                                    </thead>
                                    <tbody>

                                    <!-- #lt iteration here -->
                                    <#list repairs as repair>
                                        <tr>
                                        <td>${repair.getRepairDate()}</td>
                                        <td>${repair.getDescription()}</td>
                                        <td>${repair.getRepairType()}</td>
                                        <td>${repair.getCost()}</td>
                                        <td>${repair.getStatus()} </td>
                                        </tr>
                                    </#list>

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


    <#include "partials/common-scripts.ftl">

</body>
</html>