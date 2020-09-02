B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12, 15
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
	Public vue As BANanoVue   'ignore
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	'turn off most things
	vm.UseBlankTemplate
	
	'create a generic component
	Dim lblHello As VMElement = vm.NewElement("lblhello","h1", Null, Null, Null, Null, "Hello BANanoNinjas!")
	'add to the page container
	vm.AddElement(lblHello)
	
	vm.ux
	'

End Sub
