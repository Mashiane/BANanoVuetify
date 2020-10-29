B4J=true
Group=Default Group\Components
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "homehero"
	Public homehero As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	homehero.Initialize(vue, name, $"/${name}"$, Me)
	'
	Dim cont As VMContainer = vm.CreateContainer("", Me)
	cont.SetFluid(True)
	cont.SetFillHeight(True)
	cont.SetCoverImage("./assets/homeimage.jpg")
	cont.SetStyleSingle("max-height", "100vh")
	
	'add 1 row with 1 column
	cont.AddRows(1).AddColumns12
	cont.SetJustifyRC(1, 1, vm.JUSTIFY_CENTER)
	cont.SetAlignRC(1, 1, vm.ALIGN_CENTER)
	cont.AddClassRC(1, 1, Array("pa-5"))
	'
	Dim div1 As VMElement = vm.Div("")
	div1.SetStatic(True)
	div1.AddClass("display-4 font-weight-black white--text text-xs-center").SetText("HEALTHY MEALS")
    cont.AddComponent(1, 1, div1.ToString)
	'
	Dim div2 As VMElement = vm.div("")
	div2.SetStatic(True)
	div2.AddClass("display-4 font-weight-black white--text text-xs-center mb-3").SetText("FOR YOUR TABLE")
	cont.AddComponent(1, 1, div2.ToString)
	'
	Dim div3 As VMElement = vm.div("")
	div3.SetStatic(True)
	div3.AddClass("display-1 font-weight-bold white--text text-xs-center")
	div3.SetText("Finally be a foodie at home with fresh, chef-prepared meals delivered daily To YOUR door.")
	cont.AddComponent(1, 1, div3.ToString)
	'
	Dim btn As VMElement = vm.VBtn("")
	btn.SetStatic(True)
	btn.SetAttrSingle("fab", True).AddClass("mt-5 brown darken-4")
	btn.AddElement1("v-icon", "", "mdi-chevron-down", CreateMap("large": True, "color":"white"), Null, Null, Null)
	cont.AddComponent(1, 1, btn.ToString)
	
	'the row column matrix should be visible, added in case you want to hide
	'in future this will be removed but for now its necessary
	
	homehero.SetData("r1show", True)
	homehero.setdata("r1c1show", True)
	
	'set the template
	Dim sout As String = cont.tostring
	homehero.SetTemplate(sout)
End Sub
