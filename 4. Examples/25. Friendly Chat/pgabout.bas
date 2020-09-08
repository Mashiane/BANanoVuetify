B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private about As VMComponent
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub


'build the page
Sub Initialize
	vm = pgIndex.vm
	vue = pgIndex.vue
	'initialize the component, the name of the component is 'about'
	about.Initialize(vue, "about", "/about", Me)
	
	'create a container
	Dim aboutcont As VMContainer
	aboutcont.Initialize(vue, "aboutcont", Me)
	aboutcont.UseVShow = False
	aboutcont.AddRows(1).AddColumns12
	'build the HTLML content of the page
	Dim abouth1 As VMLabel = vm.CreateH1("").SetText("This is the about page...")
	abouth1.AddToContainer(aboutcont, 1, 1)
	
	'there should be 1 root element
	about.AddContainer(aboutcont)
	
	'add the component as a router/page
	vm.AddRoute(about)
End Sub
