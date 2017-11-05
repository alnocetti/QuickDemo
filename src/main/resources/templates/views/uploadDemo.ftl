<@layout.layout; section>	
	<#if section = "styles">
		
	</#if>
	<#if section = "content">	
	<div class="content">
		<div class="page-layout carded full-width">
		<div class="top-bg bg-primary"></div>
		<!-- CONTENT -->
	    <div class="page-content">
		<!-- HEADER -->
		<div class="header py-6 bg-primary text-auto">
			<span class="h3">Mi primer Demo</span>
	    </div>
		<!-- / HEADER -->
		<div class="page-content-card">
			            <!-- CONTENT TOOLBAR -->
			            <div class="toolbar p-6">Contenido de mi Demo</div>
			            <!-- / CONTENT TOOLBAR -->
			            <div class="p-6">
			                <!-- DEMO CONTENT -->
			                <div class="demo-content">
			                <div class="card w-100 mb-4" style="width: 30rem;">
							    <img class="card-img-top" src="assets/images/placeholder.png" alt="Card image cap"/>
							    <div class="card-body">
							        <h4 class="card-title">Card title</h4>
							        <p class="card-text">Some quick example text to build on the card title and make up the bulk of
							            the card's content.</p>
							    </div>
							</div>
						    <h1>Subir mi primer Demo</h1>
						    <h4 class="secondary-text">Demo Content</h4>
							<form>
							    <div class="form-group">
							        <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
							               placeholder="Nombre de la pista">
							        <label for="exampleInputEmail1">Ingresa el nombre del demo</label>
							        <small id="emailHelp" class="form-text text-muted">Puede ingresar el nombre de tu pista o demo</small>
							    </div>
							    <div class="form-group">
							        <label for="exampleFormControlSelect1">Example select</label>
							        <select class="form-control" id="exampleFormControlSelect1">
							            <option>1</option>
							            <option>2</option>
							            <option>3</option>
							            <option>4</option>
							            <option>5</option>
							        </select>
							    </div>
							    <div class="form-group">
							        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
							        <label for="exampleFormControlTextarea1">Example textarea</label>
							    </div>
							    <div class="form-group">
							        <label for="exampleFormControlFile1">Example file input</label>
							        <input type="file" class="form-control-file" id="exampleFormControlFile1">
							    </div>
							    <button type="submit" class="btn btn-primary">Subir</button>
							</form>
						</div>
			            <!-- / DEMO CONTENT -->
			            </div>
			        </div>
			    </div>
			    <!-- / CONTENT -->
			</div>
        </div>
    </#if>
	<#if section = "scripts">
		
	</#if>
</@layout.layout>