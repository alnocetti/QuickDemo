<@layout.layout; section>	
	<#if section = "styles">
		
	</#if>
	<#if section = "content">	


    <style>
 
.icon-refresh {
    position: relative;
    top: -35px;
   font-size: inherit !important;    
    -webkit-animation: rotation 2s infinite linear;
}
@-webkit-keyframes rotation {
        from {
                -webkit-transform: rotate(0deg);
        }
        to {
                -webkit-transform: rotate(359deg);
        }
}


    </style>
    <div class="content-wrapper">
            <nav id="toolbar" class="fixed-top bg-white">
    <div class="row no-gutters align-items-center flex-nowrap">

        <div class="col">

            <div class="row no-gutters align-items-center flex-nowrap">
                    <button type="button" class="toggle-aside-button btn btn-icon d-block d-lg-none"
                            data-fuse-bar-toggle="aside">
                        <i class="icon icon-menu"></i>
                    </button>

                    <div class="toolbar-separator d-block d-lg-none"></div>
                <div class="shortcuts-wrapper row no-gutters align-items-center px-0 px-sm-2">

                    <div class="shortcuts row no-gutters align-items-center d-none d-md-flex">

                        <a href="apps-chat.html" class="shortcut-button btn btn-icon mx-1">
                            <i class="icon icon-hangouts"></i>
                        </a>

                        <a href="apps-contacts.html" class="shortcut-button btn btn-icon mx-1">
                            <i class="icon icon-account-box"></i>
                        </a>

                        <a href="apps-mail.html" class="shortcut-button btn btn-icon mx-1">
                            <i class="icon icon-email"></i>
                        </a>

                    </div>

                    <div class="add-shortcut-menu-button dropdown px-1 px-sm-3">

                        <div class="dropdown-toggle btn btn-icon" role="button"
                             id="dropdownShortcutMenu"
                             data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="icon icon-star text-amber-600"></i>
                        </div>

                        <div class="dropdown-menu" aria-labelledby="dropdownShortcutMenu">

                            <a class="dropdown-item" href="#">
                                <div class="row no-gutters align-items-center justify-content-between flex-nowrap">
                                    <div class="row no-gutters align-items-center flex-nowrap">
                                        <i class="icon icon-calendar-today"></i>
                                        <span class="px-3">Calendar</span>
                                    </div>
                                    <i class="icon icon-pin s-5 ml-2"></i>
                                </div>
                            </a>

                            <a class="dropdown-item" href="#">
                                <div class="row no-gutters align-items-center justify-content-between flex-nowrap">
                                    <div class="row no-gutters align-items-center flex-nowrap">
                                        <i class="icon icon-folder"></i>
                                        <span class="px-3">File Manager</span>
                                    </div>
                                    <i class="icon icon-pin s-5 ml-2"></i>
                                </div>
                            </a>

                            <a class="dropdown-item" href="#">
                                <div class="row no-gutters align-items-center justify-content-between flex-nowrap">
                                    <div class="row no-gutters align-items-center flex-nowrap">
                                        <i class="icon icon-checkbox-marked"></i>
                                        <span class="px-3">To-Do</span>
                                    </div>
                                    <i class="icon icon-pin s-5 ml-2"></i>
                                </div>
                            </a>

                        </div>
                    </div>
                </div>

                <div class="toolbar-separator"></div>

            </div>
        </div>

        <div class="col-auto">

            <div class="row no-gutters align-items-center justify-content-end">

                <div class="user-menu-button dropdown">

                    <div class="dropdown-toggle ripple row align-items-center no-gutters px-2 px-sm-4" role="button"
                         id="dropdownUserMenu"
                         data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <div class="avatar-wrapper">
                            <img class="avatar" src="../assets/images/avatars/profile.jpg">
                            <i class="status text-green icon-checkbox-marked-circle s-4"></i>
                        </div>
                        <span class="username mx-3 d-none d-md-block">John Doe</span>
                    </div>

                    <div class="dropdown-menu" aria-labelledby="dropdownUserMenu">

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <i class="icon-account"></i>
                                <span class="px-3">My Profile</span>
                            </div>
                        </a>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <i class="icon-email"></i>
                                <span class="px-3">Inbox</span>
                            </div>
                        </a>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <i class="status text-green icon-checkbox-marked-circle"></i>
                                <span class="px-3">Online</span>
                            </div>
                        </a>

                        <div class="dropdown-divider"></div>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <i class="icon-logout"></i>
                                <span class="px-3">Logout</span>
                            </div>
                        </a>

                    </div>
                </div>

                <div class="toolbar-separator"></div>

                <button type="button" class="search-button btn btn-icon">
                    <i class="icon icon-magnify"></i>
                </button>

                <div class="toolbar-separator"></div>

                

                <div class="toolbar-separator"></div>

                <button type="button" class="quick-panel-button btn btn-icon"
                        data-fuse-bar-toggle="quick-panel-sidebar">
                    <i class="icon icon-format-list-bulleted"></i>
                </button>

                

            </div>
        </div>
    </div>
