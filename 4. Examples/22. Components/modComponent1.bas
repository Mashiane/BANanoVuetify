B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private comp1 As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Import
	vm = pgIndex.vm
	vue = vm.vue
	comp1.Initialize(vue, "comp1", "",  Me)
	
	'create a div to house the template
	Dim div As VMElement = vue.CreateDiv("")
	'create an h1 with a data element
	Dim h1 As VMElement = vue.CreateH1("")
	h1.SetText("This is coming from the component 1, create by {{ name }}!")
	'add a mouseover event
	h1.SetEvent("@mouseover",  "changename")
	h1.SetEvent("@mouseout",  "original")
	'add h1 to template
	div.AddComponent(h1.tostring)
	'set the overall template
	comp1.SetTemplate(div.tostring)
	'set the state of the element we are using, this will be reactive
	comp1.SetData("name", "Mashy")
	'add to methods
	comp1.SetMethod(Me, "original")
	'add to methods
	comp1.SetMethod(Me, "changename")
		
	'add component to vue
	vue.AddComponent(comp1)
End Sub

Sub changename
	comp1.SetData("name", "Ben")
End Sub

Sub original
	comp1.setdata("name", "Mashy")
End Sub