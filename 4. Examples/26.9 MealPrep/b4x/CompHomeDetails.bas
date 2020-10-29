B4J=true
Group=Default Group\Components
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "homedetails"
	Public homedetails As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	homedetails.Initialize(vue, name, $"/${name}"$, Me)
	'
	Dim cont As VMContainer = vm.CreateContainer("", Me)
	cont.SetFluid(True)
	cont.AddClass("brown lighten-4")
	'
	Dim cont1 As VMContainer = vm.CreateContainer("", Me).SetGridListLG
	'build a lorem ipsum string
	Dim loremipsum As String = BANanoShared.LoremIpsum(1)
	
	Dim vlay As VMElement = vm.vlayout("")
	vlay.SetStatic(True)
	vlay.SetColumn
	vlay.AddElement1("v-flex", "", "How it works", Null, Null, Array("display-2 font-weight-black brown--text text-xs-center my-5"), Null)
	
	Dim vf1 As VMElement = vm.vflex("")
	vf1.SetStatic(True)
	vf1.AddElement1("div", "", "Lorem ipsum", Null, Null, Array("headline mt-3 brown--text font-weight-bold"), Null)
	vf1.AddElement1("p", "", loremipsum, Null, Null, Array("subheading mt-3"), Null)
	vlay.AddComponent(vf1.tostring)
	'
	Dim vf2 As VMElement = vm.vflex("")
	vf2.SetStatic(True)
	vf2.AddElement1("div", "", "Lorem ipsum", Null, Null, Array("headline mt-3 brown--text font-weight-bold"), Null)
	vf2.AddElement1("p", "", loremipsum, Null, Null, Array("subheading mt-3"), Null)
	vf2.AddElement1("p", "", loremipsum, Null, Null, Array("subheading mt-3"), Null)
	vf2.AddElement1("p", "", loremipsum, Null, Null, Array("subheading mt-3"), Null)
	vlay.AddComponent(vf2.tostring)
	'
	Dim vf3 As VMElement = vm.vflex("")
	vf3.SetStatic(True)
	vf3.AddElement1("div", "", "Lorem ipsum", Null, Null, Array("headline mt-3 brown--text font-weight-bold"), Null)
	vf3.AddElement1("p", "", loremipsum, Null, Null, Array("subheading mt-3"), Null)
	vlay.AddComponent(vf3.tostring)
	
	cont1.AddComponent(0, 0, vlay.tostring)
	'
	cont.AddComponent(0, 0, cont1.tostring)
	Dim sout As String = cont.ToString
	'set the template
	homedetails.SetTemplate(sout)
End Sub
