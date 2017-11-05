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
                    <div class="add-shortcut-menu-button dropdown px-1 px-sm-3">
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
                            <img class="avatar" src="/assets/images/avatars/profile.jpg">
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
                            <img class="flag mr-2" src="/assets/images/flags/us.png">
                            <span class="d-none d-md-block">EN</span>
                        </div>
                    </div>

                    <div class="dropdown-menu" aria-labelledby="dropdownLanguageMenu">

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <img class="flag" src="/assets/images/flags/us.png">
                                <span class="px-3">English</span>
                            </div>
                        </a>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <img class="flag" src="/assets/images/flags/es.png">
                                <span class="px-3">Spanish</span>
                            </div>
                        </a>

                        <a class="dropdown-item" href="#">
                            <div class="row no-gutters align-items-center flex-nowrap">
                                <img class="flag" src="/assets/images/flags/tr.png">
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
            <div id="contacts" class="page-layout simple left-sidebar-floating">

    <div class="page-header bg-secondary text-auto row no-gutters align-items-center justify-content-between p-4 p-sm-6">

        <div class="col">

            <div class="row no-gutters align-items-center flex-nowrap">

                <button type="button" class="sidebar-toggle-button btn btn-icon d-inline-block d-lg-none mr-2"
                        data-fuse-bar-toggle="contacts-sidebar">
                    <i class="icon icon-menu"></i>
                </button>

                <!-- APP TITLE -->
                <div class="logo row no-gutters align-items-center flex-nowrap">
                    <span class="logo-icon mr-4">
                        <i class="icon-account-box s-6"></i>
                    </span>
                    <span class="logo-text h4">Contacts</span>
                </div>
            </div>
            <!-- / APP TITLE -->
        </div>

        <!-- SEARCH -->
        <div class="col search-wrapper">

            <div class="input-group">

                <span class="input-group-btn">

                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-magnify"></i>
                    </button>

                </span>

                <input id="contacts-search-input" type="text" class="form-control" placeholder="Search for anyone"
                       aria-label="Search for anyone"/>

            </div>
        </div>
        <!-- / SEARCH -->
    </div>
    <!-- / HEADER -->

    <div class="page-content-wrapper">

        <aside class="page-sidebar p-6" data-fuse-bar="contacts-sidebar" data-fuse-bar-media-step="md">
            <div class="page-sidebar-card">
                <!-- SIDENAV HEADER -->
<div class="header p-4">

    <!-- USER -->
    <div class="row no-gutters align-items-center">
        <img class="avatar mr-4" alt="John Doe" src="/assets/images/avatars/profile.jpg">
        <span class="font-weight-bold">John Doe</span>
    </div>
    <!-- / USER -->

</div>
<!-- / SIDENAV HEADER -->

<div class="divider"></div>

<!-- SIDENAV CONTENT -->
<div class="content">

    <ul class="nav flex-column">

        <li class="nav-item">
            <a class="nav-link ripple active" href="#">
                <span>All contacts</span>
            </a>
        </li>

        <li class="nav-item">
            <a class="nav-link ripple" href="#">
                <span>Frequently contacted</span>
            </a>
        </li>

        <li class="nav-item">
            <a class="nav-link ripple" href="#">
                <span>Starred contacts</span>
            </a>
        </li>

        <div class="divider"></div>

        <li class="subheader">Groups</li>

        
            <li class="nav-item">
                <a class="nav-link ripple" href="#">
                    <span class="pl-2">Friends</span>
                </a>
            </li>
        
            <li class="nav-item">
                <a class="nav-link ripple" href="#">
                    <span class="pl-2">Clients</span>
                </a>
            </li>
        
            <li class="nav-item">
                <a class="nav-link ripple" href="#">
                    <span class="pl-2">Recent Workers</span>
                </a>
            </li>
        

        <li class="nav-item">
            <a class="nav-link ripple" href="#">
                <span class="pl-2">New Group</span>
            </a>
        </li>
    </ul>
</div>
<!-- / SIDENAV CONTENT -->
            </div>
        </aside>

        <!-- CONTENT -->
        <div class="page-content p-4 p-sm-6">
            <!-- CONTACT LIST -->
