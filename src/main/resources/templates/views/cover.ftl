<@layout.layout; section>	
	<#if section = "styles">
		
	</#if>
	<#if section = "content">	

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

                <div class="language-button dropdown">

                    <div
                        class="dropdown-toggle ripple row align-items-center justify-content-center no-gutters px-0 px-sm-4"
                        role="button"
                        id="dropdownLanguageMenu"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <div class="row no-gutters align-items-center">
                            <img class="flag mr-2" src="../assets/images/flags/us.png">
                            <span class="d-none d-md-block">EN</span>
                        </div>
                    </div>

                    <div class="dropdown-menu" aria-labelledby="dropdownLanguageMenu">

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <img class="flag" src="../assets/images/flags/us.png">
                                <span class="px-3">English</span>
                            </div>
                        </a>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <img class="flag" src="../assets/images/flags/es.png">
                                <span class="px-3">Spanish</span>
                            </div>
                        </a>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <img class="flag" src="../assets/images/flags/tr.png">
                                <span class="px-3">Turkish</span>
                            </div>
                        </a>
                    </div>
                </div>

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
            <div id="file-manager" class="page-layout simple right-sidebar">

    <div class="page-content-wrapper">

        <!-- HEADER -->
        <div class="page-header bg-secondary text-auto p-6">

            <!-- HEADER CONTENT-->
            <div class="header-content d-flex flex-column justify-content-between">

                <!-- TOOLBAR -->
                <div class="toolbar row no-gutters justify-content-between">

                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-menu"></i>
                    </button>

                    <div class="right-side row no-gutters">

                        <button type="button" class="btn btn-icon">
                            <i class="icon icon-magnify"></i>
                        </button>

                        <button type="button" class="btn btn-icon">
                            <i class="icon icon-view-module"></i>
                        </button>

                    </div>

                </div>
                <!-- / TOOLBAR -->

                <!-- BREADCRUMB -->
                <div class="breadcrumb text-truncate row no-gutters align-items-center pl-0 pl-sm-20">

                    <span class="h4">My Files</span>

                    <i class="icon-chevron-right separator"></i>

                    <span class="h4">Documents</span>

                </div>
                <!-- / BREADCRUMB -->

            </div>
            <!-- / HEADER CONTENT -->

            <!-- ADD FILE BUTTON -->
            <button id="add-file-button" type="button" class="btn btn-danger btn-fab" aria-label="Add file">
                <i class="icon icon-plus"></i>
            </button>
            <!-- / ADD FILE BUTTON -->

        </div>
        <!-- / HEADER -->

        <!-- CONTENT -->
        <div class="page-content">
            <!-- LIST VIEW -->
<table class="table list-view">

    <thead>

        <tr>
            <th></th>
            <th>Name</th>
            <th class="d-none d-md-table-cell">Type</th>
            <th class="d-none d-sm-table-cell">Owner</th>
            <th class="d-none d-sm-table-cell">Size</th>
            <th class="d-none d-lg-table-cell">Last Modified</th>
            <th class="d-table-cell d-xl-none"></th>
        </tr>

    </thead>

    <tbody>

        

            <tr>

                <td class="file-icon">
                    <i class="icon-folder"></i>
                </td>
                <td class="name">Work Documents</td>
                <td class="type d-none d-md-table-cell">folder</td>
                <td class="owner d-none d-sm-table-cell">me</td>
                <td class="size d-none d-sm-table-cell"></td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>

        

            <tr>

                <td class="file-icon">
                    <i class="icon-folder"></i>
                </td>
                <td class="name">Public Documents</td>
                <td class="type d-none d-md-table-cell">folder</td>
                <td class="owner d-none d-sm-table-cell">public</td>
                <td class="size d-none d-sm-table-cell"></td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>

        

            <tr>

                <td class="file-icon">
                    <i class="icon-folder"></i>
                </td>
                <td class="name">Private Documents</td>
                <td class="type d-none d-md-table-cell">folder</td>
                <td class="owner d-none d-sm-table-cell">me</td>
                <td class="size d-none d-sm-table-cell"></td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>

        

        

            <tr>

                <td class="file-icon">
                    <i class="icon-document"></i>
                </td>
                <td class="name">Ongoing projects</td>
                <td class="type d-none d-md-table-cell">document</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">1.2 Mb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-document"></i>
                </td>
                <td class="name">Shopping list</td>
                <td class="type d-none d-md-table-cell">document</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">980 Kb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-spreadsheet"></i>
                </td>
                <td class="name">Invoices</td>
                <td class="type d-none d-md-table-cell">spreadsheet</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">750 Kb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-document"></i>
                </td>
                <td class="name">Crash logs</td>
                <td class="type d-none d-md-table-cell">document</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">980 Mb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-document"></i>
                </td>
                <td class="name">System logs</td>
                <td class="type d-none d-md-table-cell">document</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">52 Kb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-spreadsheet"></i>
                </td>
                <td class="name">Prices</td>
                <td class="type d-none d-md-table-cell">spreadsheet</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">27 Mb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-document"></i>
                </td>
                <td class="name">Anabelle Manual</td>
                <td class="type d-none d-md-table-cell">document</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">1.1 Kb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        

            <tr>

                <td class="file-icon">
                    <i class="icon-spreadsheet"></i>
                </td>
                <td class="name">Steam summer sale budget</td>
                <td class="type d-none d-md-table-cell">spreadsheet</td>
                <td class="owner d-none d-sm-table-cell">Emily Bennett</td>
                <td class="size d-none d-sm-table-cell">505 Kb</td>
                <td class="last-modified d-none d-lg-table-cell">July 8, 2015</td>
                <td class="d-table-cell d-xl-none">
                    <button type="button" class="btn btn-icon" data-fuse-bar-toggle="file-manager-info-sidebar">
                        <i class="icon icon-information-outline"></i>
                    </button>
                </td>

            </tr>
        
    </tbody>
