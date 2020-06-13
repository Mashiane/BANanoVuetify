B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public r1 As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub AddRouter
	vm = pgIndex.vm
	vue = vm.vue
	r1.Initialize(vue, "r1", $"/${Main.appname}/r1"$, Me)
	
	'create a div to house the template
	Dim div As VMElement = vue.CreateDiv("")
	div.SetStyleSingle("border-radius", "20px")
	div.SetStyleSingle("background-color", "cyan")
	div.SetStyleSingle("width", "200px")
	div.SetStyleSingle("height", "50px")
	div.SetStyleSingle("margin", "10px")
	div.SetStyleSingle("font-size", "25px")
	div.SetStyleSingle("padding", "10px")
	div.SetText("This is router 1")
	r1.SetTemplate(div.tostring)
	vue.AddRoute(r1)
End Sub

