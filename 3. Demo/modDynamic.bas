B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "dynamicCode"
	Public title As String = "Dynamic"
	Private vm As BANanoVM
End Sub

Sub Code
	vm = pgIndex.vm
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	cont.AddRows(1).AddColumns12
	
	'create the component
	Dim mt As VMElement = vm.CreateElement("htmlcode", "div")
	mt.SetTemplate($"<div><slot></slot></div>"$)
	vm.AddComponent(mt)

	Dim btn As VMButton = vm.CreateButton("btnOkx", Me)
	'btn.SetStatic(True)
	'btn.SetDesignMode(True)
	btn.SetLabel("Dynamic Button")
	btn.SetColor("primary")
	
	vm.setdata("template", $"<htmlcode>${btn.tostring}</htmlcode>"$)
	'
	Dim vrt As VMElement = vm.CreateElement("vrt1", "v-runtime-template")
	vrt.SetAttrSingle(":template", "template")
	cont.AddComponent(1,1, vrt.tostring)
	
	'vm.SetComputed("dynamic", Me, "dynamicComponent")
	
	'Dim comp As VMElement = vm.CreateComponent("it").SetAttrSingle("v-bind:is", "dynamic")
	'cont.AddComponent(1, 1, comp.tostring)
	
	'add container to page
	vm.AddContainer(cont)

End Sub

Sub dynamicComponent As Map
	'get the html data
	Dim html As String = vm.getdata("htmlcontent")
	Dim htmlr As String = $"<div>${html}</div>"$
	Dim obj As Map = CreateMap()
	obj.put("template", htmlr)
	vm.setdata("dynamic", obj)
	Return obj
End Sub