</table>
<!-- / LIST VIEW -->
        </div>
        <!-- / CONTENT -->

    </div>

    <aside class="page-sidebar" data-fuse-bar="file-manager-info-sidebar" data-fuse-bar-position="right"
           data-fuse-bar-media-step="lg">
        <!-- SIDEBAR HEADER -->
<div class="sidebar-header bg-secondary text-auto d-flex flex-column justify-content-between p-6">

    <!-- TOOLBAR -->
    <div class="toolbar row no-gutters align-items-center justify-content-end">

        <button type="button" class="btn btn-icon">
            <i class="icon-delete"></i>
        </button>

        <button type="button" class="btn btn-icon">
            <i class="icon icon-download"></i>
        </button>

        <button type="button" class="btn btn-icon">
            <i class="icon icon-dots-vertical"></i>
        </button>

    </div>
    <!-- / TOOLBAR -->

    <!-- INFO -->
    <div>

        <div class="title mb-2">Work Documents</div>

        <div class="subtitle text-muted"><span>Edited</span>: May 8, 2017</div>

    </div>
    <!-- / INFO-->

</div>
<!-- / SIDEBAR HEADER -->

<!-- SIDENAV CONTENT -->
<div class="sidebar-content">

    <div class="file-details">

        <div class="preview file-icon row align-items-center justify-content-center">
            <i class="icon-folder s-12"></i>
        </div>

        <div class="offline-switch row no-gutters align-items-center justify-content-between px-6 py-4">

            <span>Available Offline</span>

            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" aria-label="Toggle offline"/>
                <span class="custom-control-indicator"></span>
            </label>

        </div>

        <div class="title px-6 py-4">Info</div>

        <table class="table">

            <tr class="type">
                <th class="pl-6">Type</th>
                <td>Folder</td>
            </tr>

            <tr class="size">
                <th class="pl-6">Size</th>
                <td>-</td>
            </tr>

            <tr class="location">
                <th class="pl-6">Location</th>
                <td>My Files > Documents</td>
            </tr>

            <tr class="owner">
                <th class="pl-6">Owner</th>
                <td>Me</td>
            </tr>

            <tr class="modified">
                <th class="pl-6">Modified</th>
                <td>April 8, 2017</td>
            </tr>

            <tr class="opened">
                <th class="pl-6">Opened</th>
                <td>April 8, 2017</td>
            </tr>

            <tr class="created">
                <th class="pl-6">Created</th>
                <td>April 8, 2017</td>
            </tr>
        </table>
    </div>
</div>
<!-- / SIDENAV CONTENT -->
    </aside>
</div>
        </div>

    </div>

    

    <div class="quick-panel-sidebar" fuse-cloak data-fuse-bar="quick-panel-sidebar" data-fuse-bar-position="right">
        <div class="list-group" class="date">

    <div class="list-group-item subheader">TODAY</div>

    <div class="list-group-item two-line">

        <div class="text-muted">

            <div class="h1"> Monday</div>

            <div class="h2 row no-gutters align-items-start">
                <span> 18</span>
                <span class="h6">th</span>
                <span> Sep</span>
            </div>

        </div>
    </div>
</div>

<div class="divider"></div>

<div class="list-group">

    <div class="list-group-item subheader">Events</div>

    

        <div class="list-group-item two-line">

            <div class="list-item-content">

                <h3>Group Meeting</h3>

                <p>In 32 Minutes, Room 1B</p>
            </div>

        </div>
    

        <div class="list-group-item two-line">

            <div class="list-item-content">

                <h3>Public Beta Release</h3>

                <p>11:00 PM</p>
            </div>

        </div>
    

        <div class="list-group-item two-line">

            <div class="list-item-content">

                <h3>Dinner with David</h3>

                <p>17:30 PM</p>
            </div>

        </div>
    

        <div class="list-group-item two-line">

            <div class="list-item-content">

                <h3>Q&A Session</h3>

                <p>20:30 PM</p>
            </div>

        </div>
    
</div>

<div class="divider"></div>

<div class="list-group">

    <div class="list-group-item subheader">Notes</div>

    

        <div class="list-group-item two-line">

            <div class="list-item-content">

                <h3>Best songs to listen while working</h3>

                <p>Last edit: May 8th, 2015</p>
            </div>

        </div>
    

        <div class="list-group-item two-line">

            <div class="list-item-content">

                <h3>Useful subreddits</h3>

                <p>Last edit: January 12th, 2015</p>
            </div>

        </div>
    
</div>

<div class="divider"></div>

<div class="list-group">

    <div class="list-group-item subheader">Quick Settings</div>

    <div class="list-group-item">

        <div class="list-item-content">
            <h3>Notifications</h3>
        </div>

        <div class="secondary-container">
            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input"/>
                <span class="custom-control-indicator"></span>
            </label>
        </div>

    </div>

    <div class="list-group-item">

        <div class="list-item-content">
            <h3>Cloud Sync</h3>
        </div>

        <div class="secondary-container">
            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input"/>
                <span class="custom-control-indicator"></span>
            </label>
        </div>

    </div>

    <div class="list-group-item">

        <div class="list-item-content">
            <h3>Retro Thrusters</h3>
        </div>

        <div class="secondary-container">

            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input"/>
                <span class="custom-control-indicator"></span>
            </label>

        </div>
    </div>
</div>
    </div>
</div>
	</#if>
	<#if section = "scripts">
		
	</#if>
</@layout.layout>