B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private dyna As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Import
	vm = pgIndex.vm
	vue = vm.vue
	dyna.Initialize(vue, "dyna", "", Me)
	Dim div As VMElement = vue.CreateDiv("")
	Dim span As VMElement = vue.CreateSpan("")
	span.SetStyleSingle("font-size", "25px")
	span.SetStyleSingle("color", "red")
	span.SetText("Dynamic Component")
	div.AddComponent(span.tostring)
	dyna.AddComponent(div.tostring)
	vue.AddComponent(dyna)
End Sub