</nav>
        

        <div class="content">
            <div id="project-dashboard" class="page-layout simple right-sidebar tabbed">

    <div class="page-content-wrapper">

        <!-- HEADER -->
        <div class="page-header bg-secondary text-auto d-flex flex-column justify-content-between px-6 pt-4 pb-0">

            <div class="row no-gutters align-items-start justify-content-between flex-nowrap">

                <div>
                    <span class="h2">Welcome back, John</span>
                </div>

               
            </div>
        </div>
        <!-- / HEADER -->

        <!-- CONTENT -->
        <div class="page-content">

            <ul class="nav nav-tabs" id="myTab" role="tablist">

                <li class="nav-item">
                    <a class="nav-link btn active" id="home-tab-btn" data-toggle="tab" href="#home-tab-pane" role="tab"
                       aria-controls="home-tab-pane" aria-expanded="true">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link btn" id="demos-tab-btn" data-toggle="tab" href="#demos-tab-pane"
                       role="tab" aria-controls="budget-summary-tab-pane">Demos</a>
                </li>

               
            </ul>

            <div class="tab-content">
                <div class="tab-pane fade show active" id="home-tab-pane" role="tabpanel" aria-labelledby="home-tab">

    <!-- WIDGET GROUP -->
   
        <div class="col-12" id="demos-tab-panel" style="display:none;">

            <div class="example card" >
                <div class="description">
                    <div class="description-text">
                        <h2 id="examples" style="margin-left: 20px;">Sends</h2>
                       
                    </div>
                  
                </div>
                <div class="source-preview-wrapper"><div class="preview"><div class="preview-elements">
                <table class="table">
                    <thead>
                        <tr>
                            <th>Artist</th>
                            <th>Demo name</th>
                            <th>Label</th>
                            <th>Genre</th>
                            <th>Creation date</th>
                            <th>Status</th>
                            <th></th>
                            
                        </tr>
                    </thead>
                    <tbody id="cuerpoTabla">
                       
                       
                    </tbody>
                </table>
                </div></div>
                </div>
            </div>
        </div>
         <div class="widget-group row" id="home-tab-panel">
        <!-- WIDGET 1 -->
        <div class="col-12 col-sm-6 col-xl-3 p-3" >

            <div class="widget widget1 card" >

                <div class="widget-header pl-4 pr-2 row no-gutters align-items-center justify-content-between">

                    <div class="col">

                       
                    </div>

                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>

                </div>

                <div class="widget-content pt-2 pb-8 d-flex flex-column align-items-center justify-content-center">

                    <div class="title text-secondary" id="demosSubidos"><i class="icon-refresh"></i></div>

                    <div class="sub-title h6 text-muted">Demos uploaded</div>

                </div>

                <div class="widget-footer p-4 bg-light row no-gutters align-items-center">

                    <span class="text-muted"></span>

                    <span class="ml-2"></span>

                </div>
            </div>
        </div>
        <!-- / WIDGET 1 -->

        <!-- WIDGET 2 -->
        <div class="col-12 col-sm-6 col-xl-3 p-3">

            <div class="widget widget2 card">

                <div class="widget-header pl-4 pr-2 row no-gutters align-items-center justify-content-between">

                    <div class="col">
                        <span class="h6"></span>
                    </div>

                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>
                </div>

                <div class="widget-content pt-2 pb-8 d-flex flex-column align-items-center justify-content-center">
                    <div class="title text-danger" id="mailsEnviados"><i class="icon-refresh"></i></div>
                    <div class="sub-title h6 text-muted">Delivered mails</div>
                </div>

                <div class="widget-footer p-4 bg-light row no-gutters align-items-center">
                    <span class="text-muted"></span>
                    <span class="ml-2"></span>
                </div>
            </div>
        </div>
        <!-- / WIDGET 2 -->

        <!-- WIDGET 3 -->
        <div class="col-12 col-sm-6 col-xl-3 p-3">

            <div class="widget widget3 card">

                <div class="widget-header pl-4 pr-2 row no-gutters align-items-center justify-content-between">

                    <div class="col">
                        <span class="h6"></span>
                    </div>

                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>

                </div>

                <div class="widget-content pt-2 pb-8 d-flex flex-column align-items-center justify-content-center">
                    <div class="title text-warning" id="mailsAbiertos"><i class="icon-refresh"></i></div>
                    <div class="sub-title h6 text-muted">Opened mails</div>
                </div>

                <div class="widget-footer p-4 bg-light row no-gutters align-items-center">
                    <span class="text-muted"></span>
                    <span class="ml-2"></span>
                </div>
            </div>
        </div>
        <!-- / WIDGET 3 -->

        <!-- WIDGET 4 -->
        <div class="col-12 col-sm-6 col-xl-3 p-3">

            <div class="widget widget4 card">

                <div class="widget-header pl-4 pr-2 row no-gutters align-items-center justify-content-between">

                    <div class="col">
                        <span class="h6"></span>
                    </div>

                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>

                </div>

                <div class="widget-content pt-2 pb-8 d-flex flex-column align-items-center justify-content-center">
                    <div class="title text-info" id="demosEscuchados"><i class="icon-refresh"></i></div>
                    <div class="sub-title h6 text-muted">Listened demos</div>
                </div>

                <div class="widget-footer p-4 bg-light row no-gutters align-items-center">
                    <span class="text-muted"></span>
                    <span class="ml-2"></span>
                </div>
            </div>
        </div>
        <!-- / WIDGET 4 -->

       
    </div>
    <!-- / WIDGET GROUP -->
