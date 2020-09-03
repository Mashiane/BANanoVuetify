B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private home As VMComponent
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub

'build the page
Sub Initialize
	vm = pgIndex.vm
	vue = pgIndex.vue
	
	'initialize the component,  the name of the component is 'home'
	home.Initialize(vue, "home", "/", Me)
	
	'create a container
	Dim homecont As VMContainer
	homecont.Initialize(vue, "homecont", Me)
	homecont.UseVShow = False
	homecont.AddRows(1).AddColumns12
	'build the HTLML content of the page
	Dim homeh1 As VMLabel = vm.CreateH1("").SetText("This is the home page...")
	homeh1.AddToContainer(homecont, 1, 1)
	
	'there should be 1 root element
	home.AddContainer(homecont)
	
	'add the component as a router/page
	vm.AddRoute(home)
End Sub