<div class="contacts-list card">

    <!-- CONTACT LIST HEADER -->
    <dvi class="contacts-list-header p-4">

        <div class="row no-gutters align-items-center justify-content-between">

            <div class="list-title text-muted">
                All contacts (25)
            </div>

            <button type="button" class="btn btn-icon">
                <i class="icon icon-sort-alphabetical"></i>
            </button>
        </div>

    </dvi>
    <!-- / CONTACT LIST HEADER -->
        <!-- CONTACT ITEM -->
        <div class="contact-item ripple row no-gutters align-items-center py-2 px-3 py-sm-4 px-sm-6">

            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input"/>
                <span class="custom-control-indicator"></span>
            </label>

            <img class="avatar mx-4" alt="Abbott" src="/assets/images/avatars/Abbott.jpg"/>

            <div class="col text-truncate font-weight-bold"><a href="/profile">Abbott Keitch</a></div>


            <div class="col email text-truncate px-1 d-none d-xl-flex">
                abbott@withinpixels.com
            </div>

            <div class="col phone text-truncate px-1 d-none d-xl-flex">
                +1-202-555-0175
            </div>

            <div class="col job-title text-truncate px-1 d-none d-sm-flex">
                Digital Archivist
            </div>

            <div class="col company text-truncate px-1 d-none d-sm-flex">
                Saois
            </div>

            <div class="col-auto actions">
                <div class="row no-gutters">
                    <button type="button" class="btn btn-icon">
                            <i class="icon-star-outline"></i>
                    </button>
                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>
                </div>
            </div>
        </div>
        <!-- CONTACT ITEM -->
        <!-- CONTACT ITEM -->
        <div class="contact-item ripple row no-gutters align-items-center py-2 px-3 py-sm-4 px-sm-6">

            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input"/>
                <span class="custom-control-indicator"></span>
            </label>

            <img class="avatar mx-4" alt="Barrera" src="/assets/images/avatars/Barrera.jpg"/>

            <div class="col text-truncate font-weight-bold"><a href="/profile">Barrera Bradbury</a></div>


            <div class="col email text-truncate px-1 d-none d-xl-flex">
                barrera@withinpixels.com
            </div>

            <div class="col phone text-truncate px-1 d-none d-xl-flex">
                +1-202-555-0196
            </div>

            <div class="col job-title text-truncate px-1 d-none d-sm-flex">
                Graphic Designer
            </div>

            <div class="col company text-truncate px-1 d-none d-sm-flex">
                Unizim
            </div>
            <div class="col-auto actions">
                <div class="row no-gutters">
                    <button type="button" class="btn btn-icon">
                            <i class="icon-star"></i>
                    </button>
                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>
                </div>
            </div>
        </div>
        <!-- CONTACT ITEM -->
        <!-- CONTACT ITEM -->
        <div class="contact-item ripple row no-gutters align-items-center py-2 px-3 py-sm-4 px-sm-6">
            <label class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input"/>
                <span class="custom-control-indicator"></span>
            </label>
            <img class="avatar mx-4" alt="Velazquez" src="/assets/images/avatars/Velazquez.jpg"/>
            <div class="col text-truncate font-weight-bold"><a href="/profile">Velazquez Smethley</a></div>
            <div class="col email text-truncate px-1 d-none d-xl-flex">
                velezquez@withinpixels.com
            </div>
            <div class="col phone text-truncate px-1 d-none d-xl-flex">
                +1-202-555-0146
            </div>
            <div class="col job-title text-truncate px-1 d-none d-sm-flex">
                Publications Editor
            </div>
            <div class="col company text-truncate px-1 d-none d-sm-flex">
                ranex
            </div>
            <div class="col-auto actions">
                <div class="row no-gutters">
                    <button type="button" class="btn btn-icon">
                            <i class="icon-star-outline"></i>
                    </button>
                    <button type="button" class="btn btn-icon">
                        <i class="icon icon-dots-vertical"></i>
                    </button>
                </div>
            </div>
        </div>
        <!-- CONTACT ITEM -->
    
</div>
<!-- / CONTACT LIST -->
        </div>
        <!-- / CONTENT -->
    </div>
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