B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private comp2 As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Import
	vm = pgIndex.vm
	vue = vm.vue
	comp2.Initialize(vue, "comp2", "", Me)
	
	Dim div As VMElement = vue.CreateDiv("")
	'
	Dim h2 As VMElement = vue.CreateH2("").SetText("This is coming from the component 2!")
	'
	div.AddComponent(h2.tostring)
	'
	comp2.SetTemplate(div.tostring)
	'
	vue.AddComponent(comp2)
End Sub