</div>
             
            
            </div>
        </div>
        <!-- / CONTENT -->
    </div>
</div>
<!--
<script type="text/javascript" src="../assets/js/apps/dashboard/project.js"></script>
 -->


<script>

    var sendeds=[];
var demos=[];


    $("#demos-tab-btn").click(function(){
        $(this).addClass("active");
$("#home-tab-btn").removeClass("active");
    $("#home-tab-panel").hide();
    $("#demos-tab-panel").show("slow");
    

});

  $("#home-tab-btn").click(function(){
$(this).addClass("active");
$("#demos-tab-btn").removeClass("active");
    $("#demos-tab-panel").hide();
     $("#home-tab-panel").show("slow");

});



$(function(){

    $.post("/api/shared",{},function(data){
        sendeds=data;

        cargarDatos();

    });
});


function cargarDatos(){

var cantAbiertos=0;
var cantEscuchados=0;
    sendeds.forEach(function(element,index){
        demos[""+element.demoId+""] =element.demoName;
        if(element.status=="LISTENED")
            cantEscuchados=cantEscuchados+1;
         if(element.status=="OPENED")
            cantAbiertos=cantAbiertos+1;


        var tr = $("<tr/>")

        tr.append("<td>"+element.artist+"</td>");
        tr.append("<td>"+element.demoName+"</td>");
        tr.append("<td>"+element.label+"</td>");
        tr.append("<td>"+element.genre+"</td>");
        tr.append("<td>"+element.creationDate+"</td>");
        tr.append("<td>"+element.status+"</td>");
        tr.append("<td><a href='https://cdn.filestackcontent.com/"+element.pathId+"'><i class='icon-bookmark-music'></i></a></td>");
        $("#cuerpoTabla").append(tr);
    });



    $("#demosSubidos").html(demos.lenght);
    $("#mailsEnviados").html(sendeds.lenght);
    $("#mailsAbiertos").html(cantAbiertos);
    $("#demosEscuchados").html(cantEscuchados);


}




</script>


        </div>
    </div>
   

</#if>
	<#if section = "scripts">
		
	</#if>
</@layout.layout>