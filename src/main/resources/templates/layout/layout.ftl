<#macro layout>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <title>File Manager</title>

        <!-- STYLESHEETS -->
        <style type="text/css">
            [fuse-cloak],
            .fuse-cloak {
                display: none !important;
            }
        </style>

        <!-- Icons.css -->
        <link type="text/css" rel="stylesheet" href="/assets/icons/fuse-icon-font/style.css">

        <!-- Animate.css -->
        <link type="text/css" rel="stylesheet" href="/assets/vendor/animate.css/animate.min.css">

        <!-- PNotify -->
        <link type="text/css" rel="stylesheet" href="/assets/vendor/pnotify/pnotify.custom.min.css">

        <!-- Nvd3 - D3 Charts -->
        <link type="text/css" rel="stylesheet" href="/assets/vendor/nvd3/build/nv.d3.min.css"/>

        <!-- Perfect Scrollbar -->
        <link type="text/css" rel="stylesheet" href="/assets/vendor/perfect-scrollbar/css/perfect-scrollbar.min.css"/>

        <!-- Fuse Html -->
        <link type="text/css" rel="stylesheet" href="/assets/vendor/fuse-html/fuse-html.min.css"/>

        <!-- Main CSS -->
        <link type="text/css" rel="stylesheet" href="/assets/css/main.css">
        <!-- / STYLESHEETS -->
        <!-- Bootstrap -->
        <script type="text/javascript" src="/assets/vendor/bootstrap/bootstrap.min.js"></script>
        <!-- Popper.js -->
        <script type="text/javascript" src="/assets/vendor/popper.js/index.js"></script>
        <!-- Nvd3 - D3 Charts -->
        <script type="text/javascript" src="/assets/vendor/d3/d3.min.js"></script>
        <script type="text/javascript" src="/assets/vendor/nvd3/build/nv.d3.min.js"></script>

        <!-- Data tables -->
        <script type="text/javascript" src="/assets/vendor/datatables.net/js/jquery.dataTables.min.js"></script>

        <script type="text/javascript" src="/assets/vendor/datatables-responsive/js/dataTables.responsive.js"></script>

        <!-- PNotify -->
        <script type="text/javascript" src="/assets/vendor/pnotify/pnotify.custom.min.js"></script>

        <!-- Fuse Html -->
        <script type="text/javascript" src="/assets/vendor/fuse-html/fuse-html.min.js"></script>

        <!-- Main JS -->
        <script type="text/javascript" src="/assets/js/main.js"></script>	
         <!-- JAVASCRIPT -->

        <!-- jQuery -->
        <script type="text/javascript" src="/assets/vendor/jquery/dist/jquery.min.js"></script>

        <!-- Mobile Detect -->
        <script type="text/javascript" src="/assets/vendor/mobile-detect/mobile-detect.min.js"></script>

        <!-- Perfect Scrollbar -->
        <script type="text/javascript" src="/assets/vendor/perfect-scrollbar/js/perfect-scrollbar.jquery.min.js"></script>

        <!-- / JAVASCRIPT -->
		<#nested "styles">
</head>
<body>
<body class="layout layout-vertical layout-left-navigation layout-below-toolbar">
	<div id="wrapper">
        <aside id="aside" class="aside aside-left"
               data-fuse-bar="aside" data-fuse-bar-media-step="md"
               data-fuse-bar-position="left">
            <div class="aside-content-wrapper">
    <div class="aside-content bg-primary-500 text-auto">
        <div class="aside-toolbar">
            <div class="logo">
                <span class="logo-icon">QD</span><span class="logo-text">QuickDemo</span>
            </div>
            <button id="toggle-fold-aside-button" type="button" class="btn btn-icon d-none d-lg-block"
                    data-fuse-aside-toggle-fold>
                <i class="icon icon-backburger"></i>
            </button>
        </div>
        <ul class="nav flex-column custom-scrollbar" id="sidenav" data-children=".nav-item">
        	<li class="subheader">
        		<span>Dashboard</span>
			</li>
			<li class="nav-item" role="tab" id="heading-dashboards">
			    <a class="nav-link ripple with-arrow collapsed"
			       data-toggle="collapse"
			       data-target="#collapse-dashboards"
			       href="/dashboards-project"
			       aria-expanded="false"
			       aria-controls="collapse-dashboards">
			        <i class="icon s-4 icon-tile-four"></i>
			        <span>Dashboards</span>
			    </a>
    <ul id="collapse-dashboards"
        class="collapse"
        role="tabpanel"
        aria-labelledby="heading-dashboards"
        data-children=".nav-item">
<li class="nav-item">
    <a class="nav-link ripple " href="dashboards-project.html"
       data-page-url="/demo">
        
        <span>Project Dashboard</span>
    </a>
</li>
<li class="nav-item">
    <a class="nav-link ripple " href="dashboards-server.html"
       data-page-url="/demo">
        
        <span>Server</span>
    </a>
</li>
    </ul>
</li>
<li class="nav-item">
    <a class="nav-link ripple" href="demo"
       data-page-url="/demo">
        <i class="icon s-4 icon-folder"></i>
        <span>Demos</span>
    </a>
</li>
<li class="nav-item">
    <a class="nav-link ripple" href="cover"
       data-page-url="/covers">
        <i class="icon s-4 icon-folder"></i>
        <span>Covers</span>
    </a>
</li>
<li class="nav-item">
    <a class="nav-link ripple" href="users.html"
       data-page-url="/demo">
        <i class="icon s-4 icon-account-box"></i>
        <span>Usuarios</span>
    </a>
</li>
        </ul>
    </div>
</div>
        </aside>
	<#nested "content">
	
	<#nested "scripts">
</body>
</html>
</#macro>