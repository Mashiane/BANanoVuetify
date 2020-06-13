B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public r2 As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub AddRouter
	vm = pgIndex.vm
	vue = vm.vue
	r2.Initialize(vue, "r2", $"/${Main.appname}/r2"$ , Me)
	
	'create a div to house the template
	Dim div As VMElement = vue.CreateDiv("")
	div.SetStyleSingle("border-radius", "20px")
	div.SetStyleSingle("background-color", "green")
	div.SetStyleSingle("width", "200px")
	div.SetStyleSingle("height", "50px")
	div.SetStyleSingle("margin", "10px")
	div.SetStyleSingle("font-size", "25px")
	div.SetStyleSingle("padding", "10px")
	div.SetText("This is router 2")
	r2.SetTemplate(div.tostring)
	vue.AddRoute(r2)
End Sub

